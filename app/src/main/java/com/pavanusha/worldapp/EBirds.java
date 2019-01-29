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


public class EBirds extends Activity implements OnClickListener
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

        imagenumber=(ImageView)findViewById(R.id.imagenumber);
        imagenumber.setImageResource(R.drawable.bat);
        txtContent.setText(" BAT ");

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
            if(screennumber==29)
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
            case 1:
                imagenumber.setImageResource(R.drawable.bat);
                txtContent.setText("Bat");
                break;
            case 2:
                imagenumber.setImageResource(R.drawable.butterfly);
                txtContent.setText("Butterfly");
                break;
            case 3:
                imagenumber.setImageResource(R.drawable.chicken);
                txtContent.setText("Chicken");
                break;
            case 4:
                imagenumber.setImageResource(R.drawable.crane);
                txtContent.setText("Crane");
                break;
            case 5:
                imagenumber.setImageResource(R.drawable.crow);
                txtContent.setText("Crow");
                break;
            case 6:
                imagenumber.setImageResource(R.drawable.duck);
                txtContent.setText("Duck");
                break;
            case 7:
                imagenumber.setImageResource(R.drawable.eagle);
                txtContent.setText("Eagle");
                break;
            case 8:
                imagenumber.setImageResource(R.drawable.falcon);
                txtContent.setText("Falcon");
                break;
            case 9:
                imagenumber.setImageResource(R.drawable.fowl);
                txtContent.setText("Fowl");
                break;

            case 10:
                imagenumber.setImageResource(R.drawable.indiancrane);
                txtContent.setText("Indian Crane");
                break;
            case 11:
                imagenumber.setImageResource(R.drawable.kingfisher);
                txtContent.setText("Kingfisher");
                break;
            case 12:
                imagenumber.setImageResource(R.drawable.kokila);
                txtContent.setText("Cuckoo");
                break;
            case 13:
                imagenumber.setImageResource(R.drawable.nightingale);
                txtContent.setText("Nightiangle");
                break;
            case 14:
                imagenumber.setImageResource(R.drawable.ostrich);
                txtContent.setText("Ostrich");
                break;
            case 15:
                imagenumber.setImageResource(R.drawable.owl);
                txtContent.setText("Owl");
                break;
            case 16:
                imagenumber.setImageResource(R.drawable.parrot);
                txtContent.setText("Parrot");
                break;
            case 17:
                imagenumber.setImageResource(R.drawable.partridge);
                txtContent.setText("Partridge");
                break;
            case 18:
                imagenumber.setImageResource(R.drawable.peacock);
                txtContent.setText("Peacock");
                break;
            case 19:
                imagenumber.setImageResource(R.drawable.peahen);
                txtContent.setText("Peahen");
                break;
            case 20:
                imagenumber.setImageResource(R.drawable.pelican);
                txtContent.setText("Pelican");
                break;
            case 21:
                imagenumber.setImageResource(R.drawable.pigeon);
                txtContent.setText("Pigeon");
                break;

            case 22:
                imagenumber.setImageResource(R.drawable.quail);
                txtContent.setText("Quail");
                break;
            case 23:
                imagenumber.setImageResource(R.drawable.raven);
                txtContent.setText("Raven");
                break;

            case 24:
                imagenumber.setImageResource(R.drawable.seabird);
                txtContent.setText("Seabird");
                break;
            case 25:
                imagenumber.setImageResource(R.drawable.sparrow);
                txtContent.setText("Sparrow");
                break;

            case 26:
                imagenumber.setImageResource(R.drawable.swan);
                txtContent.setText("Swan");
                break;
            case 27:
                imagenumber.setImageResource(R.drawable.turkey);
                txtContent.setText("Turkey");
                break;

            case 28:
                imagenumber.setImageResource(R.drawable.weaverbird);
                txtContent.setText("WeaverBird");
                break;
            case 29:
                imagenumber.setImageResource(R.drawable.woodpeacker);
                txtContent.setText("WoodPeacker");
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