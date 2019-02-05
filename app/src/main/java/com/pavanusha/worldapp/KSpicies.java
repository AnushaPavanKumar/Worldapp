package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class KSpicies extends Activity {

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
                        "ಶುಂಠಿ",
                        " ಸಾಸಿವೆ  ",
                        "ಬೆಲ್ಲ ",
                        "ಬಿರಿಯಾನಿ ಎಲೆ ",
                        "ಬಾಂಬೆ ಹುರಿದ ಗ್ರಾಂ ",
                        "ಹುಣಿಸೆ ಹಣ್ಣು",
                        "ದಾಲ್ಚಿನ್ನಿ",
                        " ಕೊತ್ತಂಬರಿ   ",
                        " ಏಲಕ್ಕಿ ",
                        " ಜೀರಿಗೆ ",
                        "గుళ్ళ సెనగపప్పు",
                        "ಇಂಗುವಾ  ",
                        "ಮೆಣಸಿನಕಾಯಿಯ ",
                        " ತೆಂಗಿನಕಾಯಿ ",
                        "ಕೇಸರಿ ",
                        " ಲವಂಗ    ",
                        "ಡಿಲ್ ",
                        "ಉದ್ದಿನ  ",
                        "ನಿಂಬೆ ಉಪ್ಪು",
                        "ಸೆಸೇಮ್  ",
                        "ಮೊಸರು",
                        "ಕಲ್ಲುಪ್ಪು",
                        "ಫ್ರೈಡ್ ಗ್ರಾಂ",
                        "సెనగ పప్పు  ",
                        "ಸಕ್ಕರೆ  ",
                        "ಜೇನು",
                        "ರಿಕ್   ",
                        "ಬೆಳ್ಳುಳ್ಳಿ   ",
                        "ನೆಲದ ಬೀಜಗಳು",
                        "ಉಪ್ಪು  ",

                };

        flag = new int[]
                {
                        R.drawable.allam,
                        R.drawable.avalu,
                        R.drawable.bellam,
                        R.drawable.biriyaniaaku,
                        R.drawable.bombayisengalu,
                        R.drawable.chintapandu,
                        R.drawable.dashinachekka,
                        R.drawable.dhaniyalu,
                        R.drawable.elkulu,
                        R.drawable.gelakarra,
                        R.drawable.gullasenagapappu,
                        R.drawable.hing,
                        R.drawable.karam,
                        R.drawable.kobbari,
                        R.drawable.kumkumapuvvu ,
                        R.drawable.lavamgam,
                        R.drawable.menthulu,
                        R.drawable.minapappu,
                        R.drawable.nimmavuppu,
                        R.drawable.nuvvulu,
                        R.drawable.perugu,
                        R.drawable.rallavuppu,
                        R.drawable.senagalu,
                        R.drawable.senagapappu,
                        R.drawable.sugar,
                        R.drawable.tene,
                        R.drawable.vamu,
                        R.drawable.velluli,
                        R.drawable.verusengalagullu,
                        R.drawable.vuppu,
                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(this, category,  flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);
        viewPager.setBackgroundResource(R.drawable.spices_bg);

    }
    public void onBackPressed()
    {
        Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
        finish();


    }
}