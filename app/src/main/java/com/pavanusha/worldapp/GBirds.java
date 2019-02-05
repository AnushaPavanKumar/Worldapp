package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;


public class GBirds extends Activity {

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
                        "રંગીલો માણસ",
                        "બગલો ",
                        "કાગડો",
                        "બતક ",
                        "ગરૂડ",
                        "મારગાહી ",
                        "કોયલ",
                        "બુલબુલ",
                        "શાહમુગ",
                        "ઉલ્લુ ",
                        "પોપટ ",
                        "મોર ",
                        "ઢેલ ",
                        "मुरग़ा  ",
                        "ગીધ",
                        "કબુતર",
                        "દંસ",
                        "સુઘરી ",
                        "લક્કડખોદ ",

                };

        flag = new int[]
                {
                        R.drawable.butterfly,
                        R.drawable.crane,
                        R.drawable.crow,
                        R.drawable.duck,
                        R.drawable.eagle,
                        R.drawable.falcon,
                        R.drawable.fowl,
                        R.drawable.mina,
                        R.drawable.nightingale,
                        R.drawable.ostrich,
                        R.drawable.owl,
                        R.drawable.parrot,
                        R.drawable.peacock,
                        R.drawable.pigeon,
                        R.drawable.punju,
                        R.drawable.rabandu,
                        R.drawable.sparrow,
                        R.drawable.swan,
                        R.drawable.weaverbird,
                        R.drawable.woodpeacker,


                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(this, category,  flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        viewPager.setBackgroundResource(R.drawable.birds_bg);

    }
    public void onBackPressed()
    {
        Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
        finish();


    }

}