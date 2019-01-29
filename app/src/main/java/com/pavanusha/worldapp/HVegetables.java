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


public class HVegetables extends Activity implements OnClickListener
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
        font = Typeface.createFromAsset(getAssets(), "akshar.ttf");
        txtContent.setTypeface(font);

        imagenumber=(ImageView)findViewById(R.id.imagenumber);

        txtContent.setText("केला");
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

            case 0:
                txtContent.setText("केला");
                imagenumber.setImageResource(R.drawable.arikaya);
                break;
            case 1 :
                txtContent.setText("घिया ");
                imagenumber.setImageResource(R.drawable.budidagummadikaya);
                break;
            case 2 :
                imagenumber.setImageResource(R.drawable.cabbage);
                txtContent.setText("पत्तागोभी");
                break;
            case 3:
                imagenumber.setImageResource(R.drawable.capsicum);
                txtContent.setText("शिमला मिर्च");
                break;
            case 4:
                imagenumber.setImageResource(R.drawable.cauliflower);
                txtContent.setText("फूल गोभी ");
                break;
            case 5:
                imagenumber.setImageResource(R.drawable.chemadumpa);
                txtContent.setText(" अरबी  ");
                break;

            case 6 :
                txtContent.setText("मीठा आलू");
                imagenumber.setImageResource(R.drawable.chilakadadumpa);
                break;
            case 7:
                imagenumber.setImageResource(R.drawable.dabbakaya);
                txtContent.setText("नीबू ");
                break;
            case 8:
                imagenumber.setImageResource(R.drawable.dondakaya);
                txtContent.setText("खीरा ");
                break;
            case 9:
                imagenumber.setImageResource(R.drawable.drumstick);
                txtContent.setText(" सेंजन ");
                break;
            case 10:
                imagenumber.setImageResource(R.drawable.frenchbeans);
                txtContent.setText("गवार फली");
                break;
            case 11 :
                txtContent.setText("गावर ");
                imagenumber.setImageResource(R.drawable.goruchukkudu);
                break;
            case 12:
                imagenumber.setImageResource(R.drawable.greenchilli);
                txtContent.setText("हरी मिर्च ");
                break;
            case 13:
                imagenumber.setImageResource(R.drawable.greenpeas);
                txtContent.setText("मटर ");
                break;
            case 14:
                imagenumber.setImageResource(R.drawable.kakarakaya);
                txtContent.setText("करेला ");
                break;
            case 15:
                imagenumber.setImageResource(R.drawable.kanda);
                txtContent.setText("ज़िमीकंद");
                break;

            case 16:
                txtContent.setText("कसावा छड़ी");
                imagenumber.setImageResource(R.drawable.karrapendalam);
                break;
            case 17:
                imagenumber.setImageResource(R.drawable.kiradosakaya);
                txtContent.setText("खीरा ");
                break;
            case 18:
                imagenumber.setImageResource(R.drawable.mullangi);
                txtContent.setText("मूली ");
                break;
            case 19:
                imagenumber.setImageResource(R.drawable.mushrooms);
                txtContent.setText("कुम्भी ");
                break;
            case 20:
                imagenumber.setImageResource(R.drawable.netibeerakaya);
                txtContent.setText("अनन्त तोरई");
                break;
            case 21 :
                txtContent.setText("प्याज ");
                imagenumber.setImageResource(R.drawable.onion);
                break;
            case 22 :
                imagenumber.setImageResource(R.drawable.pointedgourd);
                txtContent.setText(" बताया लौकी ");
                break;
            case 23:
                imagenumber.setImageResource(R.drawable.potato);
                txtContent.setText("आलू");
                break;
            case 24:
                imagenumber.setImageResource(R.drawable.potlakaya);
                txtContent.setText(" पदवल  ");
                break;
            case 25:
                imagenumber.setImageResource(R.drawable.pumpkin);
                txtContent.setText("कद्दू ");
                break;

            case 26 :
                txtContent.setText("लौकी ");
                imagenumber.setImageResource(R.drawable.sorakaya);
                break;
            case 27 :
                imagenumber.setImageResource(R.drawable.tamato);
                txtContent.setText("टमाटर ");
                break;
            case 28:
                imagenumber.setImageResource(R.drawable.ullikadalu);
                txtContent.setText("प्याज डंठल ");
                break;
            case 29:
                imagenumber.setImageResource(R.drawable.vakaya);
                txtContent.setText(" करोंदा  ");
                break;
            case 30:
                imagenumber.setImageResource(R.drawable.vankaya);
                txtContent.setText(" बैंगन   ");
                break;
        }
    }

}
