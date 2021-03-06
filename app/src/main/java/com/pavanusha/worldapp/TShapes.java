package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class TShapes extends Activity {

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
                        "வட்டம்",
                        "கூம்பு ",
                        "கன",

                        "சிலிண்டர்",
                        "தசகோணம்",

                        "வைர",
                        "இதயம்",

                        "அறுகோண",
                        "முக்கோணம்",

                        "எண்கோணத்தின்",
                        "முட்டை வடிவம்  ",

                        "இணைகரம்",
                        "பென்டகன் ",

                        "செர்வகம்  ",
                        "நாற்கரம்",

                        "ஹெப்டோகோன்",
                        "கோளம்",

                        "சகுரம் ",
                        "நட்சத்திர ",
                        "சரிவகம்",


                };

        flag = new int[]
                {
                        R.drawable.circle,
                        R.drawable.cone,
                        R.drawable.cube,
                        R.drawable.cylinder,
                        R.drawable.decagon,
                        R.drawable.diamond,
                        R.drawable.heart,
                        R.drawable.hexagon,
                        R.drawable.triangle,
                        R.drawable.octagon,
                        R.drawable.oval_shape,
                        R.drawable.parallelogram,
                        R.drawable.pentagon,

                        R.drawable.rectangle,
                        R.drawable.rhombus,
                        R.drawable.septagone,
                        R.drawable.sphere,
                        R.drawable.square,
                        R.drawable.star,
                        R.drawable.trapezium,


                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(this, category,  flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);
        viewPager.setBackgroundResource(R.drawable.shape_bg);

    }
    public void onBackPressed()
    {
        Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
        finish();


    }

}
