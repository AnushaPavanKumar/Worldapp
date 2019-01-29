package com.pavanusha.worldapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.os.Build;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.widget.ImageButton;
import java.io.InputStream;
import android.content.res.AssetManager;

@TargetApi(Build.VERSION_CODES.GINGERBREAD)
@SuppressLint("NewApi")

public class Content extends Activity
{


    float size;
    TextView txtContent;
    ImageButton b1,b2;
    AssetManager assetManager;
    InputStream input;



    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        position=position+1;


        switch(position)
        {
            case 1 :
                Intent a1 = new Intent(getApplicationContext(), BAlphabets.class);
                // passing array index
                a1.putExtra("id", position);
                startActivity(a1);
                break;

            case 2 :
                Intent a2 = new Intent(getApplicationContext(), BAnimals.class);
                // passing array index
                a2.putExtra("id", position);
                startActivity(a2);
                break;

            case 3:
                Intent a3 = new Intent(getApplicationContext(), BBirds.class);
                // passing array index
                a3.putExtra("id", position);
                startActivity(a3);
                break;

            case 4:
                Intent a4 = new Intent(getApplicationContext(), BColors.class);
                // passing array index
                a4.putExtra("id", position);
                startActivity(a4);
                break;

            case 5:
                Intent a5 = new Intent(getApplicationContext(), BFruits.class);
                // passing array index
                a5.putExtra("id", position);
                startActivity(a5);
                break;

            case 6:
                Intent a6 = new Intent(getApplicationContext(), BLVeg.class);
                // passing array index
                a6.putExtra("id", position);
                startActivity(a6);
                break;

            case 7:
                Intent a7 = new Intent(getApplicationContext(), BNos.class);
                // passing array index
                a7.putExtra("id", position);
                startActivity(a7);
                break;

            case 8:
                Intent a8 = new Intent(getApplicationContext(), BPlanets.class);
                // passing array index
                a8.putExtra("id", position);
                startActivity(a8);
                break;

            case 9:
                Intent a9 = new Intent(getApplicationContext(), BProfessions.class);
                // passing array index
                a9.putExtra("id", position);
                startActivity(a9);
                break;


            case 10:
                Intent a11 = new Intent(getApplicationContext(), BShapes.class);
                // passing array index
                a11.putExtra("id", position);
                startActivity(a11);
                break;

            case 11:
                Intent a12 = new Intent(getApplicationContext(), BSpicies.class);
                // passing array index
                a12.putExtra("id", position);
                startActivity(a12);
                break;

            case 12:
                Intent a13 = new Intent(getApplicationContext(), BVegetables.class);
                // passing array index
                a13.putExtra("id", position);
                startActivity(a13);
                break;

            case 13:
                Intent a14 = new Intent(getApplicationContext(), BVehicles.class);
                // passing array index
                a14.putExtra("id", position);
                startActivity(a14);
                break;


        }
    }
}
