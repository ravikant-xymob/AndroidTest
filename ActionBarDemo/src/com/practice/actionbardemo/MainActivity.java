package com.practice.actionbardemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		 return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch (item.getItemId()) {
        case R.id.search_button:
            openSearch();
            return true;
        case R.id.help_button:
            openHelp();
            return true;
        case R.id.action_settings:
            openSettings();
            return true;
        case R.id.light_theme_activity_item:
        	openLightActivity();
        	return true;
        case R.id.overlay_activity_item:
        	openOverlayActivity();
        	return true;
        default:
            return super.onOptionsItemSelected(item);
    }
}
	public void openSearch(){
		int duration=Toast.LENGTH_SHORT;
		Toast.makeText(this,"search clicked", duration).show();
	}
	public void openHelp(){
		Intent intent=new Intent(this,HelpActivity.class);
		startActivity(intent);
	}
	public void openSettings(){}
	public void openLightActivity(){
		Intent intent=new Intent(this,LightActivity.class);
		startActivity(intent);
		finish();
	}
	public void openOverlayActivity(){
		Intent intent=new Intent(this,OverlayActivity.class);
		startActivity(intent);
		finish();
	}

}
