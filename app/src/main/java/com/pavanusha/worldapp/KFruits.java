package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class KFruits extends Activity {

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

                        "ಅಂಜೂರ",
                        " ಸೇಬು ",
                        " ಬಾದಾಮಿ",
                        "ಬಾಳೆಹಣ್ಣು",
                        "ಬೆರ್ರಿ ಹಣ್ಣು ",
                        "ಚೆರ್ರಿ",
                        " ಕಬ್ಬು   ",
                        "ದಾಳಿಂಬೆ ",
                        "ಉತ್ತುತ್ತೆ ",
                        "ಕಾಡು ದಿನಾಂಕ ಹಣ್ಣು  ",
                        "કಒಣದ್ರಾಕ್ಷಿ",
                        "ಗೇರು ಬೀಜದ",
                        "દದ್ರಾಕ್ಷಿ ",
                        " ಗೋವಹಣ್ಣು ",

                        "ಕಸ್ತೂರಿ ಕಲ್ಲಂಗಡಿ ",

                        "કಲಕ್ಷ್ಮಣ ಫಲಂ",
                        "ಲಿಂಬೆ ",
                        "ಲಿಚಿ ಬೆಳೆಯ",
                        "ಲಕ್ಕೋಟೆ ಹಣ್ಣು  ",
                        "ಮಾವಿನ ",
                        "ಹಾಗ್ ಪ್ಲಮ್",
                        "ನರಳೇ ಹಣ್ಣು ",
                        "ಬುದ್ದೆ ಹಣ್ಣು   ",
                        "ಕಿತ್ತಳೆ ಹಣ್ಣು ",
                        "ಚಕ್ಕೋತ ",
                        "દಪರಂಗಿ ",
                        "ಮರ ಸೇಬು",
                        "ಪೈನ್ ಸೇಬು",
                        "ರಾಮ ಫಲಂ ",
                        "ಪ್ಲಮ್ ",
                        "ಚಿಕ್ಕೂ  / ಸಪೋಟ",
                        "ಸೀತ ಫಲಂ ",
                        "ભನೆಲಮುಲ್ಲಿ ಹಣ್ಣು  ",
                        "ಕೋಮಲ ಪಾಲಂ ",
                        "ಕೋಮಲ ಪಾಲಂ ಚಿಗುರುಗಳು",
                        "ನೆಲ್ಲಿಕಾಯಿ ",
                        "ಬೇಲದ ಹಣ್ಣು  ",
                        "ટದಾಸ ಮೆಕ್ಕೆ ",
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