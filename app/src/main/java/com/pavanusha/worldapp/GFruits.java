package com.pavanusha.worldapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class GFruits extends Activity implements OnClickListener
{
    TextView txtContent;
    //define all widgets
    private ImageView imagenumber;
    private ImageButton btnprevious,  btnnext;
    //define variables to track screen number, start from 0
    private int screennumber=0;
    //define a sound controller
    private MediaPlayer mp;
    //define an array for the sound files
/*    private String[] soundfile={"0.mp3","1.mp3","2.mp3","3.mp3","4.mp3",
                                "5.mp3","6.mp3","7.mp3","8.mp3","9.mp3"};*/

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
        imagenumber.setImageResource(R.drawable.anjur);
        txtContent.setText("અંજીર");

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
            if(screennumber==41)
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
        float size=0;
        switch (screen)
        {

            case 0:
                imagenumber.setImageResource(R.drawable.anjur);
                txtContent.setText("અંજીર");
                break;
            case 1:
                imagenumber.setImageResource(R.drawable.apple);
                txtContent.setText("સફરજન  ");
                break;
            case 2:
                imagenumber.setImageResource(R.drawable.badam);
                txtContent.setText("બદામ");
                break;
            case 3:
                imagenumber.setImageResource(R.drawable.banana);
                txtContent.setText("કેળુ");
                break;
            case 4:
                imagenumber.setImageResource(R.drawable.bberry);
                txtContent.setText("ફળ ");
                break;
            case 5:
                imagenumber.setImageResource(R.drawable.cherry);
                txtContent.setText("આલુ");
                break;
            case 6:
                imagenumber.setImageResource(R.drawable.cherukugada);
                txtContent.setText("શેરડી");
                break;

            case 7:
                imagenumber.setImageResource(R.drawable.danimma);
                txtContent.setText("દાડમ");
                break;
            case 8:
                imagenumber.setImageResource(R.drawable.dates);
                txtContent.setText("કાજુર ");
                break;
            case 9:
                imagenumber.setImageResource(R.drawable.eetapandu);
                txtContent.setText("જંગલી તારીખ ફળ");
                break;
            case 10:
                imagenumber.setImageResource(R.drawable.endudraksha);
                txtContent.setText("કિસમિસ");
                break;
            case 11:
                imagenumber.setImageResource(R.drawable.gedimamidi);
                txtContent.setText("કાજુ");
                break;
            case 12:
                imagenumber.setImageResource(R.drawable.grape);
                txtContent.setText("દ્રાક્ષ");
                break;
            case 13:
                imagenumber.setImageResource(R.drawable.jama);
                txtContent.setText("જામફળ");
                break;
            case 14:
                imagenumber.setImageResource(R.drawable.kharbhuja);
                txtContent.setText("કસ્તૂરી તરબૂચ");
                break;
            case 15:
                imagenumber.setImageResource(R.drawable.kismis);
                txtContent.setText("કિસમિસ");
                break;
            case 16:
                imagenumber.setImageResource(R.drawable.lakshmanaphalam);
                size=40;
                txtContent.setTextSize(size);
                txtContent.setText("લક્ષ્મણ ફળ ");
                break;
            case 17:
                imagenumber.setImageResource(R.drawable.lemon);
                txtContent.setText("લીંબુ");
                break;
            case 18:
                imagenumber.setImageResource(R.drawable.litch);
                txtContent.setText("લીચી ");
                break;
            case 19:
                imagenumber.setImageResource(R.drawable.loquat);
                txtContent.setText("લોકાટ");
                break;
            case 20:
                imagenumber.setImageResource(R.drawable.mango);
                txtContent.setText("કેરી");
                break;
            case 21:
                imagenumber.setImageResource(R.drawable.maredu);
                txtContent.setText("हॉग बेर");
                break;
            case 22:
                imagenumber.setImageResource(R.drawable.nallak);
                txtContent.setText("બ્લેક કિસમિસ");
                break;
            case 23:
                imagenumber.setImageResource(R.drawable.nelausiri);
                txtContent.setText("કેપ કલહંસ બેરી");
                break;
            case 24:
                imagenumber.setImageResource(R.drawable.orange_fruit);
                txtContent.setText("નારંગી");
                break;
            case 25:
                imagenumber.setImageResource(R.drawable.pamparapasana);
                txtContent.setText("દ્રાક્ષ ફળ");
                break;
            case 26:
                imagenumber.setImageResource(R.drawable.papaya);
                txtContent.setText("પપાયા");
                break;
            case 27:
                imagenumber.setImageResource(R.drawable.peach);
                txtContent.setText("આલૂ");
                break;
            case 28:
                imagenumber.setImageResource(R.drawable.pear);
                txtContent.setText("નાસપતી ");
                break;
            case 29:
                imagenumber.setImageResource(R.drawable.pineapple);
                txtContent.setText("અનનાસ");
                break;
            case 30:
                imagenumber.setImageResource(R.drawable.plum);
                txtContent.setText("बेर");
                break;
            case 31:
                imagenumber.setImageResource(R.drawable.ramaphalam);
                txtContent.setText("રમાં ફળ ");
                break;
            case 32:
                imagenumber.setImageResource(R.drawable.raseberries);
                txtContent.setText("ભૂંસવું તેનાં રસ ઝરતાં ફળોની");
                break;

            case 33:
                imagenumber.setImageResource(R.drawable.sapota);
                txtContent.setText("સાપોડીલા");
                break;
            case 34:
                imagenumber.setImageResource(R.drawable.sitaphalam);
                txtContent.setText("સીતાફળ");
                break;
            case 35:
                imagenumber.setImageResource(R.drawable.strawberry);
                txtContent.setText("લાલ રસદાર ફળ");
                break;

            case 36:
                imagenumber.setImageResource(R.drawable.tatimungelu);
                txtContent.setText("ટેન્ડર પામ ");
                break;
            case 37:
                imagenumber.setImageResource(R.drawable.tegalu);
                size=42;
                txtContent.setTextSize(size);
                txtContent.setText("ટેન્ડર પામ અંકુરની" );
                break;
            case 38:
                imagenumber.setImageResource(R.drawable.usiri);
                txtContent.setText("અમલા ");
                break;
            case 39:
                imagenumber.setImageResource(R.drawable.venlagapandu);
                txtContent.setText("લાકડું એપલ");
                break;
            case 40:
                imagenumber.setImageResource(R.drawable.watermelon);
                txtContent.setText("તરબૂચ");
                break;

        }
    }//end changeNumber


    public void playSound(String soundName){
        Boolean mpPlayingStatus;

        try{//try to check MediaPlayer status
            mpPlayingStatus=mp.isPlaying();
        }
        catch (Exception e){
            mpPlayingStatus=false;
        }
        if(mpPlayingStatus==true){//if the MediaPlayer is playing a voice, stop it to play new voice
            mp.stop();
            mp.release();//remove sound from memory
        }
        else{
            try
            {
                mp = new MediaPlayer();
                AssetFileDescriptor afd = getAssets().openFd(soundName);
                mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mp.prepare();
                mp.start();//play sound

            }//try block
            catch(Exception e) {
                Log.i("Error playing sound: ", e.toString());
            }
        }
    }//end playSound
}