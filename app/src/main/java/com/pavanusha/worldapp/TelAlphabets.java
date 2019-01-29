package com.pavanusha.worldapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;



public class TelAlphabets extends Activity {

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

                        "అ",
                        "ఆ",
                        "ఇ",
                        "ఈ",
                        "ఉ",
                        "ఊ",
                        "ఋ",
                        "ఎ",
                        "ఏ",
                        "ఐ",
                        "ఒ",
                        "ఓ",
                        "ఔ",
                        "అం",
                        "అః",
                        "క",
                        "ఖ",
                        "గ",
                        "ఘ",
                        "జ్ఞ",
                        "చ",
                        "ఛ",
                        "జ",
                        "ఝ",
                        "ఞ",
                        "ట",
                        "ఠ",
                        "డ",
                        "ఢ",
                        "ణ",
                        "త",
                        "థ",
                        "ద",
                        "ధ",
                        "న",
                        "ప",
                        "ఫ",
                        "బ",
                        "భ",
                        "మ",
                        "య",
                        "ర",
                        "ఱ",
                        "ల",
                        "ళ",
                        "వ",
                        "శ ",
                        "స",
                        "ష",
                        "హ",
                        "క్ష ",
                        "త్ర",
                        "జ్ఞ ",


                };

        flag = new int[]
                {
                        R.drawable.t_a,
                        R.drawable.t_aa,
                        R.drawable.t_u,
                        R.drawable.t_uu,
                        R.drawable.t_vu,
                        R.drawable.t_vuu,
                        R.drawable.t_ru,
                        R.drawable.t_ea,
                        R.drawable.t_eai,
                        R.drawable.t_i,
                        R.drawable.t_o,
                        R.drawable.t_oo,
                        R.drawable.t_ou,
                        R.drawable.t_am,
                        R.drawable.t_aha,

                        R.drawable.t_ka,
                        R.drawable.t_kha,
                        R.drawable.t_ga,
                        R.drawable.t_gha,
                        R.drawable.t_jna,
                        R.drawable.t_cha,
                        R.drawable.t_chaa,
                        R.drawable.t_ja,
                        R.drawable.t_jha,
                        R.drawable.t_ini,
                        R.drawable.t_ta,
                        R.drawable.t_tha,
                        R.drawable.t_da,
                        R.drawable.t_ddha,
                        R.drawable.t_na,
                        R.drawable.t_tta,
                        R.drawable.t_tda,
                        R.drawable.t_tdaa,
                        R.drawable.t_tdha,
                        R.drawable.t_tna,
                        R.drawable.t_pa,
                        R.drawable.t_pha,
                        R.drawable.t_ba,
                        R.drawable.t_bha,
                        R.drawable.t_ma,
                        R.drawable.t_ya,
                        R.drawable.t_ra,
                        R.drawable.m_bra,
                        R.drawable.t_la,
                        R.drawable.t_ala,
                        R.drawable.t_va,
                        R.drawable.t_sha,
                        R.drawable.t_sa,
                        R.drawable.t_shaa,
                        R.drawable.t_ha,
                        R.drawable.t_ksha,
                        R.drawable.t_tra,
                        R.drawable.t_jnaa,


                };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(TelAlphabets.this, category,  flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

    }
    public void onBackPressed()
    {


        Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
        finish();


    }

}