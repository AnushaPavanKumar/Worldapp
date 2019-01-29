package com.pavanusha.worldapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class KAlphabets extends Activity implements OnClickListener
{
    TextView txtContent;
    private ImageView imagenumber;
    private ImageButton btnprevious,  btnnext;
    private int screennumber=0;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);

        Intent i = getIntent();
        String title= i.getExtras().getString("title");
        setTitle(title);

        txtContent = (TextView) findViewById(R.id.txt);
        Typeface font ;
        font = Typeface.createFromAsset(getAssets(), "akshar.ttf");
        txtContent.setTypeface(font);

        imagenumber=(ImageView)findViewById(R.id.imagenumber);

        imagenumber.setImageResource(R.drawable.k_a);
        txtContent.setText("ಅ");

        btnprevious=(ImageButton)findViewById(R.id.btnprevious);
        btnprevious.setEnabled(false);
        btnprevious.setOnClickListener(this);

        btnnext=(ImageButton)findViewById(R.id.btnnext);
        btnnext.setOnClickListener(this);

    }

    public void onClick(View arg0)
    {

        if(arg0.getId()==R.id.btnprevious)
        {
            screennumber--;//minus 1 to the screennumber
            changeNumber(screennumber);
            if(screennumber==0){
                //disable btnprevious
                btnprevious.setEnabled(false);
            }
            else
            {
                //enable btnprevious
                btnprevious.setEnabled(true);
            }
            changeNumber(screennumber);
            btnnext.setEnabled(true);
        }
        else if(arg0.getId()==R.id.btnnext)
        {
            screennumber++;//add 1 to the screennumber
            changeNumber(screennumber);
            if(screennumber== 50)
            {
                //disable btnprevious
                btnnext.setEnabled(false);
            }
            else
            {
                //enable btnprevious
                btnnext.setEnabled(true);
            }
            changeNumber(screennumber);
            btnprevious.setEnabled(true);

        }

    }//end onClick

    private void changeNumber(int screen)
    {
        switch (screen)
        {
            case 1:
                imagenumber.setImageResource(R.drawable.k_a);
                txtContent.setText("ಅ ");
                break;
            case 2:
                imagenumber.setImageResource(R.drawable.k_aa);
                txtContent.setText("ಆ");
                break;
            case 3:
                imagenumber.setImageResource(R.drawable.k_u);
                txtContent.setText("ಇ ");
                break;
            case 4:
                imagenumber.setImageResource(R.drawable.k_uu);
                txtContent.setText("ಈ ");
                break;
            case 5:
                imagenumber.setImageResource(R.drawable.k_vu);
                txtContent.setText("ಉ ");
                break;
            case 6:
                imagenumber.setImageResource(R.drawable.k_vu);
                txtContent.setText("ಊ ");
                break;
            case 7:
                imagenumber.setImageResource(R.drawable.k_yu);
                txtContent.setText("ಋ ");
                break;
            case 8:
                imagenumber.setImageResource(R.drawable.k_yuu);
                txtContent.setText("ೠ ");
                break;
            case 9:
                imagenumber.setImageResource(R.drawable.k_ea);
                txtContent.setText("ಎ ");
                break;
            case 10:
                imagenumber.setImageResource(R.drawable.k_eai);
                txtContent.setText("ಏ ");
                break;


            case 11:
                imagenumber.setImageResource(R.drawable.k_i);
                txtContent.setText("ಐ ");
                break;
            case 12:
                imagenumber.setImageResource(R.drawable.k_o);
                txtContent.setText("ಒ ");
                break;
            case 13:
                imagenumber.setImageResource(R.drawable.k_oo);
                txtContent.setText("ಓ ");
                break;
            case 14:
                imagenumber.setImageResource(R.drawable.k_ou);
                txtContent.setText("ಔ ");
                break;
            case 15:
                imagenumber.setImageResource(R.drawable.k_am);
                txtContent.setText("ಅಂ  ");
                break;
            case 16:
                imagenumber.setImageResource(R.drawable.k_aha);
                txtContent.setText("ಅಃ ");
                break;
            case 17:
                imagenumber.setImageResource(R.drawable.k_ka);
                txtContent.setText("ಕ ");
                break;
            case 18:
                imagenumber.setImageResource(R.drawable.k_kha);
                txtContent.setText("ಖ ");
                break;
            case 19:
                imagenumber.setImageResource(R.drawable.k_ga);
                txtContent.setText("ಗ ");
                break;

            case 20:
                imagenumber.setImageResource(R.drawable.k_gha);
                txtContent.setText("ಘ ");
                break;
            case 21:
                imagenumber.setImageResource(R.drawable.k_ini);
                txtContent.setText("ಙ ");
                break;
            case 22:
                imagenumber.setImageResource(R.drawable.k_cha);
                txtContent.setText("ಚ ");
                break;
            case 23:
                imagenumber.setImageResource(R.drawable.k_chaa);
                txtContent.setText("ಛ ");
                break;
            case 24:
                imagenumber.setImageResource(R.drawable.k_ja);
                txtContent.setText("ಜ ");
                break;
            case 25:
                imagenumber.setImageResource(R.drawable.k_jha);
                txtContent.setText("ಝ ");
                break;
            case 26:
                imagenumber.setImageResource(R.drawable.k_inni);
                txtContent.setText("ಞ ");
                break;
            case 27:
                imagenumber.setImageResource(R.drawable.k_ta);
                txtContent.setText("ಟ ");
                break;
            case 28:
                imagenumber.setImageResource(R.drawable.k_tha);
                txtContent.setText("ಠ ");
                break;

            case 29:
                imagenumber.setImageResource(R.drawable.k_da);
                txtContent.setText("ಡ ");
                break;
            case 30:
                imagenumber.setImageResource(R.drawable.k_dha);
                txtContent.setText("ಢ ");
                break;
            case 31:
                imagenumber.setImageResource(R.drawable.k_na);
                txtContent.setText("ಣ ");
                break;
            case 32:
                imagenumber.setImageResource(R.drawable.k_tta);
                txtContent.setText("ತ ");
                break;
            case 33:
                imagenumber.setImageResource(R.drawable.k_ttha);
                txtContent.setText("ಥ ");
                break;

            case 34:
                imagenumber.setImageResource(R.drawable.k_tda);
                txtContent.setText("ದ ");
                break;
            case 35:
                imagenumber.setImageResource(R.drawable.k_tdha);
                txtContent.setText("ಧ ");
                break;
            case 36:
                imagenumber.setImageResource(R.drawable.k_tna);
                txtContent.setText("ನ ");
                break;
            case 37:
                imagenumber.setImageResource(R.drawable.k_pa);
                txtContent.setText("ಪ ");
                break;
            case 38:
                imagenumber.setImageResource(R.drawable.k_pha);
                txtContent.setText("ಫ  ");
                break;
            case 39:
                imagenumber.setImageResource(R.drawable.k_ba);
                txtContent.setText("ಬ ");
                break;
            case 40:
                imagenumber.setImageResource(R.drawable.k_bha);
                txtContent.setText("ಭ  ");
                break;
            case 41:
                imagenumber.setImageResource(R.drawable.k_ma);
                txtContent.setText("ಮ  ");
                break;
            case 42:
                imagenumber.setImageResource(R.drawable.k_ya);
                txtContent.setText("ಯ ");
                break;
            case 43:
                imagenumber.setImageResource(R.drawable.k_ra);
                txtContent.setText("ರ ");
                break;

            case 44:
                imagenumber.setImageResource(R.drawable.k_la);
                txtContent.setText("ಲ ");
                break;
            case 45:
                imagenumber.setImageResource(R.drawable.k_va);
                txtContent.setText("ವ ");
                break;

            case 46:
                imagenumber.setImageResource(R.drawable.k_sha);
                txtContent.setText("ಶ  ");
                break;
            case 47:
                imagenumber.setImageResource(R.drawable.k_shha);
                txtContent.setText("ಷ ");
                break;
            case 48:
                imagenumber.setImageResource(R.drawable.k_sa);
                txtContent.setText("ಸ ");
                break;
            case 49:
                imagenumber.setImageResource(R.drawable.k_ha);
                txtContent.setText("ಹ  ");
                break;
            case 50:
                imagenumber.setImageResource(R.drawable.k_ala);
                txtContent.setText("ಳ  ");
                break;
        }
    }//end changeNumber
}