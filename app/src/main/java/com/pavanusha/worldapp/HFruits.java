package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class HFruits extends Activity {

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

                        "अंजीर ",
                        " सेब",
                        " बादाम",
                        "केला",
                        "जामुन",
                        " चेरी",
                        " गन्ना ",
                        "अनार",
                        "खजूर ",
                        "जंगली तारीख फल",
                        "किसमिस",
                        "कश्यु",
                        "अंगूर",
                        "अमरूद",

                        "कस्तूरी तरबूज ",

                        "किशमिश ",
                        "लक्ष्मण फल ",
                        "नींबू ",
                        "लीची ",
                        "लोकुँट  ",
                        "आम ",
                        "हॉग बेर  ",
                        "काले खूबानी ",
                        "केप करौदा  ",
                        "नारंगी",
                        "चकोतरा ",
                        "पपीता",
                        "आडू ",
                        "नाशपाती",
                        "अनन्नास",
                        "बेर",
                        "रामफल ",
                        "ढहाना जामुन ",
                        "ब्लैकबेरी",
                        "चिक्कू ",
                        "सिताफ़ल ",
                        "स्ट्राबेरी का फल   ",
                        "निविदा हथेली",
                        "निविदा हथेली गोली मारता ",
                        "करौंदा",
                        "बेल",
                        "तरबूज",
                };

        flag = new int[]
                {
                        R.drawable.anjur,
                        R.drawable.apple,
                        R.drawable.badam,
                        R.drawable.banana,
                        R.drawable.bberry,
                        R.drawable.cherry,
                        R.drawable.cherukugada,
                        R.drawable.dabbapandu,
                        R.drawable.danimma,
                        R.drawable.dates,
                        R.drawable.eetapandu,
                        R.drawable.endudraksha,
                        R.drawable.gedimamidi,
                        R.drawable.grape,
                        R.drawable.jama,
                        R.drawable.kharbhuja,
                        R.drawable.kismis,
                        R.drawable.lakshmanaphalam,
                        R.drawable.lemon,
                        R.drawable.litch,
                        R.drawable.loquat,
                        R.drawable.mango,
                        R.drawable.maredu,
                        R.drawable.nallak,
                        R.drawable.nelausiri,
                        R.drawable.orange_fruit,
                        R.drawable.pamparapasana,
                        R.drawable.papaya,
                        R.drawable.peach,
                        R.drawable.pear,
                        R.drawable.pineapple,
                        R.drawable.plum,
                        R.drawable.ramaphalam,
                        R.drawable.raseberries,
                        R.drawable.regu,
                        R.drawable.sapota,
                        R.drawable.sitaphalam,
                        R.drawable.strawberry,
                        R.drawable.tatimungelu,
                        R.drawable.tegalu,
                        R.drawable.usiri,
                        R.drawable.venlagapandu,
                        R.drawable.watermelon,

                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(this, category,  flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);
        viewPager.setBackgroundResource(R.drawable.fruits_bg);

    }
    public void onBackPressed()
    {
        Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
        finish();


    }
}