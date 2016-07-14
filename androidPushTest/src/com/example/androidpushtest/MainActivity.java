package com.example.androidpushtest;

import org.androidpn.client.ServiceManager;
import org.androidpn.demoapp.DemoAppActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,
						DemoAppActivity.class);
				startActivity(intent);
//				ServiceManager serviceManager = new ServiceManager(MainActivity.this);
//				serviceManager.setNotificationIcon(R.drawable.notification);
//				serviceManager.startService();
			}
		});
	}
}
