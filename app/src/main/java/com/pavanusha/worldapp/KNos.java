package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class KNos extends Activity {

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
                        "೧ ಒಂದು ",
                        "೨ ಎರಡು  ",
                        "೩ ಮೂರೂ",
                        "೪  ನಾಲ್ಗು ‌",
                        "೫ ಐದು ",
                        "౬ ೬ ಆರು",
                        "೭ ಏಳು  ",
                        " ೮ ಎಂಟು ",
                        "೯ ಒಂಬದು",
                        "೧೦ ಹತ್ತು ",
                        "೧೧  ಹನ್ನೊಂದು ",
                        "೧೨ ಹನ್ನೆರಡು ",
                        "೧೩ ಹದಿ ಮೂರು ",
                        "೧೪ ಹದಿ ನಾಲ್ಕು",
                        "೧೫  ಹದಿನೈದು",
                        "೧೬ ಹದಿನಾರು ",
                        "೧೭ ಹದಿನೇಳು",
                        "೧೮ ಹದಿನೆತ್ತು ",
                        "೧೯ ಹತ್ತೊಂಬೋದು",
                        "೨೦ ಇಪ್ಪತು ",
                        "೩೦ ನುವತ್ತು",
                        "೪೦ ಮಲವತ್ತು ",
                        "೫೦ ಐವತ್ತು ",
                        "೬೦  ಅರವತ್ತು ",
                        "೭೦ ಎಲ್ಳು ವತ್ತು",
                        "೮೦  ಎಪ್ಪತ್ತು ",
                        "೯೦ ತೊಂಬತ್ತು ",
                        "೧೦೦ ನೂರು  ",
                        "೧೦೦೦ ಸಾವಿರ",



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