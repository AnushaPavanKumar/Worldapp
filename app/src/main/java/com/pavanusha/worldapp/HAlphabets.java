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

public class HAlphabets extends Activity implements OnClickListener
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

        imagenumber.setImageResource(R.drawable.h_a);
        txtContent.setText("अ ");

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
            if(screennumber== 49)
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
                imagenumber.setImageResource(R.drawable.h_a);
                txtContent.setText("अ  ");
                break;
            case 2:
                imagenumber.setImageResource(R.drawable.h_aa);
                txtContent.setText("आ ");
                break;
            case 3:
                imagenumber.setImageResource(R.drawable.h_e);
                txtContent.setText("इ ");
                break;
            case 4:
                imagenumber.setImageResource(R.drawable.h_ee);
                txtContent.setText("ई ");
                break;
            case 5:
                imagenumber.setImageResource(R.drawable.h_u);
                txtContent.setText("उ ");
                break;
            case 6:
                imagenumber.setImageResource(R.drawable.h_uu);
                txtContent.setText("ऊ ");
                break;
            case 7:
                imagenumber.setImageResource(R.drawable.h_ru);
                txtContent.setText("ऋ ");
                break;
            case 8:
                imagenumber.setImageResource(R.drawable.h_ea);
                txtContent.setText("ए ");
                break;
            case 9:
                imagenumber.setImageResource(R.drawable.h_eai);
                txtContent.setText("ऐ ");
                break;


            case 10:
                imagenumber.setImageResource(R.drawable.h_oo);
                txtContent.setText("ओ ");
                break;
            case 11:
                imagenumber.setImageResource(R.drawable.h_ou);
                txtContent.setText("औ ");
                break;
            case 12:
                imagenumber.setImageResource(R.drawable.h_am);
                txtContent.setText("अं ");
                break;
            case 13:
                imagenumber.setImageResource(R.drawable.h_aha);
                txtContent.setText("अः ");
                break;
            case 14:
                imagenumber.setImageResource(R.drawable.h_ka);
                txtContent.setText("क ");
                break;
            case 15:
                imagenumber.setImageResource(R.drawable.h_kha);
                txtContent.setText("ख");
                break;
            case 16:
                imagenumber.setImageResource(R.drawable.h_ga);
                txtContent.setText("ग ");
                break;
            case 17:
                imagenumber.setImageResource(R.drawable.h_gha);
                txtContent.setText("घ ");
                break;

            case 18:
                imagenumber.setImageResource(R.drawable.h_jna);
                txtContent.setText("ङ ");
                break;
            case 19:
                imagenumber.setImageResource(R.drawable.h_cha);
                txtContent.setText("च ");
                break;
            case 20:
                imagenumber.setImageResource(R.drawable.h_chha);
                txtContent.setText("छ");
                break;
            case 21:
                imagenumber.setImageResource(R.drawable.h_ja);
                txtContent.setText("ज ");
                break;
            case 22:
                imagenumber.setImageResource(R.drawable.h_jha);
                txtContent.setText("झ");
                break;
            case 23:
                imagenumber.setImageResource(R.drawable.h_ini);
                txtContent.setText("ञ ");
                break;
            case 24:
                imagenumber.setImageResource(R.drawable.h_ta);
                txtContent.setText("ट");
                break;
            case 25:
                imagenumber.setImageResource(R.drawable.h_tha);
                txtContent.setText("ठ ");
                break;
            case 26:
                imagenumber.setImageResource(R.drawable.h_da);
                txtContent.setText("ड  ");
                break;

            case 27:
                imagenumber.setImageResource(R.drawable.h_dha);
                txtContent.setText("ढ ");
                break;
            case 28:
                imagenumber.setImageResource(R.drawable.h_na);
                txtContent.setText("ण ");
                break;
            case 29:
                imagenumber.setImageResource(R.drawable.h_tta);
                txtContent.setText("त ");
                break;
            case 30:
                imagenumber.setImageResource(R.drawable.h_ttha);
                txtContent.setText("थ ");
                break;
            case 31:
                imagenumber.setImageResource(R.drawable.h_tda);
                txtContent.setText("द  ");
                break;

            case 32:
                imagenumber.setImageResource(R.drawable.h_tdha);
                txtContent.setText("ध ");
                break;
            case 33:
                imagenumber.setImageResource(R.drawable.h_tna);
                txtContent.setText("न ");
                break;
            case 34:
                imagenumber.setImageResource(R.drawable.h_pa);
                txtContent.setText("प ");
                break;
            case 35:
                imagenumber.setImageResource(R.drawable.h_pha);
                txtContent.setText("फ ");
                break;
            case 36:
                imagenumber.setImageResource(R.drawable.h_ba);
                txtContent.setText("ब  ");
                break;
            case 37:
                imagenumber.setImageResource(R.drawable.h_bha);
                txtContent.setText("भ ");
                break;
            case 38:
                imagenumber.setImageResource(R.drawable.h_ma);
                txtContent.setText("म ");
                break;
            case 39:
                imagenumber.setImageResource(R.drawable.h_ya);
                txtContent.setText("य  ");
                break;
            case 40:
                imagenumber.setImageResource(R.drawable.h_ra);
                txtContent.setText("र ");
                break;
            case 41:
                imagenumber.setImageResource(R.drawable.h_la);
                txtContent.setText("ल ");
                break;

            case 42:
                imagenumber.setImageResource(R.drawable.h_va);
                txtContent.setText("व  ");
                break;
            case 43:
                imagenumber.setImageResource(R.drawable.h_sa);
                txtContent.setText("श ");
                break;
            case 44:
                imagenumber.setImageResource(R.drawable.h_sha);
                txtContent.setText("ष ");
                break;
            case 45:
                imagenumber.setImageResource(R.drawable.h_ssa);
                txtContent.setText("स  ");
                break;
            case 46:
                imagenumber.setImageResource(R.drawable.h_ha);
                txtContent.setText("ह ");
                break;
            case 47:
                imagenumber.setImageResource(R.drawable.h_ksha);
                txtContent.setText("क्ष ");
                break;
            case 48:
                imagenumber.setImageResource(R.drawable.h_tra);
                txtContent.setText("त्र ");
                break;
            case 49:
                imagenumber.setImageResource(R.drawable.h_zna);
                txtContent.setText("ज्ञ  ");
                break;
        }
    }//end changeNumber

}