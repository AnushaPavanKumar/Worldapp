package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class TelShapes extends Activity {

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
                        "వృత్తం",
                        "శంఖం ",
                        "ఘన చతురస్రం",

                        "స్తంభం",
                        "దశ భుజం",

                        "వజ్రాకృతి",
                        "హృదయాకారం",

                        "షడ్భుజం",
                        "త్రి భుజం",

                        "అష్ట భుజం",
                        "గుడ్డ ఆకారం ",

                        "సమాంతర",
                        "పంచ భుజం ",

                        "దీర్ఘ చతురస్రం ",
                        "వజ్రాకారం",

                        "సప్త భుజం",
                        "గోళం",

                        "చతురస్రం ",
                        "నక్షత్రం",
                        "సమలంబ చతుర్భుజం",


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

    }
    public void onBackPressed()
    {
        Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
        finish();


    }

}
