package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;




public class MPlanets extends Activity {

	// Declare Variables
	ViewPager viewPager;
	PagerAdapter adapter;
	String[] category;
	int[] flag;
	

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.malayalam);
		
		Intent i = getIntent();
	    String title= i.getExtras().getString("title");
	    setTitle(title); 

 
 
		// Generate sample data
		category = new String[] 
				{ 
				"ഭൂമി", 
				"வியாழன்",
				"ചൊവ്വ", 
				"ബുധന്",
				"നെപ്റ്റ്യൂണ്",
				"ശനി",
				"സൂര്യന്",
				"യുറാനസ്",
				"ശുക്രന്",
				
				};
 
		flag = new int[] 
				{
				R.drawable.earth,
				R.drawable.juipter,
				R.drawable.mars,
				R.drawable.mercury,
				R.drawable.neptune,
				R.drawable.saturn,
				R.drawable.sun,
				R.drawable.uranus,
				R.drawable.venus,
				};
 
		// Locate the ViewPager in viewpager_main.xml
		viewPager = (ViewPager) findViewById(R.id.pager);
		// Pass results to ViewPagerAdapter Class
		adapter = new ViewPagerAdapter(this, category,  flag);
		// Binds the Adapter to the ViewPager
		viewPager.setAdapter(adapter);
 
	}
	 public void onBackPressed() 
    {
		       Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
		                      finish();
   	}
}