package com.pavanusha.worldapp;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

//import com.hitomi.cmlibrary.CircleMenu;

public class MainActivity extends DashBoardActivity {

    MediaPlayer mysong;
    String title;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mysong=MediaPlayer.create(MainActivity.this,R.raw.music);
        mysong.start();


    }

    public void onButtonClicker(View v)
    {
        Intent intent;

        switch (v.getId())
        {
            case R.id.Bengali:

                intent = new Intent(this, TodoBengali.class);
                title = "Bengali Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.Devanagari:
                intent = new Intent(this, TodoDevanagari.class);
                title = "Sanskrit Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.English:
                intent = new Intent(this, TodoEnglish.class);
                title = "English Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.Gujarathi:
                intent = new Intent(this, TodoGujarathi.class);
                title = "Gujarathi Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.Kannada:
                intent = new Intent(this, TodoKannada.class);
                title = "Kannada Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.Malayalam:
                intent = new Intent(this, TodoMalayalam.class);
                title = "Malyalam Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.hindi:
                intent = new Intent(this, TodoHindi.class);
                title = "Hindi Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.Tamil:
                intent = new Intent(this, TodoTamil.class);
                title = "Tamil Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.Telugu:
                intent = new Intent(this, TodoTelugu.class);
                title = "Telugu Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;
            default:
                break;
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        mysong.release();
    }



    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(R.drawable.ic_launcher).setTitle("Confirm")
                .setMessage("Do you really want to exit?")
                .setPositiveButton("YES", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        Toast.makeText(getBaseContext(), "Thanks for using our app", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }).setNegativeButton("NO", null).show();
    }
}