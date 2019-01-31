package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;


public class EVegetables extends Activity {

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
                        "Raw Banana ",
                        "Ladies fingers ",
                        "BengloreBringal ",
                        "Ridgeguard",
                        "BroaadBeans ",
                        "Ash Gourd ",
                        "Cabbage ",

                        "Capsicum",

                        "Cauliflower",

                        "Colocisa ",

                        "Sweet Potato ",
                        "Citron ",
                        "Gherkin ",
                        "DrumStick",
                        "FrenchBeans",
                        "ClusterBeans",
                        "GreenChillies",
                        "GreenPeas ",
                        "BitterGourd",
                        "Yam ",
                        "Topiaco ",
                        "Cucumber ",
                        "Radish",
                        "Mushrooms ",
                        "SilkSquash ",
                        "Onion ",
                        "PointedGourd",
                        "Potato",
                        "SnakeGourd  ",
                        "Pumpkin",

                        "BottleGourd  ",
                        " Tamota",
                        "SpringOnions ",
                        "CranBerry ",
                        "Bringal",

                };

        flag = new int[]
                {
                        R.drawable.arikaya,
                        R.drawable.bendakaya,
                        R.drawable.benglorevankaya,
                        R.drawable.beerakaya,
                        R.drawable.braodbeans,
                        R.drawable.budidagummadikaya,
                        R.drawable.cabbage,
                        R.drawable.capsicum,
                        R.drawable.cauliflower,
                        R.drawable.chemadumpa,
                        R.drawable.chilakadadumpa,
                        R.drawable.dabbakaya,
                        R.drawable.dondakaya,
                        R.drawable.drumstick,
                        R.drawable.frenchbeans,
                        R.drawable.goruchukkudu,
                        R.drawable.greenchilli,
                        R.drawable.greenpeas,
                        R.drawable.kakarakaya,
                        R.drawable.kanda,
                        R.drawable.karrapendalam,
                        R.drawable.kiradosakaya,
                        R.drawable.mullangi,
                        R.drawable.mushrooms,
                        R.drawable.netibeerakaya,
                        R.drawable.onion,
                        R.drawable.pointedgourd,
                        R.drawable.potato,
                        R.drawable.potlakaya,
                        R.drawable.pumpkin,
                        R.drawable.sorakaya,
                        R.drawable.tamato,
                        R.drawable.ullikadalu,
                        R.drawable.vakaya,
                        R.drawable.vankaya,
                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(this, category,  flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);
        viewPager.setBackgroundResource(R.drawable.veg_bg);

    }
    public void onBackPressed()
    {
        Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
        finish();


    }

}