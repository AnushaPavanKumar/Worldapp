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


public class GAnimals extends Activity implements OnClickListener
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
        imagenumber.setImageResource(R.drawable.alligator);
        txtContent.setText("મગર");

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

        //when btnnext is clicked
        else if(arg0.getId()==R.id.btnnext)
        {
            screennumber++;//add 1 to the screennumber
            changeNumber(screennumber);
            if(screennumber==24)
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
                imagenumber.setImageResource(R.drawable.alligator);
                txtContent.setText("મગર");
                break;
            case 1:
                imagenumber.setImageResource(R.drawable.ape);
                txtContent.setText("ચાળા પાડવા");
                break;
            case 2:
                imagenumber.setImageResource(R.drawable.armadillo);
                txtContent.setText("वर्मी ");
                break;
            case 3:
                imagenumber.setImageResource(R.drawable.bear);
                txtContent.setText("રીંછ");
                break;
            case 4:
                imagenumber.setImageResource(R.drawable.buffalo);
                txtContent.setText("ભેશ");
                break;
            case 5:
                imagenumber.setImageResource(R.drawable.camel);
                txtContent.setText("ઊંટ");
                break;
            case 6:
                imagenumber.setImageResource(R.drawable.cat);
                txtContent.setText("બિલાડો");
                break;
            case 7:
                imagenumber.setImageResource(R.drawable.cow);
                txtContent.setText("ગાય");
                break;
            case 8:
                imagenumber.setImageResource(R.drawable.dog);
                txtContent.setText("કુતરો");
                break;
            case 9:
                imagenumber.setImageResource(R.drawable.donkey);
                txtContent.setText("ગધેડો");
                break;
            case 10:
                imagenumber.setImageResource(R.drawable.elephant);
                txtContent.setText("હાથી");
                break;
            case 11:
                imagenumber.setImageResource(R.drawable.fox);
                txtContent.setText("શિયાળ");
                break;
            case 12:
                imagenumber.setImageResource(R.drawable.ginka);
                txtContent.setText("હરણ");
                break;
            case 13:
                imagenumber.setImageResource(R.drawable.giraffe);
                txtContent.setText("જિરાફ");
                break;
            case 14:
                imagenumber.setImageResource(R.drawable.goat);
                txtContent.setText("બકરો");
                break;
            case 15:
                imagenumber.setImageResource(R.drawable.horse);
                txtContent.setText("ઘોડો");
                break;
            case 16:
                imagenumber.setImageResource(R.drawable.lion);
                txtContent.setText("સિંહ");
                break;
            case 17:
                imagenumber.setImageResource(R.drawable.monkey);
                txtContent.setText("વાંદરો");
                break;
            case 18:
                imagenumber.setImageResource(R.drawable.ox);
                txtContent.setText("બેલ");
                break;
            case 19:
                imagenumber.setImageResource(R.drawable.pig);
                txtContent.setText("ડુક્કર");
                break;
            case 20:
                imagenumber.setImageResource(R.drawable.rat);
                txtContent.setText("ઉંદર");
                break;
            case 21:
                imagenumber.setImageResource(R.drawable.squirrel);
                txtContent.setText("ખિસકોલી");
                break;
            case 22:
                imagenumber.setImageResource(R.drawable.adder);
                txtContent.setText("સાપ");
                break;
            case 23:
                imagenumber.setImageResource(R.drawable.tiger);
                txtContent.setText("વાઘ");
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
