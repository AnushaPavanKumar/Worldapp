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
import android.widget.Toast;


public class TAlphabets extends Activity implements OnClickListener
{
	TextView txtContent;
    private ImageView imagenumber;
    private ImageButton btnprevious,  btnnext;
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

    	imagenumber.setImageResource(R.drawable.tam_a);
    	txtContent.setText("அ");
    	
         btnprevious=(ImageButton)findViewById(R.id.btnprevious);
         btnprevious.setEnabled(false);
         btnprevious.setOnClickListener(this);
        
        btnnext=(ImageButton)findViewById(R.id.btnnext);
        btnnext.setOnClickListener(this);
        
    }
    
    public void onClick(View arg0) 
    {

        if(arg0.getId()==R.id.btnprevious)
        {
            screennumber--;//minus 1 to the screennumber
            changeNumber(screennumber);
            if(screennumber==0){
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
         else if(arg0.getId()==R.id.btnnext)
        {
            screennumber++;//add 1 to the screennumber
            changeNumber(screennumber);
            if(screennumber== 30)
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
    
    private void changeNumber(int screen)
    {
        switch (screen)
        {
            case 1:  
            	imagenumber.setImageResource(R.drawable.tam_a);
            	txtContent.setText("அ");
                break;
            case 2:
            	imagenumber.setImageResource(R.drawable.tam_aa);
            	txtContent.setText("ஆ");
                break;
            case 3:  
            	imagenumber.setImageResource(R.drawable.tam_e);
            	txtContent.setText("இ");
                break;
            case 4:  
            	imagenumber.setImageResource(R.drawable.tam_ee);
            	txtContent.setText("ஈ");
                break;
            case 5:  
            	imagenumber.setImageResource(R.drawable.tam_u);
            	txtContent.setText("உ");
                break;
            case 6:
            	imagenumber.setImageResource(R.drawable.tam_uu);
            	txtContent.setText("ஊ ");
            	break;
            case 7: 
            	imagenumber.setImageResource(R.drawable.tam_ea);
            	txtContent.setText("எ");
            	break;
            case 8:
            	imagenumber.setImageResource(R.drawable.tam_eaa);
            	txtContent.setText("ஏ");
                break;
            case 9:
            	imagenumber.setImageResource(R.drawable.tam_ai);
            	txtContent.setText("ஐ");
                break;
            case 10:  
            	imagenumber.setImageResource(R.drawable.tam_o);
            	txtContent.setText("ஒ");
                break;
          
                
            case 11:
            	imagenumber.setImageResource(R.drawable.tam_oo);
            	txtContent.setText("ஓ");
                break;
            case 12:  
            	imagenumber.setImageResource(R.drawable.tam_ov);
            	txtContent.setText("ஔ");
                break;
            case 13:  
            	imagenumber.setImageResource(R.drawable.tam_ka);
            	txtContent.setText("க");
                break;
            case 14:  
            	imagenumber.setImageResource(R.drawable.tam_ini);
            	txtContent.setText("ங");
                break;
            case 15:
            	imagenumber.setImageResource(R.drawable.tam_cha);
            	txtContent.setText("ச");
            	break;
            case 16: 
            	imagenumber.setImageResource(R.drawable.tam_inni);
            	txtContent.setText("ஞ");
            	break;
            case 17:
            	imagenumber.setImageResource(R.drawable.tam_ta);
            	txtContent.setText("ட");
                break;
            case 18:
            	imagenumber.setImageResource(R.drawable.tam_na);
            	txtContent.setText("ண");
                break;
            case 19:  
            	imagenumber.setImageResource(R.drawable.tam_tta);
            	txtContent.setText("த");
                break;
          
            case 20:
            	imagenumber.setImageResource(R.drawable.tam_tna);
            	txtContent.setText("ந");
                break;
            case 21:  
            	imagenumber.setImageResource(R.drawable.tam_pa);
            	txtContent.setText("ப");
                break;
            case 22:  
            	imagenumber.setImageResource(R.drawable.tam_ma);
            	txtContent.setText("ம");
                break;
            case 23:  
            	imagenumber.setImageResource(R.drawable.tam_ya);
            	txtContent.setText("ய");
                break;
            case 24:
            	imagenumber.setImageResource(R.drawable.tam_ra);
            	txtContent.setText("ர");
            	break;
            case 25: 
            	imagenumber.setImageResource(R.drawable.tam_la);
            	txtContent.setText("ல");
            	break;
            case 26:
            	imagenumber.setImageResource(R.drawable.tam_va);
            	txtContent.setText("வ");
                break;
            case 27:
            	imagenumber.setImageResource(R.drawable.tam_ala);
            	txtContent.setText("ழ");
                break;
            case 28:  
            	imagenumber.setImageResource(R.drawable.tam_alaa);
            	txtContent.setText("ள");
                break;
          
            case 29:
            	imagenumber.setImageResource(R.drawable.tam_bra);
            	txtContent.setText("ற");
                break;
            case 30:  
            	imagenumber.setImageResource(R.drawable.tam_last);
            	txtContent.setText("ன");
                break;
            }
    }//end changeNumber
    public void onBackPressed() 
    {
	       Toast.makeText(getBaseContext(), "Please Press Again", Toast.LENGTH_SHORT).show();
	                      finish();
	          

    	}

}