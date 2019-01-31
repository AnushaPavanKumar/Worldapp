package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;


public class TBirds extends Activity {

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
                        "வாவல்",
                        "பட்டாம்பூச்சி   ",
                        "குஞ்சு  ",
                        "கொக்கு, நாரை ",
                        "காகம், காக்கா",
                        "வாத்து ",
                        "கழுகு, கருடன் ",
                        "இராஜாளி  ",
                        "கோழி",
                        "இந்திய ஓந்தி",
                        "மீன்கொத்தி  ",
                        "குயில் ",
                        "மைனா",
                        "ஒரு வகை பாடும் பறவை  ",
                        "தீக்கோழி ",
                        "ஆந்தை",
                        "கிளி ",
                        "கௌதாரி",
                        "மயில்",
                        "கூழைக்கிடா   ",
                        "புறா",
                        "வான்கோழி  ",
                        "ஈகை ",
                        "கழுகு, கருடன்",
                        "கடல் பறவை  ",
                        "சிட்டுக்குருவி  ",
                        "அன்னம்   ",
                        "வான்கோழி",
                        "மஞ்சட்குருவி  ",
                        "மரங்கொத்தி",
                };

        flag = new int[]
                {
                        R.drawable.bat,
                        R.drawable.butterfly,
                        R.drawable.chicken,
                        R.drawable.crane,
                        R.drawable.crow,
                        R.drawable.duck,
                        R.drawable.eagle,
                        R.drawable.falcon,
                        R.drawable.fowl,
                        R.drawable.indiancrane,
                        R.drawable.kingfisher,
                        R.drawable.kokila,
                        R.drawable.mina,
                        R.drawable.nightingale,
                        R.drawable.ostrich,
                        R.drawable.owl,
                        R.drawable.parrot,
                        R.drawable.partridge,
                        R.drawable.peacock,
                        R.drawable.peahen,
                        R.drawable.pelican,
                        R.drawable.pigeon,
                        R.drawable.punju,
                        R.drawable.quail,
                        R.drawable.raven,
                        R.drawable.seabird,
                        R.drawable.sparrow,
                        R.drawable.swan,
                        R.drawable.turkey,
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