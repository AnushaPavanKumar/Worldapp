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

public class TelNos extends Activity implements OnClickListener
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
        Typeface font ;
        font = Typeface.createFromAsset(getAssets(), "Lohit-Telugu.ttf");
 	    txtContent.setTypeface(font);
 	    
        imagenumber=(ImageView)findViewById(R.id.imagenumber);
        imagenumber.setImageResource(R.drawable.one);
        txtContent.setText(" ౧ 	ఒకటి   ");
        
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
            	txtContent.setText(" ౧ 	ఒకటి   ");
                break;
            case 1:
            	imagenumber.setImageResource(R.drawable.two);
            	txtContent.setText("౨ 	రెండు ");
                break;
            case 2:  
            	imagenumber.setImageResource(R.drawable.three);
            	txtContent.setText("౩ 	మూడు");
                break;
            case 3:  
            	imagenumber.setImageResource(R.drawable.four);
            	txtContent.setText("౪ 	నాలుగు");
                break;
            case 4:  
            	imagenumber.setImageResource(R.drawable.five);
            	txtContent.setText("౫ 	అయిదు");
                break;
            case 5:
            	imagenumber.setImageResource(R.drawable.six);
            	txtContent.setText("౬ 	ఆరు ");
            	break;
            case 6: 
            	imagenumber.setImageResource(R.drawable.seven);
            	txtContent.setText("౭ 	ఏడు ");
            	break;
            case 7: 
            	imagenumber.setImageResource(R.drawable.eight);
            	txtContent.setText("౮ 	ఎనిమిది ");
            	break;
            case 8: 
            	imagenumber.setImageResource(R.drawable.nine);
            	txtContent.setText("౯ 	తొమ్మిది ");
            	break;
            case 9: 
            	imagenumber.setImageResource(R.drawable.ten);
            	txtContent.setText("౧౦ 	పది ");
            	break;
            case 10: 
            	imagenumber.setImageResource(R.drawable.eleven);
            	txtContent.setText("౧౧ 	పదకొండు ");
            	break;
            case 11: 
            	imagenumber.setImageResource(R.drawable.twelve);
            	txtContent.setText("౧౨ 	పన్నెండు ");
            	break;
            case 12:  
            	imagenumber.setImageResource(R.drawable.thirteen);
            	txtContent.setText("౧౩ 	పదమూడు");
                break;
            case 13:
            	imagenumber.setImageResource(R.drawable.fourteen);
            	txtContent.setText("౧౪ 	పధ్నాలుగు");
                break;
            case 14:  
            	imagenumber.setImageResource(R.drawable.fifteen);
            	txtContent.setText("౧౫  పదిహేను ");
                break;
            case 15:  
            	imagenumber.setImageResource(R.drawable.sixteen);
            	txtContent.setText("౧౬ 	పదహారు  ");
                break;
            case 16:  
            	imagenumber.setImageResource(R.drawable.seventeen);
            	txtContent.setText("౧౭ 	పదిహేడు ");
                break;
            case 17:
            	imagenumber.setImageResource(R.drawable.eighteen);
            	txtContent.setText("౧౮ 	పధ్ధెనిమిది");
            	break;
            case 18: 
            	imagenumber.setImageResource(R.drawable.ninteen);
            	txtContent.setText("౧౯ 	పందొమ్మిది");
            	break;
            case 19: 
            	imagenumber.setImageResource(R.drawable.twenty);
            	txtContent.setText("౨౦ 	ఇరవై ");
            	break;
            case 20: 
            	imagenumber.setImageResource(R.drawable.tone);
            	txtContent.setText("౨౧ 	ఇరవై ఒకటి");
            	break;
            case 21: 
            	imagenumber.setImageResource(R.drawable.ttwo);
            	txtContent.setText("౨౨ 	ఇరవై రెండు");
            	break;
            case 22: 
            	imagenumber.setImageResource(R.drawable.tthree);
            	txtContent.setText("౨౩ 	ఇరవై మూడు");
            	break;
            /*case 23: 
            	imagenumber.setImageResource(R.drawable.tfour);
            	txtContent.setText("౨౪ 	ఇరవై నాలుగు");
            	break;
            case 24: 
            	imagenumber.setImageResource(R.drawable.tfive);
            	txtContent.setText("౨౫ 	ఇరవై అయిదు");
            	break;
            case 25: 
            	imagenumber.setImageResource(R.drawable.tsix);
            	txtContent.setText("౨౬ 	ఇరవై ఆరు ");
            	break;
            case 26: 
            	imagenumber.setImageResource(R.drawable.tseven);
            	txtContent.setText("౨౭ 	ఇరవై ఏడు ");
            	break;
            case 27: 
            	imagenumber.setImageResource(R.drawable.teight);
            	txtContent.setText("౨౮ 	ఇరవై ఎనిమిది");
            	break;
            
            case 28: 
            	imagenumber.setImageResource(R.drawable.tnine);
            	txtContent.setText("౨౯ 	ఇరవై తొమ్మిది ");
            	break;*/
            case 23: 
            	imagenumber.setImageResource(R.drawable.thirty);
            	txtContent.setText("౩౦ 	ముప్పై");
            	break;
            case 24: 
            	imagenumber.setImageResource(R.drawable.fourty);
            	txtContent.setText("౪౦ 	నలభై ");
            	break;
            case 25: 
            	imagenumber.setImageResource(R.drawable.fifty);
            	txtContent.setText("౫౦ 	యాభై");
            	break;
            case 26: 
            	imagenumber.setImageResource(R.drawable.sixty);
            	txtContent.setText("౬౦ 	అరవై ");
            	break;
            case 27: 
            	imagenumber.setImageResource(R.drawable.seventy);
            	txtContent.setText("౭౦ 	డెబ్బై ");
            	break;
            case 28: 
            	imagenumber.setImageResource(R.drawable.eighty);
            	txtContent.setText("౮౦ 	ఎనభై ");
            	break;
            case 29: 
            	imagenumber.setImageResource(R.drawable.ninty);
            	txtContent.setText("౯౦ 	తొంభై ");
            	break;
            	
            case 30: 
            	imagenumber.setImageResource(R.drawable.hundered);
            	txtContent.setText("౧౦౦ 	వంద ");
            	break;
            case 31: 
            	imagenumber.setImageResource(R.drawable.thousand);
            	txtContent.setText("౧,౦౦౦ 	వెయ్యి");
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

