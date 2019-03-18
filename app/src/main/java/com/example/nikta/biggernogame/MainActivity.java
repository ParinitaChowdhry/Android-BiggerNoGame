package com.example.nikta.biggernogame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    private int num1;
    private int num2;
    private int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pickNumbers();
    }

    public void pickNumbers()
    {
        //initial code
        TextView t =(TextView) findViewById(R.id.pointsView);
        t.setText("Points: " + String.valueOf(points));
        Random r = new Random();
        num1 =r.nextInt(10);
        Button LeftButton = (Button)findViewById(R.id.button2);
        LeftButton.setText(String.valueOf(num1));

        num2 =r.nextInt(10);
        Button RightButton = (Button)findViewById(R.id.button3);
        RightButton.setText(String.valueOf(num2));
    }

    public void rightButtonClick(View view) {
        if(num2>num1)
        {
        points++;
        }
        else
        {
        points--;
        }
        pickNumbers();
    }

    public void leftButtonClick(View view) {
        if(num1>num2)
        {
            points++;
        }
        else
        {
            points--;
        }
        pickNumbers();
    }
}
