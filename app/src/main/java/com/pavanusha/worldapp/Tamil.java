package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class Tamil extends Activity {


    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
    String title;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.bengali);



        b1 = (ImageButton) findViewById(R.id.alphabets);
        b2 = (ImageButton) findViewById(R.id.animals);
        b3 = (ImageButton) findViewById(R.id.birds);
        b4 = (ImageButton) findViewById(R.id.colors);
        b5 = (ImageButton) findViewById(R.id.fruits);
        b6 = (ImageButton) findViewById(R.id.lveg);
        b7 = (ImageButton) findViewById(R.id.nos);
        b8 = (ImageButton) findViewById(R.id.planets);
        b9 = (ImageButton) findViewById(R.id.prof);
        b11 = (ImageButton) findViewById(R.id.shapes);
        b12 = (ImageButton) findViewById(R.id.spicies);
        b13 = (ImageButton) findViewById(R.id.veg);
        b14 = (ImageButton) findViewById(R.id.vehicles);

        addButtonListener();

        Intent i = getIntent();
        title= i.getExtras().getString("title");
        setTitle(title);


    }
    private void addButtonListener()
    {




        b1.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {


                Intent i = new Intent(Tamil.this,TAlphabets.class);
                title = "Alpahabets in Tamil Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });


        b2.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Tamil.this,TAnimals.class);
                title = "Animals in Tamil Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });

        b3.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Tamil.this,TBirds.class);
                title = "Birds in Tamil Language ";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Tamil.this,TColors.class);
                title = "Colors in Tamil Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Tamil.this,TFruits.class);
                title = "Fruits in Tamil Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Tamil.this,TLVeg.class);
                title = "Leafy Vegetables in Tamil Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Tamil.this,TNos.class);
                title = "Numbers in Tamil Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b8.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Tamil.this,TPlanets.class);
                title = "Planets in Tamil Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b9.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Tamil.this,TProfessions.class);
                title = "Professions in Tamil Language ";
                i.putExtra("title",title);
                startActivity(i);
            }
        });

        b11.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Tamil.this,TShapes.class);
                title = "Shapes in Tamil Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b12.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Tamil.this,TSpicies.class);
                title = "Spicies in Tamil Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b13.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Tamil.this,TVegetables.class);
                title = "Vegetables in Tamil Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b14.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Tamil.this,TVehicles.class);
                title = "Vehicles in Tamil Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });


    }

}