package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;


public class EBirds extends Activity {

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
                        "Bat",
                        "Butterfly",
                        "Chicken ",
                        "Crane ",
                        "Crow ",
                        "Duck ",
                        "Eagle ",
                        "Falcon",
                        "Fowl ",
                        "Indian Crane ",
                        "Kingfisher ",
                        "Cuckoo ",
                        "Nightiangle",
                        "Ostrich ",
                        "Owl  ",
                        "Parrot",
                        "Partridge",
                        "Peacock ",
                        "Peahen ",
                        "Pelican ",
                        "Pigeon ",
                        "Quail ",
                        "Raven ",
                        "Seabird",
                        "Sparrow ",
                        "Swan  ",
                        "Turkey ",
                        "WeaverBird ",
                        "WoodPeacker",
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