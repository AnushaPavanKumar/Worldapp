package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class MShapes extends Activity {

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
				"വലയം ", 
				"കോൺ ",
				"സിലിണ്ടര്", 
				
				"ദശഭുജം",
				"വജം",
				
				"ഹൃദയം",
				"ഷഡ്ഭുജകോണം",
				
				"അറയാണ്",
				"ദീര്ഘവൃത്തമായ",
				
				"സമാന്തര",
				"പെൻറഗൺ",
				
				"ചതുരം",
				"ര്‍ഹോമ്ബുസ് ",
				
				"ഹെപ്ടഗോനെ ",
				"പനോരമ",
				
				"സമചതുരം",
				"സമചതുരം",
				
				"ട്രപെഴിയം ",
				"തികോണം",
				
				
				};
 
		flag = new int[] 
				{
				R.drawable.circle,
				R.drawable.cone,
				R.drawable.cylinder,
				R.drawable.decagon,
				R.drawable.diamond,
				R.drawable.heart,
				R.drawable.hexagon,
				R.drawable.octagon,
				R.drawable.oval_shape,
				R.drawable.parallelogram,
				R.drawable.pentagon,
				
				R.drawable.rectangle,
				R.drawable.rhombus,
				R.drawable.septagone,
				R.drawable.sphere,
				R.drawable.diamond,
				R.drawable.heart,
				R.drawable.hexagon,
				R.drawable.octagon,
				R.drawable.oval_shape,
				R.drawable.parallelogram,
				R.drawable.pentagon,
				
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