package org.androidpn.server.xmpp.handler;

import org.androidpn.server.xmpp.UnauthorizedException;
import org.androidpn.server.xmpp.session.ClientSession;
import org.androidpn.server.xmpp.session.Session;
import org.androidpn.server.xmpp.session.SessionManager;
import org.dom4j.Element;
import org.xmpp.packet.IQ;
import org.xmpp.packet.PacketError;

public class IQSetTagsHandler extends IQHandler {

	private static final String NAMESPACE = "androidpn:iq:settags";

	private SessionManager sessionManager;

	public IQSetTagsHandler() {
		sessionManager = SessionManager.getInstance();
	}

	@Override
	public IQ handleIQ(IQ packet) throws UnauthorizedException {
		IQ reply = null;
		ClientSession session = sessionManager.getSession(packet.getFrom());
		if (session == null) {
			log.error("Session not found for key " + packet.getFrom());
			reply = IQ.createResultIQ(packet);
			reply.setChildElement(packet.getChildElement().createCopy());
			reply.setError(PacketError.Condition.internal_server_error);
			return reply;
		}
		if (session.getStatus() == Session.STATUS_AUTHENTICATED) {
			if (IQ.Type.set.equals(packet.getType())) {
				Element element = packet.getChildElement();
				String username = element.elementText("username");
				String tagStr = element.elementText("tags");
				String[] tagsArray = tagStr.split(",");
				if (tagsArray != null && tagsArray.length > 0) {
					for (String tag : tagsArray) {
						sessionManager.setUserTag(username, tag);
					}
					System.out.println("set usernametags successfully");
				}

			}
		}
		return null;
	}

	@Override
	public String getNamespace() {
		// TODO Auto-generated method stub
		return NAMESPACE;
	}

}
