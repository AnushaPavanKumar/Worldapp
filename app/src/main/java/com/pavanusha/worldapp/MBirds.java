package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;


public class MBirds extends Activity {

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
					"വവ്വാല്‍ ",
					"കാക്ക ",
					"ഡക്ക്",
					
					"കശുകാന്‍ ",
					
					"കോശി  ",
					
					"കുയില്‍ ",
					
					"മൈന ",
					
					"കിളി ",
					
					"മയില്‍ ",
					
					"പ്രാവ് ",
					"കുരുവി ",
					"അന്നം ",
					
				};
 
		flag = new int[] 
				{
				R.drawable.bat,
				
				R.drawable.crow,
				R.drawable.duck,
				R.drawable.eagle,
				R.drawable.hen,
				
				R.drawable.kokila,
				R.drawable.mina,
				R.drawable.parrot,
				R.drawable.peacock,
				R.drawable.pigeon,
				R.drawable.sparrow,
				R.drawable.swan,
				
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