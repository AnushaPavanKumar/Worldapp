package com.pavanusha.worldapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class HAlphabets extends Activity {

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

                        "अ",
                        "आ",
                        "इ ",
                        "ई ",
                        "उ",
                        "ऊ",
                        "ऋ ",
                        "ए",
                        "ऐ ",
                        "ओ",
                        "औ",
                        "अं ",
                        "अः",
                        "क",
                        "ख",
                        "ग ",
                        "घ",
                        "ङ",
                        "च",
                        "छ",
                        "ज",
                        "झ",
                        "ञ",
                        "ट",
                        "ठ ",
                        "ड ",
                        "ढ ",
                        "ण ",
                        "त ",
                        "थ",
                        "द ",
                        "ध ",
                        "न",
                        "प",
                        "फ",
                        "ब ",
                        "भ",
                        "म",
                        "य ",
                        "र",
                        "ल ",
                        "व",
                        "श",
                        "ष",
                        "स",
                        "ह",
                        "क्ष ",
                        "त्र",
                        "्ञ",



                };

        flag = new int[]
                {
                        R.drawable.h_a,
                        R.drawable.h_aa,
                        R.drawable.h_e,
                        R.drawable.h_ee,
                        R.drawable.h_u,
                        R.drawable.h_uu,
                        R.drawable.h_ru,
                        R.drawable.h_ea,
                        R.drawable.h_eai,
                        R.drawable.h_oo,
                        R.drawable.h_ou,
                        R.drawable.h_am,
                        R.drawable.h_aha,
                        R.drawable.h_ka,
                        R.drawable.h_kha,
                        R.drawable.h_ga,
                        R.drawable.h_gha,
                        R.drawable.h_jna,
                        R.drawable.h_cha,
                        R.drawable.h_chha,
                        R.drawable.h_ja,
                        R.drawable.h_jha,
                        R.drawable.h_ini,
                        R.drawable.h_ta,
                        R.drawable.h_tha,
                        R.drawable.h_da,
                        R.drawable.h_dha,
                        R.drawable.h_na,
                        R.drawable.h_tta,
                        R.drawable.h_ttha,
                        R.drawable.h_tda,
                        R.drawable.h_tdha,
                        R.drawable.h_tna,
                        R.drawable.h_pa,
                        R.drawable.h_pha,
                        R.drawable.h_ba,
                        R.drawable.h_bha,
                        R.drawable.h_ma,
                        R.drawable.h_ya,
                        R.drawable.h_ra,
                        R.drawable.h_la,
                        R.drawable.h_va,
                        R.drawable.h_sa,
                        R.drawable.h_sha,
                        R.drawable.h_ssa,
                        R.drawable.h_ha,
                        R.drawable.h_ksha,
                        R.drawable.h_tra,
                        R.drawable.h_zna,



                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(HAlphabets.this, category,  flag);
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