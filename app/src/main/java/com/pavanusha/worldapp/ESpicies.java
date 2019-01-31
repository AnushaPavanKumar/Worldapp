package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class ESpicies extends Activity {

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
                        "GINGER",
                        "MUSTAR SEEDS ",
                        "JAGGERY ",
                        "BIRIYANI LEAF ",
                        "BOMBAY BENGAL GRAM",
                        " TAMARIND",
                        " CINNAMON ",
                        " CORINADER  ",
                        " CARDAMOM ",
                        " CUMIN SEEDS  ",
                        "ROASTED DAL",
                        " ASAFOETIDA",
                        "RED  CHILLY POWDER",
                        " COCONUT ",
                        "SAFFRON",
                        " CLOVES  ",
                        "FENU GREEK",
                        "BLACK GRAM ",
                        "LEMON SALT",
                        "SEASAME SEEDS",
                        "YOGURT",
                        "SALT",
                        "ROCK SALT",
                        "RAW BENGAL SEEDS",
                        "BENGAL GRAM",
                        "SUGAR ",
                        "HONEY  ",
                        "AJOWAN  ",
                        "GARLIC ",
                        "GROUND NUTS ",

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
                        R.drawable.nuvvulu,
                        R.drawable.perugu,
                        R.drawable.vuppu,
                        R.drawable.rallavuppu,
                        R.drawable.senagalu,
                        R.drawable.senagapappu,
                        R.drawable.sugar,
                        R.drawable.tene,
                        R.drawable.vamu,
                        R.drawable.velluli,
                        R.drawable.verusengalagullu,
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