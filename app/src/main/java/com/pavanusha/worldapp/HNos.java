package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class HNos extends Activity {

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
                        "१ एक",
                        "२ दो ",
                        "३ तीन",
                        "४ चार ‌",
                        "५ पांच",
                        "६ छे ",
                        "७ सात",
                        "८ आट ",
                        "९ नौ",
                        "१० दस ",
                        "११ ग्यारह ",
                        "१२ बारह",
                        "१३ तेरह ",
                        "१४ चौदह",
                        "१५ पन्द्रह",
                        "१६ सोलह",
                        "१७ सत्रह",
                        "१८ अठारह",
                        "१९ उन्नीस",
                        "२० बीस ",
                        "३० तीस",
                        "४० चालीस ",
                        "५०  पचास",
                        "६० साठ ",
                        "७० सत्तर ",
                        "८० अस्सी",
                        "९० नब्बे",
                        "१०० एक सौ ",
                        "१००० एक हज़ार",



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