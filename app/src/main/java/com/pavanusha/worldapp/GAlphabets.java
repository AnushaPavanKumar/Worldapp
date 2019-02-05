package com.pavanusha.worldapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class GAlphabets extends Activity {

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

                        "અ",
                        "આ",
                        "ઇ",
                        "ઈ",
                        "ઉ",
                        "ઊ",
                        "એ",
                        "ઐ",
                        "ઓ",
                        "ઔ",
                        "અં",
                        "અઃ",
                        "ક",
                        "ખ",
                        "ગ",
                        "ઘ",
                        "ઙ",
                        "ચ",
                        "છ",
                        "જ",
                        "ઝ",
                        "ઞ",
                        "ટ",
                        "ઠ",
                        "ડ",
                        "ઢ",
                        "ણ",
                        "ત",
                        "થ",
                        "દ",
                        "ધ",
                        "ન",
                        "પ",
                        "ફ",
                        "બ",
                        "ప",
                        "ભ",
                        "મ",
                        "ય",
                        "ર",
                        "લ",
                        "વ",
                        "શ",
                        "ષ",
                        "સ",
                        "ह",
                        "ળ ",
                        "ક્ષ",
                        "જ્ઞ",



                };

        flag = new int[]
                {
                        R.drawable.g_a,
                        R.drawable.g_aa,
                        R.drawable.g_e,
                        R.drawable.g_ee,
                        R.drawable.g_u,
                        R.drawable.g_uu,
                        R.drawable.g_ea,
                        R.drawable.g_eai,
                        R.drawable.g_ou,
                        R.drawable.g_ouu,
                        R.drawable.g_am,
                        R.drawable.g_aha,
                        R.drawable.g_ka,
                        R.drawable.g_kha,
                        R.drawable.g_ga,

                        R.drawable.g_gha,
                        R.drawable.g_jna,
                        R.drawable.g_cha,
                        R.drawable.g_chha,
                        R.drawable.g_ja,
                        R.drawable.g_jha,
                        R.drawable.g_ini,
                        R.drawable.g_ta,
                        R.drawable.g_tha,
                        R.drawable.g_da,
                        R.drawable.g_dha,
                        R.drawable.g_na,
                        R.drawable.g_tta,
                        R.drawable.g_ttha,
                        R.drawable.g_tda,
                        R.drawable.g_tdha,
                        R.drawable.g_tna,
                        R.drawable.g_pa,
                        R.drawable.g_pha,
                        R.drawable.g_ba,
                        R.drawable.g_bha,
                        R.drawable.g_ma,
                        R.drawable.g_ya,
                        R.drawable.g_ra,
                        R.drawable.g_la,
                        R.drawable.g_va,
                        R.drawable.g_sha,
                        R.drawable.g_shha,
                        R.drawable.g_sa,
                        R.drawable.g_ha,
                        R.drawable.g_ala,
                        R.drawable.g_ksha,
                        R.drawable.g_zna,


                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(GAlphabets.this, category,  flag);
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