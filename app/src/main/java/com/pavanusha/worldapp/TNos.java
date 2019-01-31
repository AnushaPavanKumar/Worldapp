package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class TNos extends Activity {

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
                        "௧  ஒன்று ",
                        "௨  இரண்டு ",
                        "௩ மூன்று",
                        "௪ நான்கு‌",
                        "௫ ஐந்து",
                        "௬ ஆறு",
                        "௭  ஏழு",
                        "௮ எட்டு",
                        "௯ ஒன்பது",
                        "௧௦ பத்து ",
                        "௧௧ பதினொன்று ",
                        "௧௨  பன்னிரண்டு",
                        "௧௩ பதின்மூன்று",
                        "௧௪ பதினான்கு",
                        "௧௫ பதினைந்து",
                        "௧௬ பதினாறு ",
                        "௧௭ பதினேழு  ",
                        "௧௮ பதினெட்டு",
                        "௧௯  பத்தொன்பது ",
                        "௨௦ இருபது ",
                        "௩௦ முப்பது ",
                        "௪௦ நாற்பது",
                        "௫௦  ஐம்பது",
                        "௬௦ அறுபது  ",
                        "௭௦  எழுபது",
                        "௮௦ எண்பது ",
                        "௯௦ தொண்ணூறு ",
                        "௧௦௦ நூறு ",
                        "௧௦௦௦ ஆயிரம்",



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