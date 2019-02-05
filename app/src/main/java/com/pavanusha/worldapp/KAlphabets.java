package com.pavanusha.worldapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class KAlphabets extends Activity {

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

                        "ಅ",
                        "ಆ",
                        "ಇ",
                        "ಈ",
                        "ಉ ",
                        "ಊ",
                        "ಋ",
                        "ೠ",
                        "ಎ",
                        "ಏ",
                        "ಐ",
                        "ಒ",
                        "ಓ",
                        "ಔ",
                        "ಅಂ",
                        "ಅಃ",
                        "ಕ",
                        "ಖ",
                        "ಗ ",
                        "ಘ",
                        "ಙ",
                        "ಚ",
                        "ಛ",
                        "ಜ",
                        "ಝ",
                        "ಞ",
                        "ಟ",
                        "ಠ ",
                        "ಡ",
                        "ಢ",
                        "ಣ",
                        "ತ",
                        "ಥ",
                        "ದ",
                        "ಧ",
                        "ನ",
                        "ಪ ",
                        "ಫ ",
                        "ಬ",
                        "ಭ ",
                        "ಮ",
                        "ಯ",
                        "ರ ",
                        "ಲ",
                        "ವ",
                        "ಶ ",
                        "ಷ",
                        "ಸ ",
                        "ಹ ",
                        "ಳ",


                };

        flag = new int[]
                {
                        R.drawable.k_a,
                        R.drawable.k_aa,
                        R.drawable.k_u,
                        R.drawable.k_uu,
                        R.drawable.k_vu,
                        R.drawable.k_vu,
                        R.drawable.k_yu ,
                        R.drawable.k_yuu,
                        R.drawable.k_ea,
                        R.drawable.k_eai,
                        R.drawable.k_i,
                        R.drawable.k_o,
                        R.drawable.k_oo,
                        R.drawable.k_ou,
                        R.drawable.k_am,
                        R.drawable.k_aha,

                        R.drawable.k_ka,
                        R.drawable.k_kha,
                        R.drawable.k_ga,
                        R.drawable.k_gha,
                        R.drawable.k_ini,
                        R.drawable.k_cha,
                        R.drawable.k_chaa,
                        R.drawable.k_ja,
                        R.drawable.k_jha,
                        R.drawable.k_ini,
                        R.drawable.k_ta,
                        R.drawable.k_tha,
                        R.drawable.k_da,
                        R.drawable.k_dha,
                        R.drawable.k_na,
                        R.drawable.k_tta,
                        R.drawable.k_tda,
                        R.drawable.k_tdha,
                        R.drawable.k_tna,
                        R.drawable.k_pa,
                        R.drawable.k_pha,
                        R.drawable.k_ba,
                        R.drawable.k_bha,
                        R.drawable.k_ma,
                        R.drawable.k_ya,
                        R.drawable.k_ra,
                        R.drawable.k_la,
                        R.drawable.k_va,
                        R.drawable.k_sha,
                        R.drawable.k_sa,
                        R.drawable.k_ha,
                        R.drawable.k_ala,


                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(KAlphabets.this, category,  flag);
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