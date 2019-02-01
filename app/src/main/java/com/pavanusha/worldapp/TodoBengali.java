package com.pavanusha.worldapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class TodoBengali extends Activity {

    String title;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_bengali);

    }
    public void onButtonClicker(View v)
    {
        Intent intent;

        switch (v.getId())
        {
            case R.id.learn_bengali:

                intent = new Intent(this, Bengali.class);
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