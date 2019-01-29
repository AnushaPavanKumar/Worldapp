package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;


public class TelBirds extends Activity {

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
                        "గబ్బిలము",
                        "సీతాకోక చిలుక",
                        "కోడి పిల్ల ",
                        "కొంగ ",
                        "కాకి ",
                        "బాతు ",
                        "గ్రద్ద ",
                        "బైరియను పక్షి ",
                        "కోడి ",
                        "భారత కొంగ ",
                        "కింగ్ ఫిషర్  ",
                        "కోకిల ",
                        "మగ బాతు ",
                        "మైనా  ",
                        "మధురంగా రాత్రి పాడే పక్షి   ",
                        "నిప్పుకోడి",
                        "గుడ్ల గూబ",
                        "రామ చిలుక ",
                        "వేటగా పనికి వచ్చే పక్షి ",
                        "నెమలి ",
                        "మగ నెమలి ",
                        "గూడా కొంగ ",
                        "పావురము ",
                        "కోడి పుంజు ",
                        "బుర్ర పిట్ట  ",
                        "రాబందు  ",
                         "సముద్ర పక్షి  ",
                        "పిచుక ",
                        "హంస ",
                        "సిమకోడి  ",
                        "గిజిగాడు  ",
                        "చెకుముకి పిట్ట ",
                };

        flag = new int[]
                {
                        R.drawable.bat,
                        R.drawable.butterfly,
                        R.drawable.chicken,
                        R.drawable.crane,
                        R.drawable.crow,
                        R.drawable.duck,
                        R.drawable.eagle,
                        R.drawable.falcon,
                        R.drawable.fowl,
                        R.drawable.indiancrane,
                        R.drawable.kingfisher,
                        R.drawable.kokila,
                        R.drawable.magabathu,
                        R.drawable.mina,
                        R.drawable.nightingale,
                        R.drawable.ostrich,
                        R.drawable.owl,
                        R.drawable.parrot,
                        R.drawable.partridge,
                        R.drawable.peacock,
                        R.drawable.peahen,
                        R.drawable.pelican,
                        R.drawable.pigeon,
                        R.drawable.punju,
                        R.drawable.quail,
                        R.drawable.rabandu,
                        R.drawable.seabird,
                        R.drawable.sparrow,
                        R.drawable.swan,
                        R.drawable.turkey,
                        R.drawable.weaverbird,
                        R.drawable.woodpeacker,


                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(this, category,  flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

    }
    public void onBackPressed()
    {
        Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
        finish();


    }

}