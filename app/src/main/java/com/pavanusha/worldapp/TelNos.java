package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class TelNos extends Activity {

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
                        "౧ ఒకటి",
                        "౨ రెండు",
                        "౩ మూడు",
                        "౪ నాలుగు‌",
                        "౫ అయిదు",
                        "౬ ఆరు",
                        "౭ ఏడు",
                        "౮ ఎనిమిది",
                        "౯ తొమ్మిది",
                        "౧౦ పది",
                        "౧౧ పదకొండు ",
                        "౧౨ పన్నెండు",
                        "౧౩ పదమూడు",
                        "౧౪ పధ్నాలుగు",
                        "౧౫  పదిహేను",
                        "౧౬ పదహారు",
                        "౧౭ పదిహేడు",
                        "౧౮ పధ్ధెనిమిది",
                        "౧౯ పందొమ్మిది",
                        "౨౦ ఇరవై",
                        "౩౦ 	ముప్పై",
                        "౪౦ 	నలభై ",
                        "౫౦ 	యాభై",
                        "౬౦ 	అరవై ",
                        "౭౦ 	డెబ్బై ",
                        "౮౦ 	ఎనభై ",
                        "౯౦ 	తొంభై ",
                        "౧౦౦ 	వంద ",
                        "౧,౦౦౦ 	వెయ్యి",



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