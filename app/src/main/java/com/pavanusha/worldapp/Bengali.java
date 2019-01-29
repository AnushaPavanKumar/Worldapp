package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class Bengali extends Activity {


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


                Intent i = new Intent(Bengali.this,BAlphabets.class);
                title = "Alpahabets in Bengali Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });


        b2.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Bengali.this,BAnimals.class);
                title = "Animals in Bengali Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });

        b3.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Bengali.this,BBirds.class);
                title = "Birds in Bengali Language ";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Bengali.this,BColors.class);
                title = "Colors in Bengali Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Bengali.this,BFruits.class);
                title = "Fruits in Bengali Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Bengali.this,BLVeg.class);
                title = "Leafy Vegetables in Bengali Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Bengali.this,BNos.class);
                title = "Numbers in Bengali Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b8.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Bengali.this,BPlanets.class);
                title = "Planets in Bengali Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b9.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Bengali.this,BProfessions.class);
                title = "Professions in Bengali Language ";
                i.putExtra("title",title);
                startActivity(i);
            }
        });

        b11.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Bengali.this,BShapes.class);
                title = "Shapes in Bengali Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b12.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Bengali.this,BSpicies.class);
                title = "Spicies in Bengali Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b13.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Bengali.this,BVegetables.class);
                title = "Vegetables in Bengali Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b14.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Bengali.this,BVehicles.class);
                title = "Vehicles in Bengali Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });


    }

}