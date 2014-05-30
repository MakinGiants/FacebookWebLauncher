package com.makingiants.android.fblauncher;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class LaunchActivity extends Activity {

	private final static String URL = "https://m.facebook.com";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_launch);

		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse(URL));
		startActivity(intent);
		
		this.finish();
	}
}
