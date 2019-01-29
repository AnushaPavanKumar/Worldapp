package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class MVehicles extends Activity {

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
				
				"ആകാശവിമാനം",
				"ആംബുലന്സ്",
				"ഓട്ടോ",
				"ബൈക്ക്",
				"വള്ളം",
				"ബസ്",
				"കാര്",	
				"ആവൃത്തി",
				"ജീപ്പ്",
				"ലോറി",
				"കപ്പൽ",
				"തീവണ്ടി",
				};
 
		flag = new int[] 
				{
				R.drawable.aeroplane,
				
				R.drawable.ambulance,
				R.drawable.auto,
				R.drawable.bike,
				R.drawable.boat,
				
				R.drawable.bus,
				R.drawable.car,
				R.drawable.cycle ,
				R.drawable.jeep,
				R.drawable.lorry,
				R.drawable.ship,
				R.drawable.train,
				
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