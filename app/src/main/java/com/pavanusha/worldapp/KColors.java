package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;


public class KColors extends Activity {

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
                        "ಕಪ್ಪು",
                        "ನೀಲಿ  ",
                        "ಕಂಡು",
                        "ಚಿನ್ನದ",
                        "ಬೂದು ಬಣ್ಣದ",
                        "ಹಸಿರು",
                        "ಕಿತ್ತಳೆ ಬಣ್ಣ",
                        "ಗುಲಾಬಿ ಬಾಣ ",
                        "ಕೆಂಪು ",
                        " ರಜತ / ಬೆಳ್ಳಿ",
                        "ನೆರಲ್ಲೇ ಬಣ್ಣ ",
                        "ಬಿಳಿಬಣ್ಣ" ,
                        "ಹಳದಿ ",

                };

        flag = new int[]
                {
                        R.drawable.black,
                        R.drawable.blue,
                        R.drawable.brown,
                        R.drawable.gold,
                        R.drawable.gray,
                        R.drawable.green,
                        R.drawable.orange,
                        R.drawable.pink,
                        R.drawable.red,
                        R.drawable.silver,
                        R.drawable.violet,
                        R.drawable.white,
                        R.drawable.yellow,
                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(this, category,  flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);
        viewPager.setBackgroundResource(R.drawable.colors_bg);

    }
    public void onBackPressed()
    {
        Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
        finish();


    }
}