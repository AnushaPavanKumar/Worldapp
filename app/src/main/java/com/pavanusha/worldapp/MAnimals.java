package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;


public class MAnimals extends Activity {

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
					"ഒട്ടകം ",
					"പൂച്ച",
					"നായ്",
					"കഴുത",
					"ആന ",
					"കുറുക്കന്",
					"മാന്",
					"ജിറാഫ്",
					"കോഡീ",
					"കുതിര",
					"സിംഹം",
					"കുരങ്ങ്",
					"ഊഞ്ഞാലാടുക",
					"എലി",
					"അണ്ണാന്",
					"കടുവ",
				};
 
		flag = new int[] 
				{
				R.drawable.camel,
				R.drawable.cat,
				R.drawable.dog,
				R.drawable.donkey,
				R.drawable.elephant,
				R.drawable.fox,
				R.drawable.ginka,
				R.drawable.giraffe,
				R.drawable.hen ,
				R.drawable.horse ,
				R.drawable.lion,
				R.drawable.monkey,
				R.drawable.pig,
				R.drawable.rat,
				R.drawable.squirrel,
				R.drawable.tiger,
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