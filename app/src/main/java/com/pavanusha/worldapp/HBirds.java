package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;


public class HBirds extends Activity {

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
                        "बल्ला",
                        "मक्खन मक्खी",
                        "मुर्गी ",
                        "सारस",
                        "कौआ ",
                        "बत्तख",
                        "गस्र्ड ",
                        "बाज़",
                        "मुर्गी",
                        "भारतीय सारस",
                        "किंगफ़िशर",
                        "कोयल",
                        "पुरुष बतख",
                        "मैना ",
                        "बुलबुल ",
                        "शुतुर मुर्ग",
                        "उल्लू ",
                        "तोता ",
                        "तीतर",
                        "मोर ",
                        "मोरनी",
                        "हवासील",
                        "कबूतर",
                        "मुरग़ा",
                        "बटेर",
                        "गिद्ध",
                        "काला कौआ",
                        "सीबर्ड",
                        "गौरैया",
                        "हंस",
                        "गिन्नी",
                        "बुनकर पक्षी",
                        "कठ फोडवा",

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
                        R.drawable.magabathu,
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
                        R.drawable.rabandu,
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