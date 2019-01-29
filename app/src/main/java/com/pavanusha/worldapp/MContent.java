package com.pavanusha.worldapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.os.Build;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;


@TargetApi(Build.VERSION_CODES.GINGERBREAD)
@SuppressLint("NewApi")

public class MContent extends Activity
{



	TextView txtContent;
	String title;
	
	
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        title= i.getExtras().getString("title");
	    setTitle(title); 
               
        
 	    
        switch(position)
        {
        case 1 :
        	  Intent a1 = new Intent(getApplicationContext(), Malphabets.class);
        	  title ="Alphabets in Malayalam ";
              // passing array index
              a1.putExtra("title",title);
              startActivity(a1);
              break;
        
        case 2 :
        	Intent a2 = new Intent(getApplicationContext(), MAnimals.class);
        	title="Animals in Malayalam";
            // passing array index
            a2.putExtra("title",title);
            startActivity(a2);
            break;
        
        case 3:
        	Intent a3 = new Intent(getApplicationContext(), MBirds.class);
        	title = "Birds in Malayalam";
            // passing array index
            a3.putExtra("title",title);
            startActivity(a3);
            break;    
    
        case 4:
        	Intent a4 = new Intent(getApplicationContext(), MColors.class);
        	title = "Colors in Malayalam";
            // passing array index
            a4.putExtra("title",title);
            startActivity(a4);
            break;   

        case 5:
        	Intent a5 = new Intent(getApplicationContext(), MFruits.class);
        	title = "Fruits in Malayalam";
            // passing array index
            a5.putExtra("title",title);
            startActivity(a5);
            break;
        case 6:
        	Intent a6 = new Intent(getApplicationContext(), MLVeg.class);
        	title = "Leafy Vegetables in Malayalam";
            // passing array index
            a6.putExtra("title",title);
            startActivity(a6);
            break;        
        case 7:
        	Intent a7 = new Intent(getApplicationContext(), MNos.class);
        	title =" Numbers in Malayalam";
            // passing array index
            a7.putExtra("title",title);
            startActivity(a7);
            break;
        
        case 8:
        	Intent a8 = new Intent(getApplicationContext(), MPlanets.class);
        	title = "Planets in Malayalam";
            // passing array index
            a8.putExtra("title",title);
            startActivity(a8);
            break;
            
        case 9:
        	Intent a9 = new Intent(getApplicationContext(), MProfessions.class);
        	title = "Professions in  Malayalam";
            // passing array index
            a9.putExtra("title",title);
            startActivity(a9);
            break;
            
    
        case 10:
        	Intent a11 = new Intent(getApplicationContext(), MShapes.class);
        	title = "Shapes in Malayalam";
            // passing array index
            a11.putExtra("title",title);
            startActivity(a11);
            break;
  
    	case 11:
    		Intent a12 = new Intent(getApplicationContext(), MSpicies.class);
    		title ="Spicies in Malayalam";
            // passing array index
            a12.putExtra("title",title);
            startActivity(a12);
            break;
 
    	case 12:
    		Intent a13 = new Intent(getApplicationContext(), MVegetables.class);
    		title ="Vegetables in Malayalam";
            // passing array index
            a13.putExtra("title",title);
            startActivity(a13);
            break;
  
    	case 13:
    		Intent a14 = new Intent(getApplicationContext(), MVehicles.class);
    		title = "Vehicles in Malayalam";
            // passing array index
            a14.putExtra("title",title);
            startActivity(a14);
            break;


	        }
    }
   
}
