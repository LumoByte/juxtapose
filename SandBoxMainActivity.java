package com.smashThemSoftly.sandbox;

import com.google.gson.Gson;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SandBoxMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sand_box_main);
        
        
        majorForTop10 cit = new majorForTop10("cit");
		
		String major = new Gson().toJson(cit);	
		System.out.println(major);
		
		/*
		LinearLayout lView = new LinearLayout(this);

		TextView myText = new TextView(this);
		myText.setText(major);

		lView.addView(myText);

		setContentView(lView);*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sand_box_main, menu);
        return true;
    }
    
}
