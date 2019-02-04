package com.pavanusha.worldapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class Malphabets extends Activity {

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
								
				"അ",
				"ആ",
				"ഇ",
				"ഈ",
				"ഉ",
				"ഊ",
				"ഋ",
				"എ",
				"ഏ",
				"ഐ",
				"ഒ",
				"ഓ",
				"ഔ",
				"അം",
				"അഃ",
				"ക",
				"ഖ",
				"ഗ",
				"ഘ",
				"ങ", 
				"ച",
				"ചാ",
				"ജ",
				"ഝ",
				"ഞ",
				"ട",
				"ഠ",
				"ഡ",
				"ഢ",
				"ണ",
				"ത",
				"ഥ",
				"ദ",
				"ധ",
				"ന", 
				"പ",
				"ഫ",
				"ബ",
				"ഭ",
				"മ", 
				"യ",
				"ര",
				"ല",
				"വ",
				"ശ",
				"ഷ",
				"സ",
				"ഹ", 
				"ള",
				"ഴ",
				"റ",

				
				};
 
		flag = new int[] 
				{
				R.drawable.m_a,
				R.drawable.m_aa,
				R.drawable.m_e,
				R.drawable.m_ee,
				R.drawable.m_u,
				R.drawable.m_uu,
				R.drawable.m_ru,
				R.drawable.m_ea,
				R.drawable.m_eai,
				R.drawable.m_ai,
				R.drawable.m_o,
				R.drawable.m_oo,
				R.drawable.m_ou,
				R.drawable.m_am,
				R.drawable.m_aha,
				
				R.drawable.m_ka,
				R.drawable.m_kha,
				R.drawable.m_ga,
				R.drawable.m_gha,
				R.drawable.m_ini,
				
				R.drawable.m_cha,
				R.drawable.m_chcha,
				R.drawable.m_ja,
				R.drawable.m_jha,
				R.drawable.m_inni,
				
				R.drawable.m_ta,
				R.drawable.m_tha,
				R.drawable.m_da,
				R.drawable.m_dha,
				R.drawable.m_na,
				
				R.drawable.m_tta,
				R.drawable.m_tda,
				R.drawable.m_tdha,
				R.drawable.m_tdhha,
				R.drawable.m_tna,
				
				R.drawable.m_pa,
				R.drawable.m_pha,
				R.drawable.m_ba,
				R.drawable.m_bha,
				R.drawable.m_ma,
				
				R.drawable.m_ya,
				R.drawable.m_ra,
				R.drawable.m_la,
				R.drawable.m_va,
				R.drawable.m_sha,
				R.drawable.m_shha,
				R.drawable.m_sa,
				R.drawable.m_ha,
				
				R.drawable.m_ala,
				R.drawable.m_shaa,
				R.drawable.m_bra,
				
				};
 
		// Locate the ViewPager in viewpager_main.xml
		viewPager = (ViewPager) findViewById(R.id.pager);
		// Pass results to ViewPagerAdapter Class
		adapter = new ViewPagerAdapter(Malphabets.this, category,  flag);
		// Binds the Adapter to the ViewPager
		viewPager.setAdapter(adapter);
		viewPager.setBackgroundResource(R.drawable.alphabets_bg);
 
	}
	 public void onBackPressed() 
	    {
		 
			      
		 Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
		                      finish();
		          

	    	}

}