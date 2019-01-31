package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class TSpicies extends Activity {

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
                        "இஞ்சி ",
                        "கடுகு ",
                        "வெள்ளம்",
                        "புன்னை இல்லை ",
                        "பாம்பே கடலை பருப்பு ",
                        " புளி ",
                        " பத்தை",
                        " கொத்தமல்லி  ",
                        " ஏலக்காய் ",
                        " சிரகம் ",
                        "கடலை பருப்பு ",
                        " பெருங்காயம் ",
                        "வற்றல் மிளகாய் ",
                        " தேங்கி ",
                        "குங்குமப்பூ ",
                        " பட்டை   ",
                        "வெந்தயம்",
                        "உளுத்தம் பருப்பு  ",
                        "எலுமிச்ச ம்பலம்",
                        "எள்ளு ",
                        "திரு",
                        "ராக் உப்பு",
                        "வெள்ளை முழு கடலை",
                        "கடலை பருப்பு ",
                        "செக்கர் ",
                        "டென் ",
                        "ஓமம்   ",
                        "வெள்ளை புண்டு  ",
                        "நிலக்கடலை ",
                        "உப்பு ",

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