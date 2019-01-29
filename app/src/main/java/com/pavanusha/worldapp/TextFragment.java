package com.pavanusha.worldapp;

import java.io.IOException;
import java.io.InputStream;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
 
 
public class TextFragment extends Fragment
{
    
    
	float size;
	TextView txtContent;
	ImageButton b1,b2;
	AssetManager assetManager;
	InputStream input;
	String title;
	
    
    @Override
 
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) 
    {
        View view = inflater.inflate(R.layout.text_fragment, container, false);
        
        
        txtContent = (TextView) view.findViewById(R.id.txt);
        b1 = (ImageButton) view.findViewById(R.id.btnInc);
        b2 = (ImageButton) view.findViewById(R.id.btnDec);
        
        
         assetManager = getActivity().getAssets();
        
        Typeface font ;
        font = Typeface.createFromAsset(getActivity().getAssets(), "akshar.ttf");
        size = txtContent.getTextSize();
 	    txtContent.setTypeface(font);
 	    addListenerOnButton();
        
		Intent i = getActivity().getIntent();
	    title= i.getExtras().getString("title");
	    setTitle(title); 


        
        return view;
 
    }
    public void setTitle(String title)
    {
    	this.title = title;
    }
	public void change(int position) 
	{
		// TODO Auto-generated method stub
		switch(position+1)
		{
		
	        case 1 :
	        	title = "Hindi Alphabets";
	        	setTitle(title);
	        	      	
	            try {
                    
     				input = assetManager.open("hindialphabets.txt");
          
                      int size = input.available();
                      byte[] buffer = new byte[size];
                      input.read(buffer);
                      input.close();
          
                      // byte buffer into a string
                      String text = new String(buffer);
          
                      txtContent.setText(text);
                 } 
        	     catch (IOException e) 
        	     {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                 }        
     
				break;
	        
	        case 2 :
	        	title = "Hindi Animals";
	        	setTitle(title);
	        	try {
                    
     				input = assetManager.open("hindianimals.txt");
          
                      int size = input.available();
                      byte[] buffer = new byte[size];
                      input.read(buffer);
                      input.close();
          
                      // byte buffer into a string
                      String text = new String(buffer);
          
                      txtContent.setText(text);
                 } 
        	     catch (IOException e) 
        	     {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                 }        
        	
				
				break;
	        case 3:
	        	title = "Hindi Birds";
	        	setTitle(title);
	        	try {
                    
     				input = assetManager.open("hindibirds.txt");
          
                      int size = input.available();
                      byte[] buffer = new byte[size];
                      input.read(buffer);
                      input.close();
          
                      // byte buffer into a string
                      String text = new String(buffer);
          
                      txtContent.setText(text);
                 } 
        	     catch (IOException e) 
        	     {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                 }        
        	
				
				break;
		case 4:
			title = "Hindi Colors";
			setTitle(title);
			try {
                
 				input = assetManager.open("hindicolors.txt");
      
                  int size = input.available();
                  byte[] buffer = new byte[size];
                  input.read(buffer);
                  input.close();
      
                  // byte buffer into a string
                  String text = new String(buffer);
      
                  txtContent.setText(text);
             } 
    	     catch (IOException e) 
    	     {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }        
    	
			
			break;
		case 5:
			title = "Hindi Fruits";
			setTitle(title);
			try {
                
 				input = assetManager.open("hindifruits.txt");
      
                  int size = input.available();
                  byte[] buffer = new byte[size];
                  input.read(buffer);
                  input.close();
      
                  // byte buffer into a string
                  String text = new String(buffer);
      
                  txtContent.setText(text);
             } 
    	     catch (IOException e) 
    	     {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }        
    	
			
			break;
		case 6:
			title = "Hindi Vegetables";
			setTitle(title);
			try {
                
 				input = assetManager.open("hindivegetables.txt");
      
                  int size = input.available();
                  byte[] buffer = new byte[size];
                  input.read(buffer);
                  input.close();
      
                  // byte buffer into a string
                  String text = new String(buffer);
      
                  txtContent.setText(text);
             } 
    	     catch (IOException e) 
    	     {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }        
    	
			
			break;
		case 7:
			title = "Hindi Numbers";
			setTitle(title);
			try {
                
 				input = assetManager.open("hindinos.txt");
      
                  int size = input.available();
                  byte[] buffer = new byte[size];
                  input.read(buffer);
                  input.close();
      
                  // byte buffer into a string
                  String text = new String(buffer);
      
                  txtContent.setText(text);
             } 
    	     catch (IOException e) 
    	     {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }        
    	
			
			break;
		case 8:
			title = "Hindi Planets";
			setTitle(title);
			try {
                
 				input = assetManager.open("hindiplanets.txt");
      
                  int size = input.available();
                  byte[] buffer = new byte[size];
                  input.read(buffer);
                  input.close();
      
                  // byte buffer into a string
                  String text = new String(buffer);
      
                  txtContent.setText(text);
             } 
    	     catch (IOException e) 
    	     {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }        
    	
			
			break;
		case 9:
			title = "Hindi Professions";
			setTitle(title);
			try {
                
 				input = assetManager.open("hindipro.txt");
      
                  int size = input.available();
                  byte[] buffer = new byte[size];
                  input.read(buffer);
                  input.close();
      
                  // byte buffer into a string
                  String text = new String(buffer);
      
                  txtContent.setText(text);
             } 
    	     catch (IOException e) 
    	     {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }        
    	
			
			break;
		case 10:
			
			title = "Hindi Shapes";
			setTitle(title);
			try {
                
 				input = assetManager.open("hindishapes.txt");
      
                  int size = input.available();
                  byte[] buffer = new byte[size];
                  input.read(buffer);
                  input.close();
      
                  // byte buffer into a string
                  String text = new String(buffer);
      
                  txtContent.setText(text);
             } 
    	     catch (IOException e) 
    	     {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }        
    	
			
			break;
		case 11:
			title = "Hindi Spicies";
			setTitle(title);
			try {
                
 				input = assetManager.open("hindispices.txt");
      
                  int size = input.available();
                  byte[] buffer = new byte[size];
                  input.read(buffer);
                  input.close();
      
                  // byte buffer into a string
                  String text = new String(buffer);
      
                  txtContent.setText(text);
             } 
    	     catch (IOException e) 
    	     {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }        
    	
			
			break;
		case 12:
			title = "Hindi Vegetables";
			setTitle(title);
			try {
                
 				input = assetManager.open("hindivegetables.txt");
      
                  int size = input.available();
                  byte[] buffer = new byte[size];
                  input.read(buffer);
                  input.close();
      
                  // byte buffer into a string
                  String text = new String(buffer);
      
                  txtContent.setText(text);
             } 
    	     catch (IOException e) 
    	     {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }        
    	
			
			break;
		case 13:
			title = "Hindi Vehicles";
			setTitle(title);
			try {
                
 				input = assetManager.open("hindiveh.txt");
      
                  int size = input.available();
                  byte[] buffer = new byte[size];
                  input.read(buffer);
                  input.close();
      
                  // byte buffer into a string
                  String text = new String(buffer);
      
                  txtContent.setText(text);
             } 
    	     catch (IOException e) 
    	     {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }        
    		break;
		}
	
	}
    private void addListenerOnButton() 
	{
		 b1.setOnClickListener(new OnClickListener() 
          {
            @Override
            public void onClick(View view) 
            {
            	size++;
            	txtContent.setTextSize(size); 
            }
          });	
          
          b2.setOnClickListener(new OnClickListener() 
          {
            @Override
            public void onClick(View view) 
            {
              	size--;
            	txtContent.setTextSize(size);
            }
          });
         
 
}
}