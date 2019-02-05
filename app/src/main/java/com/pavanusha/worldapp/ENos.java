package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class ENos extends Activity {

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
                        "1 ONE",
                        "2 TWO",
                        "3 THREE",
                        "4 FOUR‌",
                        "5 FIVE",
                        "6 SIX",
                        "7 SEVEN",
                        "8 EIGHT",
                        "9 NINE",
                        "10 TEN",
                        "11 ELEVEN",
                        "12 TWELVE",
                        "13 THIRTEEN",
                        "14 FOURTEEN",
                        "15 FIFTEEN",
                        "16 SIXTEEN",
                        "17 SEVENTEEN",
                        "18 EIGHTEEN",
                        "19 NINETEEN",
                        "20 TWENTY",
                        "30 THIRTY",
                        "40 FOURTY",
                        "50 FIFTY",
                        "60 SIXTY",
                        "70 SEVENTY",
                        "80 EIGHTY ",
                        "90 NINETY ",
                        "100 HUNDERED ",
                        "1000 THOUSAND",



                };

        flag = new int[]
                {
                        R.drawable.one,
                        R.drawable.two,
                        R.drawable.three,
                        R.drawable.four,
                        R.drawable.five,
                        R.drawable.six,
                        R.drawable.seven,
                        R.drawable.eight,
                        R.drawable.nine,
                        R.drawable.ten,
                        R.drawable.eleven,
                        R.drawable.twelve,
                        R.drawable.thirteen,
                        R.drawable.fourteen,
                        R.drawable.fifteen,
                        R.drawable.sixteen,
                        R.drawable.seventeen,
                        R.drawable.eighteen,
                        R.drawable.ninteen,
                        R.drawable.twenty,
                        R.drawable.thirty,
                        R.drawable.fourty,
                        R.drawable.fifty,
                        R.drawable.sixty,
                        R.drawable.seventy,
                        R.drawable.eighty,
                        R.drawable.ninty,
                        R.drawable.hundered,
                        R.drawable.thousand,

                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(this, category,  flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);
        viewPager.setBackgroundResource(R.drawable.num_bg);

    }

    public void onBackPressed()
    {
        Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
        finish();


    }

}