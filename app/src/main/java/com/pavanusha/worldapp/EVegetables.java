package com.pavanusha.worldapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class EVegetables extends Activity implements OnClickListener
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

        imagenumber=(ImageView)findViewById(R.id.imagenumber);

        txtContent.setText("Raw Banana");
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
            if(screennumber==1)
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
            if(screennumber==35)
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

            case 1 :
                txtContent.setText("Raw Banana");
                imagenumber.setImageResource(R.drawable.arikaya);
                break;
            case 2 :
                imagenumber.setImageResource(R.drawable.bendakaya);
                txtContent.setText("Ladies fingers");
                break;
            case 3:
                imagenumber.setImageResource(R.drawable.benglorevankaya);
                txtContent.setText("BengloreBringal");
                break;
            case 4:
                imagenumber.setImageResource(R.drawable.beerakaya);
                txtContent.setText("Ridgeguard");
                break;
            case 5:
                imagenumber.setImageResource(R.drawable.braodbeans);
                txtContent.setText("BroaadBeans");
                break;
            case 6 :
                txtContent.setText("Ash Gourd");
                imagenumber.setImageResource(R.drawable.budidagummadikaya);
                break;
            case 7 :
                imagenumber.setImageResource(R.drawable.cabbage);
                txtContent.setText("Cabbage");
                break;
            case 8:
                imagenumber.setImageResource(R.drawable.capsicum);
                txtContent.setText("Capsicum");
                break;
            case 9:
                imagenumber.setImageResource(R.drawable.cauliflower);
                txtContent.setText("Cauliflower");
                break;
            case 10:
                imagenumber.setImageResource(R.drawable.chemadumpa);
                txtContent.setText("Colocisa");
                break;

            case 11 :
                txtContent.setText("Sweet Potato");
                imagenumber.setImageResource(R.drawable.chilakadadumpa);
                break;
            case 12 :
                imagenumber.setImageResource(R.drawable.dabbakaya);
                txtContent.setText("Citron");
                break;
            case 13:
                imagenumber.setImageResource(R.drawable.dondakaya);
                txtContent.setText("Gherkin ");
                break;
            case 14:
                imagenumber.setImageResource(R.drawable.drumstick);
                txtContent.setText("DrumStick");
                break;
            case 15:
                imagenumber.setImageResource(R.drawable.frenchbeans);
                txtContent.setText("FrenchBeans");
                break;
            case 16 :
                txtContent.setText("ClusterBeans");
                imagenumber.setImageResource(R.drawable.goruchukkudu);
                break;
            case 17 :
                imagenumber.setImageResource(R.drawable.greenchilli);
                txtContent.setText("GreenChillies");
                break;
            case 18:
                imagenumber.setImageResource(R.drawable.greenpeas);
                txtContent.setText("GreenPeas");
                break;
            case 19:
                imagenumber.setImageResource(R.drawable.kakarakaya);
                txtContent.setText("BitterGourd");
                break;
            case 20:
                imagenumber.setImageResource(R.drawable.kanda);
                txtContent.setText("Yam");
                break;

            case 21 :
                txtContent.setText("Topiaco ");
                imagenumber.setImageResource(R.drawable.karrapendalam);
                break;
            case 22 :
                imagenumber.setImageResource(R.drawable.kiradosakaya);
                txtContent.setText("Cucumber");
                break;
            case 23:
                imagenumber.setImageResource(R.drawable.mullangi);
                txtContent.setText("Radish");
                break;
            case 24:
                imagenumber.setImageResource(R.drawable.mushrooms);
                txtContent.setText("Mushrooms");
                break;
            case 25:
                imagenumber.setImageResource(R.drawable.netibeerakaya);
                txtContent.setText("SilkSquash");
                break;
            case 26 :
                txtContent.setText("Onion");
                imagenumber.setImageResource(R.drawable.onion);
                break;
            case 27 :
                imagenumber.setImageResource(R.drawable.pointedgourd);
                txtContent.setText("PointedGourd");
                break;
            case 28:
                imagenumber.setImageResource(R.drawable.potato);
                txtContent.setText("Potato");
                break;
            case 29:
                imagenumber.setImageResource(R.drawable.potlakaya);
                txtContent.setText("SnakeGourd");
                break;
            case 30:
                imagenumber.setImageResource(R.drawable.pumpkin);
                txtContent.setText("Pumpkin");
                break;

            case 31 :
                txtContent.setText("BottleGourd ");
                imagenumber.setImageResource(R.drawable.sorakaya);
                break;
            case 32 :
                imagenumber.setImageResource(R.drawable.tamato);
                txtContent.setText("Tamota");
                break;
            case 33:
                imagenumber.setImageResource(R.drawable.ullikadalu);
                txtContent.setText("SpringOnions");
                break;
            case 34:
                imagenumber.setImageResource(R.drawable.vakaya);
                txtContent.setText("CranBerry");
                break;
            case 35:
                imagenumber.setImageResource(R.drawable.vankaya);
                txtContent.setText("Bringal");
                break;
        }
    }
}