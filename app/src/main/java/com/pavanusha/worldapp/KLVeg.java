package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class KLVeg extends Activity {

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
                        "ಸ್ಪಿನಾಚ್ ",
                        " ಗೊಗು  ",
                        "ಕರಿಬೇವು ಸೊಪ್ಪು",
                        "ಕೊಥಮ್ಬರಿ ಸೊಪ್ಪು ",
                        "ಮೆನ್ತಿ  ",
                        "ಪಾಲಕ್",
                        "ಪುದಿನಾ",
                        "ತ್ಹೊತಕುರ",


                };

        flag = new int[]
                {
                        R.drawable.batchali,
                        R.drawable.gongura,
                        R.drawable.karivepaku,
                        R.drawable.kotimera,
                        R.drawable.menthi,
                        R.drawable.palakura,
                        R.drawable.pudina,
                        R.drawable.totakura,

                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(this, category,  flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);
        viewPager.setBackgroundResource(R.drawable.leafy_bg);
    }
    public void onBackPressed()
    {
        Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
        finish();


    }

}