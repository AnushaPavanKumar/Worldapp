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

public class GAlphabets extends Activity implements OnClickListener
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
        font = Typeface.createFromAsset(getAssets(), "Lohit-Gujarati.ttf");
        txtContent.setTypeface(font);

        imagenumber=(ImageView)findViewById(R.id.imagenumber);

        imagenumber.setImageResource(R.drawable.g_a);
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
            if(screennumber== 48)
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
            case 0:
                imagenumber.setImageResource(R.drawable.g_a);
                txtContent.setText("અ");
                break;
            case 1:
                imagenumber.setImageResource(R.drawable.g_aa);
                txtContent.setText("આ");
                break;
            case 2:
                imagenumber.setImageResource(R.drawable.g_e);
                txtContent.setText("ઇ");
                break;
            case 3:
                imagenumber.setImageResource(R.drawable.g_ee);
                txtContent.setText("ઈ");
                break;
            case 4:
                imagenumber.setImageResource(R.drawable.g_u);
                txtContent.setText("ઉ");
                break;
            case 5:
                imagenumber.setImageResource(R.drawable.g_uu);
                txtContent.setText("ઊ");
                break;
            case 6:
                imagenumber.setImageResource(R.drawable.g_ea);
                txtContent.setText("એ");
                break;
            case 7:
                imagenumber.setImageResource(R.drawable.g_eai);
                txtContent.setText("ઐ");
                break;
            case 8:
                imagenumber.setImageResource(R.drawable.g_ou);
                txtContent.setText("ઓ");
                break;


            case 9:
                imagenumber.setImageResource(R.drawable.g_ouu);
                txtContent.setText("ઔ");
                break;
            case 10:
                imagenumber.setImageResource(R.drawable.g_am);
                txtContent.setText("અં");
                break;
            case 11:
                imagenumber.setImageResource(R.drawable.g_aha);
                txtContent.setText("અઃ");
                break;
            case 12:
                imagenumber.setImageResource(R.drawable.g_ka);
                txtContent.setText("ક");
                break;
            case 13:
                imagenumber.setImageResource(R.drawable.g_kha);
                txtContent.setText("ખ");
                break;
            case 14:
                imagenumber.setImageResource(R.drawable.g_ga);
                txtContent.setText("ગ");
                break;
            case 15:
                imagenumber.setImageResource(R.drawable.g_gha);
                txtContent.setText("ઘ");
                break;

            case 16:
                imagenumber.setImageResource(R.drawable.g_jna);
                txtContent.setText("ઙ");
                break;
            case 17:
                imagenumber.setImageResource(R.drawable.g_cha);
                txtContent.setText("ચ");
                break;
            case 18:
                imagenumber.setImageResource(R.drawable.g_chha);
                txtContent.setText("છ");
                break;
            case 19:
                imagenumber.setImageResource(R.drawable.g_ja);
                txtContent.setText("જ");
                break;
            case 20:
                imagenumber.setImageResource(R.drawable.g_jha);
                txtContent.setText("ઝ");
                break;
            case 21:
                imagenumber.setImageResource(R.drawable.g_ini);
                txtContent.setText("ઞ");
                break;
            case 22:
                imagenumber.setImageResource(R.drawable.g_ta);
                txtContent.setText("ટ");
                break;
            case 23:
                imagenumber.setImageResource(R.drawable.g_tha);
                txtContent.setText("ઠ");
                break;
            case 24:
                imagenumber.setImageResource(R.drawable.g_da);
                txtContent.setText("ડ");
                break;

            case 25:
                imagenumber.setImageResource(R.drawable.g_dha);
                txtContent.setText("ઢ");
                break;
            case 26:
                imagenumber.setImageResource(R.drawable.g_na);
                txtContent.setText("ણ");
                break;
            case 27:
                imagenumber.setImageResource(R.drawable.g_tta);
                txtContent.setText("ત");
                break;
            case 28:
                imagenumber.setImageResource(R.drawable.g_ttha);
                txtContent.setText("થ");
                break;
            case 29:
                imagenumber.setImageResource(R.drawable.g_tda);
                txtContent.setText("દ");
                break;

            case 30:
                imagenumber.setImageResource(R.drawable.g_tdha);
                txtContent.setText("ધ");
                break;
            case 31:
                imagenumber.setImageResource(R.drawable.g_tna);
                txtContent.setText("ન");
                break;
            case 32:
                imagenumber.setImageResource(R.drawable.g_pa);
                txtContent.setText("પ");
                break;
            case 33:
                imagenumber.setImageResource(R.drawable.g_pha);
                txtContent.setText("ફ");
                break;
            case 34:
                imagenumber.setImageResource(R.drawable.g_ba);
                txtContent.setText("બ");
                break;
            case 35:
                imagenumber.setImageResource(R.drawable.g_bha);
                txtContent.setText("ભ");
                break;
            case 36:
                imagenumber.setImageResource(R.drawable.g_ma);
                txtContent.setText("મ");
                break;
            case 37:
                imagenumber.setImageResource(R.drawable.g_ya);
                txtContent.setText("ય");
                break;
            case 38:
                imagenumber.setImageResource(R.drawable.g_ra);
                txtContent.setText("ર");
                break;
            case 39:
                imagenumber.setImageResource(R.drawable.g_la);
                txtContent.setText("લ");
                break;

            case 40:
                imagenumber.setImageResource(R.drawable.g_va);
                txtContent.setText("વ");
                break;
            case 41:
                imagenumber.setImageResource(R.drawable.g_sha);
                txtContent.setText("શ");
                break;
            case 42:
                imagenumber.setImageResource(R.drawable.g_shha);
                txtContent.setText("ષ");
                break;
            case 43:
                imagenumber.setImageResource(R.drawable.g_sa);
                txtContent.setText("સ");
                break;
            case 44:
                imagenumber.setImageResource(R.drawable.g_ha);
                txtContent.setText("ह ");
                break;
            case 45:
                imagenumber.setImageResource(R.drawable.g_ala);
                txtContent.setText("ળ");
                break;
            case 46:
                imagenumber.setImageResource(R.drawable.g_ksha);
                txtContent.setText("ક્ષ");
                break;
            case 47:
                imagenumber.setImageResource(R.drawable.g_zna);
                txtContent.setText("જ્ઞ");
                break;
        }
    }//end changeNumber

}