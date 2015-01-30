/**
 * 
 */
package com.example.jxsoftapp;

import com.sdjxsoft.Utils.AlphaActivtity;
import com.sdjxsoft.Utils.InterfaceCls;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author hyper
 *
 */
public class StartApp extends Activity {
	private View views;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		views=View.inflate(this, R.layout.startapp, null);
		setContentView(views);
	
	}
	
	public void skipPage()
	{
		Intent intent=new Intent(this, MainActivity.class);
		startActivity(intent);
		finish();
	}
}
