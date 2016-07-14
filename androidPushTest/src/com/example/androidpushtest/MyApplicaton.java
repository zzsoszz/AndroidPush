package com.example.androidpushtest;

import org.litepal.LitePalApplication;

public class MyApplicaton extends LitePalApplication {

	private static MyApplicaton instance;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}

	public static MyApplicaton getInstance() {
		if (null == instance) {
			synchronized (MyApplicaton.class) {
				instance = new MyApplicaton();
			}
		}
		return instance;
	}

}
