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

public class TelShapes extends Activity implements OnClickListener
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



    	imagenumber.setImageResource(R.drawable.circle);
  	  	txtContent.setText("వృత్తం   ");
        
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
            if(screennumber==20)
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
            	imagenumber.setImageResource(R.drawable.circle);
          	  	txtContent.setText("వృత్తం   ");
                break;
            case 1:
            	imagenumber.setImageResource(R.drawable.cone);
            	txtContent.setText("శంఖం ");
                break;
            case 2:  
            	imagenumber.setImageResource(R.drawable.cube);
            	txtContent.setText("ఘన చతురస్రం ");
                break;
            case 3:  
            	imagenumber.setImageResource(R.drawable.cylinder);
            	txtContent.setText(" స్తంభం ");
                break;
            case 4:  
            	imagenumber.setImageResource(R.drawable.decagon);
            	txtContent.setText("దశ భుజం ");
                break;
            case 5:
            	imagenumber.setImageResource(R.drawable.diamond);
            	  txtContent.setText("వజ్రాకృతి ");
            	break;
            case 6: 
            	imagenumber.setImageResource(R.drawable.heart);
              	txtContent.setText("హృదయాకారం ");
            	break;
            case 7: 	
            	imagenumber.setImageResource(R.drawable.hexagon);
             	txtContent.setText("షడ్భుజం ");
            	break;
            case 8: 
            	imagenumber.setImageResource(R.drawable.triangle);
             	txtContent.setText("త్రి భుజం ");
            	break;
            case 9: 
            	imagenumber.setImageResource(R.drawable.octagon);
             	txtContent.setText("అష్ట భుజం  ");
            	break;
            case 10:  
            	imagenumber.setImageResource(R.drawable.oval_shape);
            	txtContent.setText("గుడ్డ ఆకారం  ");
                break;
            case 11:
            	imagenumber.setImageResource(R.drawable.parallelogram);
            	  txtContent.setText("సమాంతర ");
            	break;
            case 12: 
            	imagenumber.setImageResource(R.drawable.pentagon);
              	txtContent.setText("పంచ భుజం  ");
            	break;
            case 13: 	
            	imagenumber.setImageResource(R.drawable.rectangle);
             	txtContent.setText("దీర్ఘ చతురస్రం ");
            	break;
            case 14: 
            	imagenumber.setImageResource(R.drawable.rhombus);
             	txtContent.setText("వజ్రాకారం");
            	break;
            case 15: 
            	imagenumber.setImageResource(R.drawable.septagone);
             	txtContent.setText("సప్త భుజం ");
            	break;   
            	
            case 16:  
            	imagenumber.setImageResource(R.drawable.sphere);
            	txtContent.setText("గోళం  ");
                break;
            case 17:
            	imagenumber.setImageResource(R.drawable.square);
            	  txtContent.setText("చతురస్రం ");
            	break;
            case 18: 
            	imagenumber.setImageResource(R.drawable.star);
              	txtContent.setText("నక్షత్రం ");
            	break;
            case 19: 	
            	imagenumber.setImageResource(R.drawable.trapezium);
             	txtContent.setText("సమలంబ చతుర్భుజం");
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
  /*  public void onBackPressed()
    {
        Intent setIntent = new Intent(this,Kanada.class);
        startActivity(setIntent); 
      
    } */
}
