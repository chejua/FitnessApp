package com.example.geo.fitnessapp;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo = (ImageView) findViewById(R.id.imageView);
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.logoViewScreen);
        //imageBart.setTranslationX(-1000f);
        //imageBart.animate().translationXBy(1000f).setDuration(5000);
        //imageBart.animate().scaleX(0.5f).scaleY(0.5f).setDuration(8000);
        //imageBart.animate().rotationX(180f).setDuration(8000);
        relativeLayout.animate().alpha(0.0f).setStartDelay(2000).setDuration(3000);

        final GridLayout gridLayout = (GridLayout)findViewById(R.id.gridLayout);

        CountDownTimer timer = new CountDownTimer(5000, 1000){

            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

                gridLayout.setVisibility(View.VISIBLE);


            }
        }.start();




  }
}

