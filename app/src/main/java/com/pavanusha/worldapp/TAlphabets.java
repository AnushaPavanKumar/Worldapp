package com.pavanusha.worldapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class TAlphabets extends Activity {

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

                        "அ",
                        "ஆ",
                        "இ",
                        "ஈ",
                        "உ",
                        "ஊ",
                        "எ",
                        "ஏ",
                        "ஐ",
                        "ஒ",
                        "ஓ",
                        "ஔ",
                        "க",
                        "ங",
                        "ச",
                        "ஞ",
                        "ஞ",
                        "ண",
                        "த",
                        "ந",
                        "ப",
                        "ம",
                        "ய",
                        "ர",
                        "ல",
                        "வ",
                        "ழ",
                        "ள",
                        "ற",
                        "ன",


                };

        flag = new int[]
                {
                        R.drawable.tam_a,
                        R.drawable.tam_aa,
                        R.drawable.tam_e,
                        R.drawable.tam_ee,
                        R.drawable.tam_u,
                        R.drawable.tam_uu,
                        R.drawable.tam_ea,
                        R.drawable.tam_eaa,
                        R.drawable.tam_ai,
                        R.drawable.tam_o,
                        R.drawable.tam_oo,
                        R.drawable.tam_ov,
                        R.drawable.tam_ka,
                        R.drawable.tam_ini,
                        R.drawable.tam_cha,
                        R.drawable.tam_inni,
                        R.drawable.tam_ta,
                        R.drawable.tam_na,
                        R.drawable.tam_tta,
                        R.drawable.tam_tna,
                        R.drawable.tam_pa,
                        R.drawable.tam_ma,
                        R.drawable.tam_ya,
                        R.drawable.tam_ra,
                        R.drawable.tam_la,
                        R.drawable.tam_va,
                        R.drawable.tam_ala,
                        R.drawable.tam_alaa,
                        R.drawable.tam_bra,
                        R.drawable.tam_last,

                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(TAlphabets.this, category,  flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);
        viewPager.setBackgroundResource(R.drawable.bga);

    }
    public void onBackPressed()
    {


        Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
        finish();


    }

}