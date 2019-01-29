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

public class TelFruits extends Activity implements OnClickListener
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
        font = Typeface.createFromAsset(getAssets(), "Lohit-Telugu.ttf");
 	    txtContent.setTypeface(font);
 	    
        imagenumber=(ImageView)findViewById(R.id.imagenumber);
        imagenumber.setImageResource(R.drawable.anjur);
        txtContent.setText("అంజీరము");
        
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
            if(screennumber==43)
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
          	  	txtContent.setText("అంజీరం ");
                break;
            case 1:
            	imagenumber.setImageResource(R.drawable.apple);
            	txtContent.setText("సీమ రేగు ");
                break;
            case 2:  
            	imagenumber.setImageResource(R.drawable.badam);
            	txtContent.setText("బాదం");
                break;
            case 3:  
            	imagenumber.setImageResource(R.drawable.banana);
            	txtContent.setText("అరటి పండు ");
                break;
            case 4:  
            	imagenumber.setImageResource(R.drawable.bberry);
            	txtContent.setText("నేరేడు  ");
                break;
            case 5:
            	imagenumber.setImageResource(R.drawable.cherry);
            	  txtContent.setText("చెర్రీ పండు   ");
            	break;
            case 6: 
            	imagenumber.setImageResource(R.drawable.cherukugada);
              	txtContent.setText("చెరుకు గడ  ");
            	break;
            case 7: 
            	imagenumber.setImageResource(R.drawable.dabbapandu);
             	txtContent.setText("దబ్బపండు");
            	break;
            case 8: 
            	imagenumber.setImageResource(R.drawable.danimma);
             	txtContent.setText("దానిమ్మ పండు  ");
            	break;
            case 9: 
            	imagenumber.setImageResource(R.drawable.dates);
             	txtContent.setText("ఖర్జూరం ");
            	break;
            case 10: 
            	imagenumber.setImageResource(R.drawable.eetapandu);
            	txtContent.setText("ఈత పండు   ");
            	break;
            case 11: 
            	imagenumber.setImageResource(R.drawable.endudraksha);
            	txtContent.setText("ఎండుద్రాక్ష");
            	break;
            case 12:  
            	imagenumber.setImageResource(R.drawable.gedimamidi);
            	txtContent.setText("జీడిమామిడి ");
                break;
            case 13:  
            	imagenumber.setImageResource(R.drawable.grape);
          	  	txtContent.setText("ద్రాక్ష  ");
                break;
            case 14:
            	imagenumber.setImageResource(R.drawable.jama);
            	txtContent.setText("జామపండు ");
                break;
            case 15:  
            	imagenumber.setImageResource(R.drawable.kharbhuja);
            	txtContent.setText("ఖర్భూజకాయ");
                break;
            case 16:  
            	imagenumber.setImageResource(R.drawable.kismis);
            	txtContent.setText("కిస్మిస్ ");
                break;
            case 17:  
            	imagenumber.setImageResource(R.drawable.lakshmanaphalam);
            	txtContent.setText("లక్ష్మణ ఫలం ");
                break;
            case 18:
            	imagenumber.setImageResource(R.drawable.lemon);
            	  txtContent.setText("నిమ్మపండు   ");
            	break;
            case 19: 
            	imagenumber.setImageResource(R.drawable.litch);
              	txtContent.setText("లిచి పండు ");
            	break;
            case 20: 
            	imagenumber.setImageResource(R.drawable.loquat);
             	txtContent.setText("లోకటపండు");
            	break;
            case 21: 
            	imagenumber.setImageResource(R.drawable.mango);
             	txtContent.setText("మామిడిపండు ");
            	break;
            case 22: 
            	imagenumber.setImageResource(R.drawable.maredu);
             	txtContent.setText("మారేడు ");
            	break;
            case 23: 
            	imagenumber.setImageResource(R.drawable.nallak);
            	txtContent.setText("నల్ల నేరేడు    ");
            	break;
            case 24: 
            	imagenumber.setImageResource(R.drawable.nelausiri);
            	txtContent.setText("నేల ఉసిరి ");
            	break;
            case 25:  
            	imagenumber.setImageResource(R.drawable.orange_fruit);
            	txtContent.setText("నారింజ పండు ");
                break;
            case 26:  
            	imagenumber.setImageResource(R.drawable.pamparapasana);
          	  	txtContent.setText("పంపరపనస ");
                break;
            case 27:
            	imagenumber.setImageResource(R.drawable.papaya);
            	txtContent.setText("బొప్పాయ ");
                break;
            case 28:  
            	imagenumber.setImageResource(R.drawable.peach);
            	txtContent.setText("పీచ్ పండు ");
                break;
            case 29:  
            	imagenumber.setImageResource(R.drawable.pear);
            	txtContent.setText("పెరి పండు ");
                break;
            case 30:  
            	imagenumber.setImageResource(R.drawable.pineapple);
            	txtContent.setText("అనాస పండు ");
                break;
            case 31:
            	imagenumber.setImageResource(R.drawable.plum);
            	  txtContent.setText("రేగు   ");
            	break;
            case 32: 
            	imagenumber.setImageResource(R.drawable.ramaphalam);
              	txtContent.setText("రామాఫలం ");
            	break;
            case 33: 
            	imagenumber.setImageResource(R.drawable.raseberries);
             	txtContent.setText("రేస్ బెర్రీస్ ");
            	break;
            case 34: 
            	imagenumber.setImageResource(R.drawable.regu);
             	txtContent.setText("రేగు ");
            	break;
            case 35: 
            	imagenumber.setImageResource(R.drawable.sapota);
             	txtContent.setText("సపోటా  ");
            	break;
            case 36: 
            	imagenumber.setImageResource(R.drawable.sitaphalam);
            	txtContent.setText("సీతాఫలం   ");
            	break;
            
            case 37:  
            	imagenumber.setImageResource(R.drawable.strawberry);
            	txtContent.setText(" బెర్రీ ");
                break;
                
            case 38:  
            	imagenumber.setImageResource(R.drawable.tatimungelu);
          	  	txtContent.setText("తాటి ముంజెలు  ");
                break;
                
            case 39:
            	imagenumber.setImageResource(R.drawable.tegalu);
            	txtContent.setText("తేగలు ");
                break;
            
            case 40:  
            	imagenumber.setImageResource(R.drawable.usiri);
            	txtContent.setText("ఉసిరి ");
                break;
            case 41:  
            	imagenumber.setImageResource(R.drawable.venlagapandu);
            	txtContent.setText("వెలగపండు ");
                break;
            case 42:  
            	imagenumber.setImageResource(R.drawable.watermelon);
            	txtContent.setText("పుచ్చకాయ");
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
