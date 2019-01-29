package com.pavanusha.worldapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class Kanada extends Activity {


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


                Intent i = new Intent(Kanada.this,KAlphabets.class);
                title = "Alpahabets in Kannada Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });


        b2.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Kanada.this,KAnimals.class);
                title = "Animals in Kannada Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });

        b3.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Kanada.this,KBirds.class);
                title = "Birds in Kannada Language ";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Kanada.this, KColors.class);
                title = "Colors in Kannada Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Kanada.this,KFruits.class);
                title = "Fruits in Kannada Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Kanada.this,KLVeg.class);
                title = "Leafy Vegetables in Kannada Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Kanada.this,KNos.class);
                title = "Numbers in Kannada Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b8.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Kanada.this,KPlanets.class);
                title = "Planets in Kannada Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b9.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Kanada.this,KProfessions.class);
                title = "Professions in Kannada Language ";
                i.putExtra("title",title);
                startActivity(i);
            }
        });

        b11.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Kanada.this,KShapes.class);
                title = "Shapes in Kannada Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b12.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Kanada.this,KSpicies.class);
                title = "Spicies in Kannada Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b13.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Kanada.this,KVegetables.class);
                title = "Vegetables in Kannada Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        b14.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(Kanada.this,KVehicles.class);
                title = "Vehicles in Kannada Language";
                i.putExtra("title",title);
                startActivity(i);
            }
        });


    }

}