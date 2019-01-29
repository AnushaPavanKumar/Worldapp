package com.pavanusha.worldapp;

import java.io.IOException;
import java.io.InputStream;
import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
public class BSpicies extends Activity implements OnClickListener
{
    float size;
    TextView txtContent;
    ImageButton b1,b2;
    AssetManager assetManager;
    InputStream input;
    String title;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_fragment);

        Intent i = getIntent();
        String title= i.getExtras().getString("title");
        setTitle(title);
        txtContent = (TextView) findViewById(R.id.txt);
        b1 = (ImageButton) findViewById(R.id.btnInc);
        b2 = (ImageButton) findViewById(R.id.btnDec);
        assetManager = getAssets();
        Typeface font ;
        font = Typeface.createFromAsset(getAssets(), "akshar.ttf");
        size = txtContent.getTextSize();
        txtContent.setTypeface(font);
        addListenerOnButton();
        try
        {
            input = assetManager.open("benspicies.txt");

            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();
            // byte buffer into a string
            String text = new String(buffer);
            txtContent.setText(text);        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

    }

    public void onBackPressed(View v)
    {
        Intent i = new Intent(this, Bengali.class);
        startActivity(i);
        super.onBackPressed();
    }
}