package org.apache.jsp.WEB_002dINF.pages.notification;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/includes/taglibs.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"/error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Admin Console</title>\r\n");
      out.write("<meta name=\"menu\" content=\"notification\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<h1>Send Notifications</h1>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<div style=\"margin:20px 0px;\">\r\n");
      out.write("\t\t<form action=\"notification.do?action=send\" method=\"post\"\r\n");
      out.write("\t\t\tstyle=\"margin: 0px;\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t<table width=\"600\" cellpadding=\"4\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"20%\">To:</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"80%\"><input type=\"radio\" name=\"broadcast\" value=\"0\"\r\n");
      out.write("\t\t\t\t\t\tchecked=\"checked\" /> All (Broadcast) <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\tname=\"broadcast\" value=\"1\" /> By Username <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\tname=\"broadcast\" value=\"2\" /> By Alias <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\tname=\"broadcast\" value=\"3\" /> By Tag</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr id=\"trUsername\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t<td>Username:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"username\" name=\"username\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width:380px;\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr id=\"trAlias\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t<td>Alias:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"alias\" name=\"alias\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width:380px;\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr id=\"trTag\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t<td>Tag:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"tag\" name=\"tag\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width:380px;\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Title:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"title\" name=\"title\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"Dokdo Island\" style=\"width:380px;\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Message:</td>\r\n");
      out.write("\t\t\t\t\t<td><textarea id=\"message\" name=\"message\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width:380px; height:80px;\">Dokdo is a Korean island, the far east of the Korean territory. No doubt! No question! Don't mention it any more!</textarea>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>URI:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"uri\" name=\"uri\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width:380px;\" /> <br /> <span style=\"font-size:0.8em\">ex)\r\n");
      out.write("\t\t\t\t\t\t\thttp://www.dokdocorea.com, geo:37.24,131.86, tel:111-222-3333</span></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Image:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"file\" id=\"image\" name=\"image\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width:380px;\" /> <br /> <span style=\"font-size:0.8em\">only\r\n");
      out.write("\t\t\t\t\t\t\timage file is valid</span></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" value=\"Submit\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t//         \r\n");
      out.write("\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$('input[name=broadcast]').click(function() {\r\n");
      out.write("\t\t\t\tif ($('input[name=broadcast]')[0].checked) {\r\n");
      out.write("\t\t\t\t\t$('#trUsername').hide();\r\n");
      out.write("\t\t\t\t\t$('#trAlias').hide();\r\n");
      out.write("\t\t\t\t\t$('#trTag').hide();\r\n");
      out.write("\t\t\t\t} else if ($('input[name=broadcast]')[1].checked) {\r\n");
      out.write("\t\t\t\t\t$('#trUsername').show();\r\n");
      out.write("\t\t\t\t\t$('#trAlias').hide();\r\n");
      out.write("\t\t\t\t\t$('#trTag').hide();\r\n");
      out.write("\t\t\t\t} else if ($('input[name=broadcast]')[2].checked) {\r\n");
      out.write("\t\t\t\t\t$('#trUsername').hide();\r\n");
      out.write("\t\t\t\t\t$('#trAlias').show();\r\n");
      out.write("\t\t\t\t\t$('#trTag').hide();\r\n");
      out.write("\t\t\t\t} else if ($('input[name=broadcast]')[3].checked) {\r\n");
      out.write("\t\t\t\t\t$('#trUsername').hide();\r\n");
      out.write("\t\t\t\t\t$('#trAlias').hide();\r\n");
      out.write("\t\t\t\t\t$('#trTag').show();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\tif ($('input[name=broadcast]')[0].checked) {\r\n");
      out.write("\t\t\t\t$('#trUsername').hide();\r\n");
      out.write("\t\t\t\t$('#trAlias').hide();\r\n");
      out.write("\t\t\t\t$('#trTag').hide();\r\n");
      out.write("\t\t\t} else if ($('input[name=broadcast]')[1].checked) {\r\n");
      out.write("\t\t\t\t$('#trUsername').show();\r\n");
      out.write("\t\t\t\t$('#trAlias').hide();\r\n");
      out.write("\t\t\t\t$('#trTag').hide();\r\n");
      out.write("\t\t\t} else if ($('input[name=broadcast]')[2].checked) {\r\n");
      out.write("\t\t\t\t$('#trUsername').hide();\r\n");
      out.write("\t\t\t\t$('#trAlias').show();\r\n");
      out.write("\t\t\t\t$('#trTag').hide();\r\n");
      out.write("\t\t\t} else if ($('input[name=broadcast]')[3].checked) {\r\n");
      out.write("\t\t\t\t$('#trUsername').hide();\r\n");
      out.write("\t\t\t\t$('#trAlias').hide();\r\n");
      out.write("\t\t\t\t$('#trTag').show();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t//\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
