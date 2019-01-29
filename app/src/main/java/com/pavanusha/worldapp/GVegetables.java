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
public class GVegetables extends Activity implements OnClickListener
{
    TextView txtContent;
    //define all widgets
    private ImageView imagenumber;
    private ImageButton btnprevious,  btnnext;
    //define variables to track screen number, start from 0
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

        txtContent.setText("કાચા કેળા");
        imagenumber.setImageResource(R.drawable.arikaya);


        //initialize the object for the button
        btnprevious=(ImageButton)findViewById(R.id.btnprevious);
        //this button will innitially be disabled
        btnprevious.setEnabled(false);
        //add listener to the button
        btnprevious.setOnClickListener(this);

        btnnext=(ImageButton)findViewById(R.id.btnnext);
        btnnext.setOnClickListener(this);

    }//end onCreate

    //this method is to handle button click
    public void onClick(View arg0)
    {

        //when btnprevious is clicked
        if(arg0.getId()==R.id.btnprevious)
        {
            screennumber--;//minus 1 to the screennumber
            changeNumber(screennumber);
            if(screennumber==0)
            {
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

        //when btnnext is clicked
        else if(arg0.getId()==R.id.btnnext)
        {
            screennumber++;//add 1 to the screennumber
            changeNumber(screennumber);
            if(screennumber==31)
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

    //this method is to change the number that appear on the screen
    //after navigation button is clicked
    private void changeNumber(int screen)
    {
        switch (screen)
        {

            case 0 :
                txtContent.setText("કાચા કેળા");
                imagenumber.setImageResource(R.drawable.arikaya);
                break;
            case 1 :
                txtContent.setText(" ");
                imagenumber.setImageResource(R.drawable.budidagummadikaya);
                break;
            case 2 :
                imagenumber.setImageResource(R.drawable.cabbage);
                txtContent.setText("કોબી");
                break;
            case 3:
                imagenumber.setImageResource(R.drawable.capsicum);
                txtContent.setText("મરચું");
                break;
            case 4:
                imagenumber.setImageResource(R.drawable.cauliflower);
                txtContent.setText("ફૂલકોબી");
                break;
            case 5:
                imagenumber.setImageResource(R.drawable.chemadumpa);
                txtContent.setText("ટેરો રુટ ");
                break;

            case 6 :
                txtContent.setText("શક્કરિયા");
                imagenumber.setImageResource(R.drawable.chilakadadumpa);
                break;
            case 7:
                imagenumber.setImageResource(R.drawable.dabbakaya);
                txtContent.setText("લીંબુની જાતનું મોટું ફળ");
                break;
            case 8:
                imagenumber.setImageResource(R.drawable.dondakaya);
                txtContent.setText("તીન્દોરા ");
                break;
            case 9:
                imagenumber.setImageResource(R.drawable.drumstick);
                txtContent.setText("સરગવા ની સિંગ ");
                break;
            case 10:
                imagenumber.setImageResource(R.drawable.frenchbeans);
                txtContent.setText("ફ્રેન્ચ બીજ");
                break;
            case 11 :
                txtContent.setText("ક્લસ્ટર બીજ");
                imagenumber.setImageResource(R.drawable.goruchukkudu);
                break;
            case 12 :
                imagenumber.setImageResource(R.drawable.greenchilli);
                txtContent.setText("લીલા મરચા");
                break;
            case 13:
                imagenumber.setImageResource(R.drawable.greenpeas);
                txtContent.setText("લીલા વટાણા");
                break;
            case 14:
                imagenumber.setImageResource(R.drawable.kakarakaya);
                txtContent.setText("કારેલું");
                break;
            case 15:
                imagenumber.setImageResource(R.drawable.kanda);
                txtContent.setText("રતાળુ");
                break;

            case 16 :
                txtContent.setText("કેસેવા લાકડી");
                imagenumber.setImageResource(R.drawable.karrapendalam);
                break;
            case 17:
                imagenumber.setImageResource(R.drawable.kiradosakaya);
                txtContent.setText("કાકડી");
                break;
            case 18:
                imagenumber.setImageResource(R.drawable.mullangi);
                txtContent.setText("મૂળા");
                break;
            case 19:
                imagenumber.setImageResource(R.drawable.mushrooms);
                txtContent.setText("મશરૂમ");
                break;
            case 20:
                imagenumber.setImageResource(R.drawable.netibeerakaya);
                txtContent.setText("સિલ્ક સ્ક્વૅશ" );
                break;
            case 21 :
                txtContent.setText("કાંદો ");
                imagenumber.setImageResource(R.drawable.onion);
                break;
            case 22 :
                imagenumber.setImageResource(R.drawable.pointedgourd);
                txtContent.setText("પરવળ");
                break;
            case 23:
                imagenumber.setImageResource(R.drawable.potato);
                txtContent.setText("બટાકાની");
                break;
            case 24:
                imagenumber.setImageResource(R.drawable.potlakaya);
                txtContent.setText("   ");
                break;
            case 25:
                imagenumber.setImageResource(R.drawable.pumpkin);
                txtContent.setText(" ");
                break;

            case 26 :
                txtContent.setText("દૂધુ ");
                imagenumber.setImageResource(R.drawable.sorakaya);
                break;
            case 27 :
                imagenumber.setImageResource(R.drawable.tamato);
                txtContent.setText("ટમેટું");
                break;
            case 28:
                imagenumber.setImageResource(R.drawable.ullikadalu);
                txtContent.setText("લીલી ડુંગળી");
                break;
            case 29:
                imagenumber.setImageResource(R.drawable.vakaya);
                txtContent.setText("ટેટો");
                break;
            case 30:
                imagenumber.setImageResource(R.drawable.vankaya);
                txtContent.setText(" રીંગણ");
                break;
        }
    }

}
