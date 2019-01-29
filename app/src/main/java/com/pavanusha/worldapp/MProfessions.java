package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;


public class MProfessions extends Activity {

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
				"കമന്റേറ്റർ",
				"നര്ത്തകി",
				"ഡോക്ടര്",
				"അഗ്നിശമനയന്തക്കാരന്",
				"വിധികര്ത്താവ്",
				"അഭിഭാഷകന്",
				"പോലീസ്",
				"ഗായിക",
				"എഴുത്തുകാരി",
				"എഴുത്തുകാരി"
				
				};
 
		flag = new int[] 
				{
				R.drawable.anchor,
				R.drawable.dancer,
				R.drawable.doctor,
				R.drawable.fireman,
				R.drawable.judge,
				R.drawable.lawyer,
				
				R.drawable.police,
				R.drawable.singer,
				R.drawable.teacher ,
				R.drawable.writer,
				
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