package com.londonappbrewery.magiceightball;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    final Button ask = findViewById(R.id.askbutton);
    final ImageView ball = findViewById(R.id.ballImage);

   final  int[] magic = {R.drawable.ball1,
                            R.drawable.ball2,
                            R.drawable.ball3,
                            R.drawable.ball4,
                            R.drawable.ball5};
            ask.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Random r = new Random ();
                    int choice = r.nextInt(4);

                    ball.setImageResource(magic[choice]);

                }
            });
        }
    }











