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


public class TFruits extends Activity implements OnClickListener
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
        font = Typeface.createFromAsset(getAssets(), "akshar.ttf");
 	    txtContent.setTypeface(font);
 	    
        imagenumber=(ImageView)findViewById(R.id.imagenumber);
        imagenumber.setImageResource(R.drawable.anjur);
        txtContent.setText(" அட்டி பழம்  ");
        
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
            if(screennumber==42)
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
            	imagenumber.setImageResource(R.drawable.anjur);
          	  	txtContent.setText(" அட்டி பழம்  ");
                break;
            case 1:
            	imagenumber.setImageResource(R.drawable.apple);
            	txtContent.setText(" அப்ப்லேபழம்  ");
                break;
            case 2:  
            	imagenumber.setImageResource(R.drawable.badam);
            	txtContent.setText("பாதம் கொட்டை");
                break;
            case 3:  
            	imagenumber.setImageResource(R.drawable.banana);
            	txtContent.setText(" வலை ");
                break;
            case 4:  
            	imagenumber.setImageResource(R.drawable.bberry);
            	txtContent.setText("	மேற்கத்திய நாவற்பழம்");
                break;
            case 5:
            	imagenumber.setImageResource(R.drawable.cherry);
            	  txtContent.setText("சேலாப்பழம்");
            	break;
            case 6: 
            	imagenumber.setImageResource(R.drawable.cherukugada);
              	txtContent.setText("கரும்பு");
            	break;
            case 7: 
            	imagenumber.setImageResource(R.drawable.dabbapandu);
             	txtContent.setText("	கடார நாரந்தை");
            	break;
            case 8: 
            	imagenumber.setImageResource(R.drawable.danimma);
             	txtContent.setText("மாதுளம் பழம், மாதுளை  ");
            	break;
            case 9: 
            	imagenumber.setImageResource(R.drawable.dates);
             	txtContent.setText("பேரீச்சம் பழம்");
            	break;
            case 10: 
            	imagenumber.setImageResource(R.drawable.eetapandu);
            	txtContent.setText("நீச்சல் பழம்");
            	break;
            case 11: 
            	imagenumber.setImageResource(R.drawable.endudraksha);
            	txtContent.setText(" உனக்கமுந்திரி ");
            	break;
            case 12:  
            	imagenumber.setImageResource(R.drawable.gedimamidi);
            	txtContent.setText("முந்திரிப்பழம், கஜு");
                break;
            case 13:  
            	imagenumber.setImageResource(R.drawable.grape);
          	  	txtContent.setText("கொடி முந்திரி, திராட்சை ");
                break;
            case 14:
            	imagenumber.setImageResource(R.drawable.jama);
            	txtContent.setText("கொய்யாப்பழம் ");
                break;
            case 15:  
            	imagenumber.setImageResource(R.drawable.kharbhuja);
            	txtContent.setText(" முலம் பழம் ");
                break;
            case 16:  
            	imagenumber.setImageResource(R.drawable.kismis);
            	txtContent.setText("கிஸ்மிஸ்  ");
                break;
            case 17:  
            	imagenumber.setImageResource(R.drawable.lakshmanaphalam);
            	txtContent.setText("லக்ஷ்மன் ப்ஹலம் ");
                break;
            case 18:
            	imagenumber.setImageResource(R.drawable.lemon);
            	  txtContent.setText("வர்க்கப்பழம்   ");
            	break;
            case 19: 
            	imagenumber.setImageResource(R.drawable.litch);
              	txtContent.setText("லிட்சி ");
            	break;
            case 20: 
            	imagenumber.setImageResource(R.drawable.loquat);
             	txtContent.setText("லோகட் ");
            	break;
            case 21: 
            	imagenumber.setImageResource(R.drawable.mango);
             	txtContent.setText("மாம்பழம் ");
            	break;
            
            case 22: 
            	imagenumber.setImageResource(R.drawable.nallak);
            	txtContent.setText("கறுந்திராட்சை  ");
            	break;
            case 23: 
            	imagenumber.setImageResource(R.drawable.nelausiri);
            	txtContent.setText("ஆம்லா ");
            	break;
            case 24:  
            	imagenumber.setImageResource(R.drawable.orange_fruit);
            	txtContent.setText("தோடம்பழம்");
                break;
            case 25:  
            	imagenumber.setImageResource(R.drawable.pamparapasana);
          	  	txtContent.setText("பம்பரமாசு ");
                break;
            case 26:
            	imagenumber.setImageResource(R.drawable.papaya);
            	txtContent.setText("பப்பாப் பழம் ");
                break;
            case 27:  
            	imagenumber.setImageResource(R.drawable.peach);
            	txtContent.setText("	குழிப்பேரி");
                break;
            case 28:  
            	imagenumber.setImageResource(R.drawable.pear);
            	txtContent.setText("பேரி, பெயார்ஸ் ");
                break;
            case 29:  
            	imagenumber.setImageResource(R.drawable.pineapple);
            	txtContent.setText("	அன்னாசிப் பழம் ");
                break;
            case 30:
            	imagenumber.setImageResource(R.drawable.plum);
            	  txtContent.setText("ஆல்பக்கோடா ");
            	break;
            case 31: 
            	imagenumber.setImageResource(R.drawable.ramaphalam);
              	txtContent.setText("ராமப்ஹலம்  ");
            	break;
            case 32: 
            	imagenumber.setImageResource(R.drawable.raseberries);
             	txtContent.setText("	புற்றுப்பழம்");
            	break;
            case 33: 
            	imagenumber.setImageResource(R.drawable.regu);
             	txtContent.setText("ஆல்பக்கோடா ");
            	break;
            case 34: 
            	imagenumber.setImageResource(R.drawable.sapota);
             	txtContent.setText("சீமையிலுப்பை ");
            	break;
            case 35: 
            	imagenumber.setImageResource(R.drawable.sitaphalam);
            	txtContent.setText("சிட ப்ஹலம்    ");
            	break;
            
            case 36:  
            	imagenumber.setImageResource(R.drawable.strawberry);
            	txtContent.setText(" செம்புற்றுப்பழம்");
                break;
                
            case 37:  
            	imagenumber.setImageResource(R.drawable.tatimungelu);
          	  	txtContent.setText("பாம் கை");
                break;
                
            case 38:
            	imagenumber.setImageResource(R.drawable.tegalu);
            	txtContent.setText("తేగలు ");
                break;
            
            case 39:  
            	imagenumber.setImageResource(R.drawable.usiri);
            	txtContent.setText("கூஸ்பெறி ");
                break;
            case 40:  
            	imagenumber.setImageResource(R.drawable.venlagapandu);
            	txtContent.setText("விளாம்பழம் ");
                break;
            case 41:  
            	imagenumber.setImageResource(R.drawable.watermelon);
            	txtContent.setText("வத்தகைப்பழம், குமட்டிப்பழம், தர்பூசணி");
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
