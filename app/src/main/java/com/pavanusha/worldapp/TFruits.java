package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class TFruits extends Activity {

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

                        "அட்டி பழம் ",
                        " அப்ப்லேபழம் ",
                        " பாதம் கொட்டை",
                        " வலை",
                        " மேற்கத்திய நாவற்பழம் ",
                        " சேலாப்பழம் ",
                        " கரும்பு ",
                        "கடார நாரந்தை",
                        "மாதுளம் பழம், மாதுளை ",
                        "பேரீச்சம் பழம்",
                        "நீச்சல் பழம்",
                        "உனக்கமுந்திரி",
                        "முந்திரிப்பழம், கஜு",
                        "கொடி முந்திரி, திராட்சை ",

                        "கொய்யாப்பழம்",

                        "முலம் பழம் ",
                        "கிஸ்மிஸ் ",
                        "லக்ஷ்மன் ப்ஹலம்  ",
                        "வர்க்கப்பழம்  ",
                        "லிட்சி  ",
                        "லோகட் ",
                        "மாம்பழம்  ",
                        "கறுந்திராட்சை ",
                        "ஆம்லா     ",
                        "தோடம்பழம்",
                        "தோடம்பழம் ",
                        "பம்பரமாசு",
                        "பப்பாப் பழம் ",
                        "குழிப்பேரி ",
                        "பேரி, பெயார்ஸ்",
                        "அன்னாசிப் பழம்",
                        "ஆல்பக்கோடா  ",
                        "ராமப்ஹலம் ",
                        "புற்றுப்பழம் ",
                        "ஆல்பக்கோடா ",
                        "சீமையிலுப்பை ",
                        "சிட ப்ஹலம்    ",
                        " செம்புற்றுப்பழம்",
                        "பாம் கை ",
                        "తేగలు ",
                        "கூஸ்பெறி",
                        "விளாம்பழம் ",
                        "வத்தகைப்பழம், குமட்டிப்பழம், தர்பூசணி",

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