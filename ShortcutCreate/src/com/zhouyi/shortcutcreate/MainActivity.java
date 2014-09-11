package com.zhouyi.shortcutcreate;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

//		// Add listener to create shortcut button
//		Button create = (Button) findViewById(R.id.btIdCreate);
//		create.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				createShortcut();
//			}
//		});
//
//		// Add listener to remove shortcut button
//		Button remove = (Button) findViewById(R.id.btIdRemove);
//		remove.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				removeShortcut();
//			}
//		});
	}
	public void createShortcut(View view) {
		// Create shortcut for MainActivity
		// on Home screen
		Intent shortcutIntent = new Intent(getApplicationContext(),
				MainActivity.class);
		shortcutIntent.setAction(Intent.ACTION_MAIN);

		Intent createIntent = new Intent();
		createIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
		createIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "shortcutDemo");
		createIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE,
				Intent.ShortcutIconResource.fromContext(
						getApplicationContext(), R.drawable.ic_launcher));

		createIntent
				.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
		getApplicationContext().sendBroadcast(createIntent);
	}

	public void removeShortcut(View view) {
		// Remove shortcut for MainActivity
		// on Home screen
		 Intent shortcutIntent = new Intent(getApplicationContext(),
		 MainActivity.class);
		 shortcutIntent.setAction(Intent.ACTION_MAIN);
		
		 Intent removeIntent = new Intent();
		 removeIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
		 removeIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "shortcutDemo");
		
		 removeIntent.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
		 getApplicationContext().sendBroadcast(removeIntent);
	}
//	private void createShortcut() {
//		// Create shortcut for MainActivity
//		// on Home screen
//		Intent shortcutIntent = new Intent(getApplicationContext(),
//				MainActivity.class);
//		shortcutIntent.setAction(Intent.ACTION_MAIN);
//
//		Intent createIntent = new Intent();
//		createIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
//		createIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "shortcutDemo");
//		createIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE,
//				Intent.ShortcutIconResource.fromContext(
//						getApplicationContext(), R.drawable.ic_launcher));
//
//		createIntent
//				.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
//		getApplicationContext().sendBroadcast(createIntent);
//	}
//
//	private void removeShortcut() {
//		// Remove shortcut for MainActivity
//		// on Home screen
//		 Intent shortcutIntent = new Intent(getApplicationContext(),
//		 MainActivity.class);
//		 shortcutIntent.setAction(Intent.ACTION_MAIN);
//		
//		 Intent removeIntent = new Intent();
//		 removeIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
//		 removeIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "shortcutDemo");
//		
//		 removeIntent.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
//		 getApplicationContext().sendBroadcast(removeIntent);
//	}
}
