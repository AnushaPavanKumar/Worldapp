package com.pavanusha.worldapp;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

@SuppressLint("ClickableViewAccessibility") public class EAlphabets extends Activity implements OnClickListener, OnTouchListener
{
    TextView txtContent;
    private ImageView imagenumber;
    @SuppressWarnings("unused")
    private ImageButton btnprevious,  btnnext,btnsize;
    private int screennumber=0;


    int size=0;
    Bitmap bitmap;
    Canvas canvas;
    Paint paint;
    Path mPath;

    float downx = 0,downy = 0,upx = 0,upy = 0;

    @SuppressWarnings("deprecation")
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);
        Intent i = getIntent();
        String title= i.getExtras().getString("title");
        setTitle(title);
        txtContent = (TextView) findViewById(R.id.txt);
        imagenumber=(ImageView)findViewById(R.id.imagenumber);
        /*imagenumber.setImageResource(R.drawable.e_a);*/
        txtContent.setText("A ");
        btnprevious=(ImageButton)findViewById(R.id.btnprevious);
        btnprevious.setEnabled(false);
        btnprevious.setOnClickListener(this);
        btnnext=(ImageButton)findViewById(R.id.btnnext);
        btnnext.setOnClickListener(this);
        Display currentDisplay = getWindowManager().getDefaultDisplay();
        float dw = currentDisplay.getWidth();
        float dh = currentDisplay.getHeight();
        bitmap = Bitmap.createBitmap((int) dw, (int) dh,Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        // and we set a new Paint with the desired attributes
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(4f);
        size=10;
        imagenumber.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.alpa) );
        imagenumber.setOnTouchListener(this);
    }

    public boolean onTouch(View v, MotionEvent event)
    {
        int action = event.getAction();
        switch (action)
        {
            case MotionEvent.ACTION_DOWN:
                downx = event.getX();
                downy = event.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                upx = event.getX();
                upy = event.getY();
                canvas.drawLine(downx, downy, upx, upy, paint);
                imagenumber.invalidate();
                downx = upx;
                downy = upy;
                break;
            case MotionEvent.ACTION_UP:
                upx = event.getX();
                upy = event.getY();
                canvas.drawLine(downx, downy, upx, upy, paint);
                imagenumber.invalidate();
                break;
            case MotionEvent.ACTION_CANCEL:
                break;
            default:
                break;
        }
        return true;
    }

    public void onClick(View arg0)
    {

        if(arg0.getId()==R.id.btnprevious)
        {
            screennumber--;//minus 1 to the screennumber
            changeNumber(screennumber);
            if(screennumber==0){
                //disable btnprevious
                btnprevious.setEnabled(false);
            }
            else
            {
                //enable btnprevious
                btnprevious.setEnabled(true);
            }
            changeNumber(screennumber);
            btnnext.setEnabled(true);
        }
        else if(arg0.getId()==R.id.btnnext)
        {
            screennumber++;//add 1 to the screennumber
            changeNumber(screennumber);
            if(screennumber==26 )
            {
                //disable btnprevious
                btnnext.setEnabled(false);
            }
            else
            {
                //enable btnprevious
                btnnext.setEnabled(true);
            }
            changeNumber(screennumber);
            btnprevious.setEnabled(true);

        }

    }//end onClick

    private void changeNumber(int screen)
    {
        switch (screen)
        {
            case 0:
                imagenumber.setImageResource(R.drawable.e_a);
                txtContent.setText("A");
                break;
            case 1:
                imagenumber.setImageResource(R.drawable.e_b);
                txtContent.setText("B");
                break;
            case 2:
                imagenumber.setImageResource(R.drawable.e_c);
                txtContent.setText("C");
                break;
            case 3:
                imagenumber.setImageResource(R.drawable.e_d);
                txtContent.setText("D");
                break;
            case 4:
                imagenumber.setImageResource(R.drawable.e_e);
                txtContent.setText("E");
                break;
            case 5:
                imagenumber.setImageResource(R.drawable.e_f);
                txtContent.setText("F");
                break;
            case 6:
                imagenumber.setImageResource(R.drawable.e_g);
                txtContent.setText("G ");
                break;
            case 7:
                imagenumber.setImageResource(R.drawable.e_h);
                txtContent.setText("H");
                break;
            case 8:
                imagenumber.setImageResource(R.drawable.e_i);
                txtContent.setText("I");
                break;
            case 9:
                imagenumber.setImageResource(R.drawable.e_j);
                txtContent.setText("J");
                break;


            case 10:
                imagenumber.setImageResource(R.drawable.e_k);
                txtContent.setText("K");
                break;
            case 11:
                imagenumber.setImageResource(R.drawable.e_l);
                txtContent.setText("L");
                break;
            case 12:
                imagenumber.setImageResource(R.drawable.e_m);
                txtContent.setText("M");
                break;
            case 13:
                imagenumber.setImageResource(R.drawable.e_n);
                txtContent.setText("N");
                break;
            case 14:
                imagenumber.setImageResource(R.drawable.e_o);
                txtContent.setText("O");
                break;
            case 15:
                imagenumber.setImageResource(R.drawable.e_p);
                txtContent.setText("P");
                break;
            case 16:
                imagenumber.setImageResource(R.drawable.e_q);
                txtContent.setText("Q");
                break;
            case 17:
                imagenumber.setImageResource(R.drawable.e_r);
                txtContent.setText("R");
                break;
            case 18:
                imagenumber.setImageResource(R.drawable.e_s);
                txtContent.setText("S");
                break;

            case 19:
                imagenumber.setImageResource(R.drawable.e_t);
                txtContent.setText("T");
                break;
            case 20:
                imagenumber.setImageResource(R.drawable.e_u);
                txtContent.setText("U");
                break;
            case 21:
                imagenumber.setImageResource(R.drawable.e_v);
                txtContent.setText("V");
                break;
            case 22:
                imagenumber.setImageResource(R.drawable.e_w);
                txtContent.setText("W");
                break;
            case 23:
                imagenumber.setImageResource(R.drawable.e_x);
                txtContent.setText("X");
                break;
            case 24:
                imagenumber.setImageResource(R.drawable.e_y);
                txtContent.setText("Y ");
                break;
            case 25:
                imagenumber.setImageResource(R.drawable.e_z);
                txtContent.setText("Z");
                break;

        }
    }//end changeNumber
}