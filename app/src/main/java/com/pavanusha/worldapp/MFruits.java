package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class MFruits extends Activity {

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
				
				"അതിപഴം",
				" വഴപഴം ",			
				" മതല നാരങ്ങ",
				" ഈന്തപഴം",
				" ഉണക്ക മുന്തിരി ",
				" മുന്തിരിങ്ങ ",
				" പേരക്ക ",
				"നാരങ്ങ ",
				"മാങ്ങാ",
				"മാത്ര നാരങ്ങ",
				"ഓമകായ",
				"കൈതച്ചക്ക",
				"സീതപ്പഴം",
				"നെല്ലിക്ക",
				
				"തന്നി മതങ്",
				
				"തണ്ണിമത്തൻ",
				
				};
 
		flag = new int[] 
				{
				R.drawable.anjur,
				R.drawable.banana,
				R.drawable.dabbapandu,
				R.drawable.danimma,
				R.drawable.dates,
				R.drawable.endudraksha,
				
				R.drawable.grape,
				R.drawable.jama,
				R.drawable.lemon,
				R.drawable.mango,
				
				
				R.drawable.orange_fruit,
				R.drawable.papaya,
				R.drawable.pineapple,
				
				R.drawable.sitaphalam,
				R.drawable.usiri,
				
				R.drawable.watermelon,
				
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