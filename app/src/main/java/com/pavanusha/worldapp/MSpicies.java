package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class MSpicies extends Activity {

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
				"ഇഞ്ചി ",
				"കടുക് ",
				"ശർക്കര",
				"പുലി ",
				"പട്ട ",
				" മല്ലി ",
				" ഏലക്ക ",
				" ജീരകം ",
				" കടല ",
				" കായം ",
				"മഞ്ഞള് പൊടി",
				" തേങ്ങ ",
				"കുങ്കുമം",
				" കരിംപോ ",
				"ഡിൽ",
				" ഉഴുന്ന പരിപ്പ് ",
				"സെസിമി",
				"തൈര് ",
				"റോക്ക് ഉപ്പ്",
				"വറുത്ത ഗ്രാം",
				"പരിപ്പു വറുത്ത ഗ്രാം",
				"പഞ്ചസാര",
				"വെളുത്തുള്ളി",
				" നിലക്കടല ",
				"ഉപ്പ്",
				
				};
 
		flag = new int[] 
				{
				R.drawable.allam,
				R.drawable.avalu,
				R.drawable.bellam,
				R.drawable.chintapandu,
				R.drawable.dashinachekka,
				R.drawable.dhaniyalu,
				R.drawable.elkulu,
				R.drawable.gelakarra,
				R.drawable.gullasenagapappu,
				R.drawable.hing,
				R.drawable.karam,
				R.drawable.kobbari,
				R.drawable.kumkumapuvvu ,
				R.drawable.lavamgam,
				R.drawable.menthulu,
				R.drawable.minapappu,
				R.drawable.nuvvulu,
				R.drawable.perugu,
				R.drawable.rallavuppu,
				R.drawable.senagalu,
				R.drawable.senagapappu,
				R.drawable.sugar,
				R.drawable.tene,
				R.drawable.vamu,
				R.drawable.velluli,
				R.drawable.verusengalagullu,
				R.drawable.vuppu,
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