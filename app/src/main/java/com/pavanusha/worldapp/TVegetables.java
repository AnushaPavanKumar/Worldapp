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

public class TVegetables extends Activity implements OnClickListener
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
      
        txtContent.setText("வலை  ");
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
            	  txtContent.setText("வலை  ");
            	  imagenumber.setImageResource(R.drawable.arikaya);
            	  break;
            case 2 :
          	  txtContent.setText("நீர்ப் பூசணிக்காய்  ");
          	  imagenumber.setImageResource(R.drawable.budidagummadikaya);
          	  break;
          case 7 :
          	imagenumber.setImageResource(R.drawable.cabbage);
          	txtContent.setText("முட்டைக்கோசு");
          	break;
          case 8:
          	imagenumber.setImageResource(R.drawable.capsicum);
          	txtContent.setText("குடை மிளகாய் ");
          	break;
          case 9:
          	imagenumber.setImageResource(R.drawable.cauliflower);
          	txtContent.setText(" பூக்கோசு ");
              break;
          case 10:
          	imagenumber.setImageResource(R.drawable.chemadumpa);
          	txtContent.setText("கோலாகாசிய   ");
             	break;
             	
          case 11 :
        	  txtContent.setText("ர்க்கரைவள்ளிக் கிழங்கு ");
        	  imagenumber.setImageResource(R.drawable.chilakadadumpa);
        	  break;
        case 12 :
        	imagenumber.setImageResource(R.drawable.dabbakaya);
        	txtContent.setText("நார்த்தங்காய்    ");
        	break;
        case 13:
        	imagenumber.setImageResource(R.drawable.dondakaya);
        	txtContent.setText("டின்டூர   ");
        	break;
        case 14:
        	imagenumber.setImageResource(R.drawable.drumstick);
        	txtContent.setText("முருங்கைக்காய்");
            break;
        case 15:
        	imagenumber.setImageResource(R.drawable.frenchbeans);
        	txtContent.setText("கொத்தவரங்காய்");
           	break;
        case 16 :
      	  txtContent.setText("கொத்தவரங்காய் ");
      	  imagenumber.setImageResource(R.drawable.goruchukkudu);
      	  break;
      case 17 :
      	imagenumber.setImageResource(R.drawable.greenchilli);
      	txtContent.setText("பச்சை மிளகாய் ");
      	break;
      case 18:
      	imagenumber.setImageResource(R.drawable.greenpeas);
      	txtContent.setText("பட்டாணி ");
      	break;
      case 19:
      	imagenumber.setImageResource(R.drawable.kakarakaya);
      	txtContent.setText("பாகற்காய், பாவக்காய் ");
          break;
      case 20:
      	imagenumber.setImageResource(R.drawable.kanda);
      	txtContent.setText(" சேனைக்கிழங்கு   ");
         	break;
        	
      case 21 :
    	  txtContent.setText("மரவள்ளிக்கிழங்கு ");
    	  imagenumber.setImageResource(R.drawable.karrapendalam);
    	  break;
    case 22 :
    	imagenumber.setImageResource(R.drawable.kiradosakaya);
    	txtContent.setText(" வெள்ளரிக்காய்  ");
    	break;
    case 23:
    	imagenumber.setImageResource(R.drawable.mullangi);
    	txtContent.setText("முள்ளங்கி");
    	break;
    case 24:
    	imagenumber.setImageResource(R.drawable.mushrooms);
    	txtContent.setText("காளான் ");
        break;
    case 25:
    	imagenumber.setImageResource(R.drawable.netibeerakaya);
    	txtContent.setText("புடலங்காய் ");
       	break;
    case 26 :
    	  txtContent.setText("வெங்காயம்  ");
    	  imagenumber.setImageResource(R.drawable.onion);
    	  break;
    case 27 :
    	imagenumber.setImageResource(R.drawable.pointedgourd);
    	txtContent.setText(" புடலங்காய் ");
    	break;
    case 28:
    	imagenumber.setImageResource(R.drawable.potato);
    	txtContent.setText("புடலங்காய் ");
    	break;
    case 29:
    	imagenumber.setImageResource(R.drawable.potlakaya);
    	txtContent.setText(" புடலங்காய் ");
      break;
    case 30:
    	imagenumber.setImageResource(R.drawable.pumpkin);
    	txtContent.setText(" பூசணிக்காய்   ");
     	break;
    	
    case 31 :
    	  txtContent.setText("சுரைக்காய் ");
    	  imagenumber.setImageResource(R.drawable.sorakaya);
    	  break;
    case 32 :
    	imagenumber.setImageResource(R.drawable.tamato);
    	txtContent.setText(" தக்காளி ");
    	break;
    case 33:
    	imagenumber.setImageResource(R.drawable.ullikadalu);
    	txtContent.setText("வெங்காயத்தாள் ");
    	break;
    case 34:
    	imagenumber.setImageResource(R.drawable.vakaya);
    	txtContent.setText("தமிழ் விக்சனரி ");
      break;
    case 35:
    	imagenumber.setImageResource(R.drawable.vankaya);
    	txtContent.setText(" கத்திரிக்காய்  ");
     	break;
}
    }
   
  }
   