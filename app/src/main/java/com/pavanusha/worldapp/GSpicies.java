package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class GSpicies extends Activity {

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
                        "અદરક ",
                        "રયે ",
                        "ગોળ ",
                        "તમાલ પત્તા ",
                        "બોમ્બે તળેલી ગ્રામ ",
                        " અમલી ",
                        " તુજ ",
                        " ધનિયા ",
                        " એલાયચી ",
                        " જીરું  ",
                        "શેકેલા દળ ",
                        " હિંગ ",
                        "મિર્ચ  ",
                        " સુકું કોપરું",
                        "કેસર  ",
                        " લવિંગ ",
                        "સુવાદાણા",
                        "काले चने  ",
                        "લીંબુ મીઠું",
                        "તલ ",
                        "દહીં",
                        "સિંધાલૂણ",
                        "બેંગાલગ્રામ",
                        "કઠોળ ફ્રાઇડ ગ્રામ ",
                        "ખાંડ ",
                        "મધ ",
                        "રિક  ",
                        "સુંઠ  ",
                        "જમીન બદામ",
                        "મીઠું ",

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