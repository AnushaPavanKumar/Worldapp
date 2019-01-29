package com.pavanusha.worldapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class ENos extends Activity implements OnClickListener
{
    TextView txtContent;
    //define all widgets
    private ImageView imagenumber;
    private ImageButton btnprevious, btnnext;
    //define variables to track screen number, start from 0
    private int screennumber=0;
    //define a sound controller
    private MediaPlayer mp;
    //define an array for the sound files
    /*private String[] soundfile={"0.mp3","1.mp3","2.mp3","3.mp3","4.mp3",
                                "5.mp3","6.mp3","7.mp3","8.mp3","9.mp3"};*/

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);
        //admob widget

        Intent i = getIntent();
        String title= i.getExtras().getString("title");
        setTitle(title);
        txtContent = (TextView) findViewById(R.id.txt);
        imagenumber=(ImageView)findViewById(R.id.imagenumber);
        imagenumber.setImageResource(R.drawable.one);
        txtContent.setText(" 1 ONE  ");

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
            if(screennumber==32)
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
                imagenumber.setImageResource(R.drawable.one);
                txtContent.setText(" 1 ONE  ");
                break;
            case 1:
                imagenumber.setImageResource(R.drawable.two);
                txtContent.setText("2 TWO ");
                break;
            case 2:
                imagenumber.setImageResource(R.drawable.three);
                txtContent.setText("3 THREE");
                break;
            case 3:
                imagenumber.setImageResource(R.drawable.four);
                txtContent.setText("4 FOUR");
                break;
            case 4:
                imagenumber.setImageResource(R.drawable.five);
                txtContent.setText("5 FIVE");
                break;
            case 5:
                imagenumber.setImageResource(R.drawable.six);
                txtContent.setText("6 SIX ");
                break;
            case 6:
                imagenumber.setImageResource(R.drawable.seven);
                txtContent.setText("7 SEVEN");
                break;
            case 7:
                imagenumber.setImageResource(R.drawable.eight);
                txtContent.setText("8 EIGHT ");
                break;
            case 8:
                imagenumber.setImageResource(R.drawable.nine);
                txtContent.setText("9 NINE ");
                break;
            case 9:
                imagenumber.setImageResource(R.drawable.ten);
                txtContent.setText("10 TEN");
                break;
            case 10:
                imagenumber.setImageResource(R.drawable.eleven);
                txtContent.setText("11 ELEVEN");
                break;
            case 11:
                imagenumber.setImageResource(R.drawable.twelve);
                txtContent.setText("12 TWELVE");
                break;
            case 12:
                imagenumber.setImageResource(R.drawable.thirteen);
                txtContent.setText("13 THIRTEEN");
                break;
            case 13:
                imagenumber.setImageResource(R.drawable.fourteen);
                txtContent.setText("14 FOURTEEN");
                break;
            case 14:
                imagenumber.setImageResource(R.drawable.fifteen);
                txtContent.setText("15 FIFTEEN");
                break;
            case 15:
                imagenumber.setImageResource(R.drawable.sixteen);
                txtContent.setText("16 SIXTEEN");
                break;
            case 16:
                imagenumber.setImageResource(R.drawable.seventeen);
                txtContent.setText("17 SEVENTEEN");
                break;
            case 17:
                imagenumber.setImageResource(R.drawable.eighteen);
                txtContent.setText("18 EIGHTEEN");
                break;
            case 18:
                imagenumber.setImageResource(R.drawable.ninteen);
                txtContent.setText("19 NINETEEN");
                break;
            case 19:
                imagenumber.setImageResource(R.drawable.twenty);
                txtContent.setText("20 TWENTY");
                break;
            case 20:
                imagenumber.setImageResource(R.drawable.tone);
                txtContent.setText("21 TWENTY ONE");
                break;
            case 21:
                imagenumber.setImageResource(R.drawable.ttwo);
                txtContent.setText("22 TWENTY TWO");
                break;
            case 22:
                imagenumber.setImageResource(R.drawable.tthree);
                float size=48;
                txtContent.setTextSize(size);
                txtContent.setText("23 TWENTY THREE");
                break;
            case 23:
                imagenumber.setImageResource(R.drawable.thirty);
                txtContent.setText("30 THIRTY");
                break;
            case 24:
                imagenumber.setImageResource(R.drawable.fourty);
                txtContent.setText("40 FOURTY");
                break;
            case 25:
                imagenumber.setImageResource(R.drawable.fifty);
                txtContent.setText("50 FIFTY");
                break;
            case 26:
                imagenumber.setImageResource(R.drawable.sixty);
                txtContent.setText("60 SIXTY ");
                break;
            case 27:
                imagenumber.setImageResource(R.drawable.seventy);
                txtContent.setText("70 SEVENTY ");
                break;
            case 28:
                imagenumber.setImageResource(R.drawable.eighty);
                txtContent.setText("80 EIGHTY");
                break;
            case 29:
                imagenumber.setImageResource(R.drawable.ninty);
                txtContent.setText("90 NINETY");
                break;

            case 30:
                imagenumber.setImageResource(R.drawable.hundered);
                txtContent.setText("100 HUNDERED");
                break;
            case 31:
                imagenumber.setImageResource(R.drawable.thousand);
                txtContent.setText("1000 THOUSAND");
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