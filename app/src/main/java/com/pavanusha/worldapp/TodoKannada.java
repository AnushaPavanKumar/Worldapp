package com.pavanusha.worldapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class TodoKannada extends Activity {

    String title;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_kannada);

    }
    public void onButtonClicker(View v)
    {
        Intent intent;

        switch (v.getId())
        {
            case R.id.learn_kannada:

                intent = new Intent(this, Kanada.class);
                title = "Bengali Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.write_bengali:
                intent = new Intent(this, Write.class);
                title = "Tamil Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.play_bengali:
                intent = new Intent(this, Play.class);
                title = "Telugu Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

   
}