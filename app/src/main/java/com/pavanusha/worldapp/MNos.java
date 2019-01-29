package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class MNos extends Activity {

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
				"ഒന്ന്", 
				"രണ്ട്",
				"മുന്ന്", 
				"നാല്‌",
				"അഞ്ച്",
				"അറ് ",
				"ഏഴ്",
				"എട്ട്",
				"ഒന്‍പത്",
				"പത്ത്",
				"പതിനൊന്ന്",
				"പന്ത്രണ്ട്",
				"പതി മുന്നു",
				"പതിനാല്",
				"പതിനഞ്ച്",
				"പതിനാറ്",
				"പതിനേഴ്",
				"പതിനെട്ട്",
				"പത്തൊമ്പതു",
				"ഇരുപത്",
				
				
				"ഇരുപതൊന്നുഹ്",
				"ഇരുപതിരന്ദുഹ്",
				" ഇരുപതിമോനുഹ്",
				
				
				"മുപ്പതുഹ്",
				"നല്പതുഹ്",
				"അന്പതുഹ്",
				"അരുപതുഹ്",
				"എക്ഷ്ഹുപതുഹ്",
				"എന്പതുഹ്",
				"തൊണ്ണൂറു",
				
				"നൂറു",
				"ആയിരം",
				
				};
 
		flag = new int[] 
				{
				R.drawable.one,
				R.drawable.two,
				R.drawable.three,
				R.drawable.four,
				R.drawable.five,
				R.drawable.six,
				R.drawable.seven,
				R.drawable.eight,
				R.drawable.nine,
				R.drawable.ten,
				R.drawable.eleven,
				R.drawable.twelve,
				R.drawable.thirteen,
				R.drawable.fourteen,
				R.drawable.fifteen,
				R.drawable.sixteen,
				R.drawable.seventeen,
				R.drawable.eighteen,
				R.drawable.ninteen,
				R.drawable.twenty,
				R.drawable.tone,
				R.drawable.ttwo,
				R.drawable.thirty,
				R.drawable.fourty,
				R.drawable.fifty,
				R.drawable.sixty,
				R.drawable.seventy,
				R.drawable.eighty,
				R.drawable.ninty,
				R.drawable.hundered,
				R.drawable.thousand,
				
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