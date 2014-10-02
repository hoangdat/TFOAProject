package com.example.menulear;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}
	

	
	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.findItem(R.id.item).setVisible(true);
		
		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
//		int id = item.getItemId();
//		if (id == R.id.action_settings) {
//			return true;
//		}
		int id = item.getItemId();
		
		switch (id) {
		case R.id.item:
			Log.d("Item Event DatPH", "Item Selected");
			
			break;
		case R.id.item1:
			Log.d("Item 1 Event DatPH", "Item 1 Selected");
			
			break;
		case R.id.item2:
			Log.d("Item 2 Event DatPH", "Item 2 Selected");
			
			break;

		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
	}
}
