package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;


public class MVegetables extends Activity {

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
				"വേണ്ടകൈ ",
				"പീച്ചിങ്ങ ",
				"പയര് ",
				"കുമ്പളങ്ങ",
				"മുളക് ",
				"ഭോപ്ളി മിര്‍ച്ചി ",
				"ചൌളിഫ്ലോവേര്‍ ",
				
				"ചെമാടുമ്പ ",
				
				"സ്വീറ്റ് ഉരുളക്കിഴങ്ങ്",
				
				"സിട്രോന്‍ ",
				
				"വീക്ഷണത്തിൽ",
				"മുരിങ്ങക്ക ",
				"ഫ്രഞ്ച്ശൈലി പയർ",
				"നഖ ബീൻസ്",
				"ഗ്രീൻ മുളക്",
				"പച്ച പീസ്",
				"പാവയ്ക്ക",
				"കണ്ട",
				"മരച്ചീനി",
				"വെള്ളരികൈ ",
				"മുള്ളങ്കി ",
				"ഉറുന്വുണ്ടാക്കുന്ന കുടകൾ",
				"പീച്ചിങ്ങ ",
/*				"സവോള ",*/ 
				"കൂർത്തതും പാവയ്ക്ക",
				"ഉറലകിഴങ്ങു ",
				"പടവലങ്ങ ",
				"മത്തങ്ങാ ",
				"സോരെകൈ ",
				"തക്കാളി ",
				"വസന്തകാലത്ത് ഉള്ളി",
				
				"വഴുതിനിഗ "
				
				};
 
		flag = new int[] 
				{
				/*R.drawable.aritikaya,*/
				R.drawable.bendakaya,
				R.drawable.benglorevankaya,
				R.drawable.beerakaya,
				R.drawable.braodbeans,
				R.drawable.budidagummadikaya,
				R.drawable.cabbage,
				R.drawable.capsicum,
				R.drawable.cauliflower,
				R.drawable.chemadumpa,
				R.drawable.chilakadadumpa,
				R.drawable.dabbakaya,
				R.drawable.dondakaya,
				R.drawable.drumstick,
				R.drawable.frenchbeans,
				R.drawable.goruchukkudu,
				R.drawable.greenchilli,
				R.drawable.greenpeas,
				R.drawable.kakarakaya,
				R.drawable.kanda,
				R.drawable.karrapendalam,
				R.drawable.kiradosakaya,
				R.drawable.mullangi,
				R.drawable.mushrooms,
				R.drawable.netibeerakaya,
				R.drawable.onion,
				R.drawable.pointedgourd,
				R.drawable.potato,
				R.drawable.potlakaya,
				R.drawable.pumpkin,
				R.drawable.sorakaya,
				R.drawable.tamato,
				R.drawable.ullikadalu,
				R.drawable.vankaya,
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