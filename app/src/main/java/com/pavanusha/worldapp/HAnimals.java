package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;


public class HAnimals extends Activity {

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
                        "मगर ",
                        "बन्दर की जात का जानवर",
                        "वर्मी ",
                        "भालू",
                        "भैंस",
                        "ऊंट",
                        "बिल्ली",
                        "गाय",
                        "कुत्ता ",
                        "गधा",
                        "हाथी",
                        "लोमड़ी ",
                        "हिरन  ",
                        "जिराफ़ ",
                        "बकरा ",
                        "घोड़ा",
                        "शेर",
                        "बंदर",
                        "बैल",
                        "सुअर ",
                        "चूहा ",
                        "गिलहरी ",
                        "नाग",
                        "बाघ",
                };

        flag = new int[]
                {
                        R.drawable.alligator,
                        R.drawable.ape,
                        R.drawable.armadillo,
                        R.drawable.bear,
                        R.drawable.buffalo,
                        R.drawable.camel,
                        R.drawable.cat,
                        R.drawable.cow,
                        R.drawable.dog,
                        R.drawable.donkey,
                        R.drawable.elephant,
                        R.drawable.fox,
                        R.drawable.ginka,
                        R.drawable.giraffe,
                        R.drawable.goat,
                        R.drawable.horse ,
                        R.drawable.lion,
                        R.drawable.monkey,
                        R.drawable.ox,
                        R.drawable.pig,
                        R.drawable.rat,
                        R.drawable.squirrel,
                        R.drawable.adder,
                        R.drawable.tiger,
                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(this, category,  flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);
        viewPager.setBackgroundResource(R.drawable.animals_bg);

    }
    public void onBackPressed()
    {
        Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
        finish();


    }
}