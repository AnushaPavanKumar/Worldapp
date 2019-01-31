package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class EFruits extends Activity {

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

                        "Figs",
                        " Apple",
                        " Almond",
                        "Banana",
                        "Black Berry",
                        " Cherry",
                        " Sugar  Cane   ",
                        "Pomagranate",
                        "Dates ",
                        "Wild Date Fruit ",
                        "Raisin",
                        "Cashewnut",
                        "Grape",
                        "Guava",

                        "Musk Melon ",

                        "Currant",
                        "Lakashmanapalam ",
                        "Lemon ",
                        "Litch",
                        "Loquat ",
                        "Mango",
                        "HogPlum ",
                        "Black Currant ",
                        "CapeGooseBerry  ",
                        "Orange",
                        "Grape Fruit ",
                        "Papaya",
                        "Peach",
                        "Pear",
                        "Pine Apple",
                        "Plum",
                        "Ramaphalam ",
                        "Rase Berries ",
                        "Plum",
                        "Sapodilla",
                        "Custard Apple ",
                        "Straw Berry  ",
                        "Tender Palm",
                        "TenderPalmShoots ",
                        "Goose Berry",
                        "Wood Apple",
                        "Water Melon",
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