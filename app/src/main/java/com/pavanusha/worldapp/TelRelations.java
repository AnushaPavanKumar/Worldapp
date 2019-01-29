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

public class TelRelations extends Activity implements OnClickListener
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
        
        imagenumber.setImageResource(R.drawable.anchor);
     	txtContent.setText("అమ్మ ");
    	
        
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
            if(screennumber==10)
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
        	imagenumber.setImageResource(R.drawable.anchor);
         	txtContent.setText("అమ్మ ");
        	break;
        	case 1:  
            	imagenumber.setImageResource(R.drawable.doctor);
          	  	txtContent.setText("నాన్న   ");
                break;
            case 2:
            	imagenumber.setImageResource(R.drawable.fireman);
            	txtContent.setText("అన్న ");
                break;
            case 3:  
            	imagenumber.setImageResource(R.drawable.judge);
            	txtContent.setText("తమ్ముడు ");
                break;
            case 4:  
            	imagenumber.setImageResource(R.drawable.lawyer);
            	txtContent.setText(" అక్క ");
                break;
            case 5:  
            	imagenumber.setImageResource(R.drawable.police);
            	txtContent.setText("చెల్లెలు");
                break;
            case 6:
            	imagenumber.setImageResource(R.drawable.singer);
            	  txtContent.setText("కొడుకు  ");
            	break;
            case 7: 
            	imagenumber.setImageResource(R.drawable.teacher);
              	txtContent.setText("కూతురు ");
            	break;
            case 8: 	
            	imagenumber.setImageResource(R.drawable.writer);
             	txtContent.setText("అల్లుడు ");
            	break;
            case 9: 
            	imagenumber.setImageResource(R.drawable.dancer);
             	txtContent.setText("కోడలు ");
            	break;
               
        }
    }//end changeNumber
/*    
   public void onBackPressed()
   {
       Intent setIntent = new Intent(this,Kanada.class);
       startActivity(setIntent); 
    } */
}

