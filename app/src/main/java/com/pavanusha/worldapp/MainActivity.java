package com.pavanusha.worldapp;

import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends DashBoardActivity {

    String title;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonClicker(View v)
    {
        Intent intent;

        switch (v.getId())
        {
            case R.id.Bengali:

                intent = new Intent(this, Bengali.class);
                title = "Bengali Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.Devanagari:
                intent = new Intent(this, Devanagari.class);
                title = "Sanskrit Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.English:
                intent = new Intent(this, English.class);
                title = "English Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.Gujarathi:
                intent = new Intent(this, Gujarathi.class);
                title = "Gujarathi Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.Kannada:
                intent = new Intent(this, Kanada.class);
                title = "Kannada Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.Malayalam:
                intent = new Intent(this, Malayalam.class);
                title = "Malyalam Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.hindi:
                intent = new Intent(this, Hindi.class);
                title = "Hindi Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.Tamil:
                intent = new Intent(this, Tamil.class);
                title = "Tamil Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;

            case R.id.Telugu:
                intent = new Intent(this, Telugu.class);
                title = "Telugu Language";
                intent.putExtra("title",title);
                startActivity(intent);
                break;
            default:
                break;
        }
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