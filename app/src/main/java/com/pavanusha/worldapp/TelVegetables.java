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


public class TelVegetables extends Activity implements OnClickListener
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
        font = Typeface.createFromAsset(getAssets(), "Lohit-Telugu.ttf");
 	    txtContent.setTypeface(font);
 	    
        imagenumber=(ImageView)findViewById(R.id.imagenumber);
      
        txtContent.setText("అరటికాయ ");
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
            	  txtContent.setText("అరటికాయ ");
            	  imagenumber.setImageResource(R.drawable.arikaya);
            	  break;
            case 2 :
            	imagenumber.setImageResource(R.drawable.bendakaya);
            	txtContent.setText("బెండకాయ ");
            	break;
            case 3:
            	imagenumber.setImageResource(R.drawable.benglorevankaya);
            	txtContent.setText("బెంగళూరు వంకాయ ");
            	break;
            case 4:
            	imagenumber.setImageResource(R.drawable.beerakaya);
            	txtContent.setText("బీరకాయ ");
                break;
            case 5:
            	imagenumber.setImageResource(R.drawable.braodbeans);
            	txtContent.setText("చిక్కుడు కాయ ");
               	break;
            case 6 :
          	  txtContent.setText("బూడిద గుమ్మడికాయ   ");
          	  imagenumber.setImageResource(R.drawable.budidagummadikaya);
          	  break;
          case 7 :
          	imagenumber.setImageResource(R.drawable.cabbage);
          	txtContent.setText(" క్యాబేజి");
          	break;
          case 8:
          	imagenumber.setImageResource(R.drawable.capsicum);
          	txtContent.setText("బెంగళూరు మిరపకాయ  ");
          	break;
          case 9:
          	imagenumber.setImageResource(R.drawable.cauliflower);
          	txtContent.setText(" గోబీ ");
              break;
          case 10:
          	imagenumber.setImageResource(R.drawable.chemadumpa);
          	txtContent.setText("చేమ దుంప  ");
             	break;
             	
          case 11 :
        	  txtContent.setText("చిలకడ దుంప ");
        	  imagenumber.setImageResource(R.drawable.chilakadadumpa);
        	  break;
        case 12 :
        	imagenumber.setImageResource(R.drawable.dabbakaya);
        	txtContent.setText("దబ్బకాయ ");
        	break;
        case 13:
        	imagenumber.setImageResource(R.drawable.dondakaya);
        	txtContent.setText("దొండకాయ  ");
        	break;
        case 14:
        	imagenumber.setImageResource(R.drawable.drumstick);
        	txtContent.setText("ముల్లకాడ ");
            break;
        case 15:
        	imagenumber.setImageResource(R.drawable.frenchbeans);
        	txtContent.setText("బీన్స్ ");
           	break;
        case 16 :
      	  txtContent.setText("గోరు చిక్కుడుకాయ  ");
      	  imagenumber.setImageResource(R.drawable.goruchukkudu);
      	  break;
      case 17 :
      	imagenumber.setImageResource(R.drawable.greenchilli);
      	txtContent.setText("పచ్చి మిరపకాయ ");
      	break;
      case 18:
      	imagenumber.setImageResource(R.drawable.greenpeas);
      	txtContent.setText("పచ్చి బఠానీలు ");
      	break;
      case 19:
      	imagenumber.setImageResource(R.drawable.kakarakaya);
      	txtContent.setText("కాకర కాయ ");
          break;
      case 20:
      	imagenumber.setImageResource(R.drawable.kanda);
      	txtContent.setText(" కంద   ");
         	break;
        	
      case 21 :
    	  txtContent.setText("కర్ర పెండలం ");
    	  imagenumber.setImageResource(R.drawable.karrapendalam);
    	  break;
    case 22 :
    	imagenumber.setImageResource(R.drawable.kiradosakaya);
    	txtContent.setText(" కీర దోసకాయ  ");
    	break;
    case 23:
    	imagenumber.setImageResource(R.drawable.mullangi);
    	txtContent.setText("ముల్లంగి ");
    	break;
    case 24:
    	imagenumber.setImageResource(R.drawable.mushrooms);
    	txtContent.setText("పుట్ట గొడుగులు ");
        break;
    case 25:
    	imagenumber.setImageResource(R.drawable.netibeerakaya);
    	txtContent.setText("నేతి బీరకాయ ");
       	break;
    case 26 :
    	  txtContent.setText("ఉల్లిపాయలు  ");
    	  imagenumber.setImageResource(R.drawable.onion);
    	  break;
    case 27 :
    	imagenumber.setImageResource(R.drawable.pointedgourd);
    	txtContent.setText(" పోతల్స్ ");
    	break;
    case 28:
    	imagenumber.setImageResource(R.drawable.potato);
    	txtContent.setText("బంగాళా దుంప / ఆలు గడ్డ ");
    	break;
    case 29:
    	imagenumber.setImageResource(R.drawable.potlakaya);
    	txtContent.setText(" పొట్లకాయ ");
      break;
    case 30:
    	imagenumber.setImageResource(R.drawable.pumpkin);
    	txtContent.setText(" గుమ్మడి కాయ   ");
     	break;
    	
    case 31 :
    	  txtContent.setText("సొరకాయ ");
    	  imagenumber.setImageResource(R.drawable.sorakaya);
    	  break;
    case 32 :
    	imagenumber.setImageResource(R.drawable.tamato);
    	txtContent.setText(" టమాట ");
    	break;
    case 33:
    	imagenumber.setImageResource(R.drawable.ullikadalu);
    	txtContent.setText("ఉల్లి కాడలు ");
    	break;
    case 34:
    	imagenumber.setImageResource(R.drawable.vakaya);
    	txtContent.setText("వాక్కాయ ");
      break;
    case 35:
    	imagenumber.setImageResource(R.drawable.vankaya);
    	txtContent.setText("వంకాయ ");
     	break;
}
    }
   
 /*  public void onBackPressed()
   {
       Intent setIntent = new Intent(this,Kanada.class);
       startActivity(setIntent);        }*/
}
   