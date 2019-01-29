package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class Hindi extends Activity {


    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b11,b12,b13,b14;
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


                Intent i = new Intent(Hindi.this,HAlphabets.class);
                title = "Alpahabets in Hindi Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });


        b2.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Hindi.this,HAnimals.class);
                title = "Animals in Hindi Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });

        b3.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Hindi.this,HBirds.class);
                title = "Birds in Hindi Language ";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Hindi.this,HColors.class);
                title = "Colors in Hindi Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Hindi.this,HFruits.class);
                title = "Fruits in Hindi Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Hindi.this,HLVeg.class);
                title = "Leafy Vegetables in Hindi Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Hindi.this,HNos.class);
                title = "Numbers in Hindi Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b8.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Hindi.this,HPlanets.class);
                title = "Planets in Hindi Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b9.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Hindi.this,HProfessions.class);
                title = "Professions in Hindi Language ";
                i.putExtra("title",title);
                startActivity(i);
            }
        });

        b11.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Hindi.this,HShapes.class);
                title = "Shapes in Hindi Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b12.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Hindi.this,HSpicies.class);
                title = "Spicies in Hindi Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b13.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Hindi.this,HVegetables.class);
                title = "Vegetables in Hindi Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b14.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Hindi.this,HVehicles.class);
                title = "Vehicles in Hindi Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });


    }

}