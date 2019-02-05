package com.pavanusha.worldapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class EAlphabets extends Activity {

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

                        "A",
                        "B",
                        "C",
                        "D",
                        "E",
                        "F",
                        "G",
                        "H",
                        "I",
                        "J",
                        "K",
                        "L",
                        "M",
                        "N",
                        "O",
                        "P",
                        "Q",
                        "R",
                        "S",
                        "T",
                        "U",
                        "V",
                        "W",
                        "X",
                        "Y",
                        "Z",



                };

        flag = new int[]
                {
                        R.drawable.e_a,
                        R.drawable.e_b,
                        R.drawable.e_c,
                        R.drawable.e_d,
                        R.drawable.e_f,
                        R.drawable.e_g,
                        R.drawable.e_h,
                        R.drawable.e_i,
                        R.drawable.e_j,
                        R.drawable.e_k,
                        R.drawable.e_l,
                        R.drawable.e_m,
                        R.drawable.e_n,
                        R.drawable.e_o,
                        R.drawable.e_p,

                        R.drawable.e_q,
                        R.drawable.e_r,
                        R.drawable.e_s,
                        R.drawable.e_t,
                        R.drawable.e_u,
                        R.drawable.e_v,
                        R.drawable.e_w,
                        R.drawable.e_x,
                        R.drawable.e_y,
                        R.drawable.e_z,
                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(EAlphabets.this, category,  flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);
        viewPager.setBackgroundResource(R.drawable.alphabets_bg);

    }
    public void onBackPressed()
    {


        Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
        finish();


    }

}