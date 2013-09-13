package com.practice.actionbardemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class HelpActivity extends Activity {
	TextView help;
	
@Override
protected void onCreate(Bundle savedInstanceState) {

	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	int duration=Toast.LENGTH_LONG;
	Toast.makeText(this,"help clicked", duration).show();
	getActionBar().setDisplayHomeAsUpEnabled(true);
	
	help=(TextView)findViewById(R.id.msg);
	help.setText("help page");
}
public boolean onCreateOptionsMenu(Menu menu) {
	// TODO Auto-generated method stub
	getMenuInflater().inflate(R.menu.main, menu);
	return super.onCreateOptionsMenu(menu);
}

}
