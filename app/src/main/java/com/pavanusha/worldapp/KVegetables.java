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


public class KVegetables extends Activity implements OnClickListener
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
      
        txtContent.setText("ಬಾಳೆಕಾಯಿ ");
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
            	  txtContent.setText("ಬಾಳೆಕಾಯಿ ");
            	  imagenumber.setImageResource(R.drawable.arikaya);
            	  break;
            case 2 :
            	imagenumber.setImageResource(R.drawable.bendakaya);
            	txtContent.setText("ಬೆಂಡಕಾಯ");
            	break;
            case 3:
            	imagenumber.setImageResource(R.drawable.benglorevankaya);
            	txtContent.setText("ಬೆಂಗಳೂರು ನೆಲಗುಳ್ಳ");
            	break;
            case 4:
            	imagenumber.setImageResource(R.drawable.beerakaya);
            	txtContent.setText("ಹೆರೆಕಾಯಿ ");
                break;
            case 5:
            	imagenumber.setImageResource(R.drawable.braodbeans);
            	txtContent.setText("ಅವರೆಕಾಯಿ ");
               	break;
            case 6 :
          	  txtContent.setText("ಬೂದ್ಹ್ ಕುಮಬಳಕಾಯಿ  ");
          	  imagenumber.setImageResource(R.drawable.budidagummadikaya);
          	  break;
          case 7 :
          	imagenumber.setImageResource(R.drawable.cabbage);
          	txtContent.setText(" ಎಲೆಕೋಸು ");
          	break;
          case 8:
          	imagenumber.setImageResource(R.drawable.capsicum);
          	txtContent.setText("ದೊಡ್ಡ ಮೆಣಸಿನಕಾಯಿ ");
          	break;
          case 9:
          	imagenumber.setImageResource(R.drawable.cauliflower);
          	txtContent.setText(" ಹೂಕೋಸು ");
              break;
          case 10:
          	imagenumber.setImageResource(R.drawable.chemadumpa);
          	txtContent.setText("ಸಮ ಗಡ್ಡೆ ");
             	break;
             	
          case 11 :
        	  txtContent.setText("ಸಿಹಿ ಆಲೂಗಡ್ಡೆ ");
        	  imagenumber.setImageResource(R.drawable.chilakadadumpa);
        	  break;
        case 12 :
        	imagenumber.setImageResource(R.drawable.dabbakaya);
        	txtContent.setText("ಮಾದಳ");
        	break;
        case 13:
        	imagenumber.setImageResource(R.drawable.dondakaya);
        	txtContent.setText("ತೊಂಡೆಕಾಯಿ ");
        	break;
        case 14:
        	imagenumber.setImageResource(R.drawable.drumstick);
        	txtContent.setText("ನುಗ್ಗೆ ಕಾಯಿ");
            break;
        case 15:
        	imagenumber.setImageResource(R.drawable.frenchbeans);
        	txtContent.setText("ಹುರುಳಿಕಾಯಿ ");
           	break;
        case 16 :
      	  txtContent.setText("ಗೊರೀಕಯೇ  ");
      	  imagenumber.setImageResource(R.drawable.goruchukkudu);
      	  break;
      case 17 :
      	imagenumber.setImageResource(R.drawable.greenchilli);
      	txtContent.setText("ಹಸಿರು ಮೆಣಸಿನಕಾಯಿ");
      	break;
      case 18:
      	imagenumber.setImageResource(R.drawable.greenpeas);
      	txtContent.setText("ವತಾನಿ ");
      	break;
      case 19:
      	imagenumber.setImageResource(R.drawable.kakarakaya);
      	txtContent.setText("ಹಾಗಲಕಾಯಿ");
          break;
      case 20:
      	imagenumber.setImageResource(R.drawable.kanda);
      	txtContent.setText(" ಚಿಕ್ಕ ಸುವರ್ಣ ಗಡ್ಡೆ  ");
         	break;
        	
      case 21 :
    	  txtContent.setText(" ಕೊಲ್ಲಿ / ಮರಗೆಣಸು ");
    	  imagenumber.setImageResource(R.drawable.karrapendalam);
    	  break;
    case 22 :
    	imagenumber.setImageResource(R.drawable.kiradosakaya);
    	txtContent.setText(" ಸೌತೆಕಾಯಿ  ");
    	break;
    case 23:
    	imagenumber.setImageResource(R.drawable.mullangi);
    	txtContent.setText("ಮೂಲಂಗಿ");
    	break;
    case 24:
    	imagenumber.setImageResource(R.drawable.mushrooms);
    	txtContent.setText("ಕಾಲಾನ್ ");
        break;
    case 25:
    	imagenumber.setImageResource(R.drawable.netibeerakaya);
    	txtContent.setText("ಹೆರೆಕಾಯಿ ");
       	break;
    case 26 :
    	  txtContent.setText("ನೀರುಲಿ /ಈರುಳ್ಳಿ ");
    	  imagenumber.setImageResource(R.drawable.onion);
    	  break;
    case 27 :
    	imagenumber.setImageResource(R.drawable.pointedgourd);
    	txtContent.setText(" ಕಾಡು ಪದವ ");
    	break;
    case 28:
    	imagenumber.setImageResource(R.drawable.potato);
    	txtContent.setText("ಆಲೂಗಡ್ಡೆ ");
    	break;
    case 29:
    	imagenumber.setImageResource(R.drawable.potlakaya);
    	txtContent.setText(" ಪಡವಲಕಾಯಿ ");
      break;
    case 30:
    	imagenumber.setImageResource(R.drawable.pumpkin);
    	txtContent.setText("  ಗುಮ್ಬಳಕೈ  ");
     	break;
    	
    case 31 :
    	  txtContent.setText("ಸೋರೆಕಾಯಿ");
    	  imagenumber.setImageResource(R.drawable.sorakaya);
    	  break;
    case 32 :
    	imagenumber.setImageResource(R.drawable.tamato);
    	txtContent.setText(" ತೊಮಾತೋ ಹಣ್ಣು ");
    	break;
    case 33:
    	imagenumber.setImageResource(R.drawable.ullikadalu);
    	txtContent.setText("ಇರುಳಿ ಕಾವು ");
    	break;
    case 34:
    	imagenumber.setImageResource(R.drawable.vakaya);
    	txtContent.setText("ವಾಕ್ಕಯ ");
      break;
    case 35:
    	imagenumber.setImageResource(R.drawable.vankaya);
    	txtContent.setText("ಬದನೇಕಾಯಿ");
     	break;
}
    }
 }
   