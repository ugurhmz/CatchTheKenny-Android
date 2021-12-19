package com.ugurhmz.catchkenny;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    // Global Olarak Tanımla
    TextView timeText;
    TextView scoreText;
    int scoreNumber;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView[] imageArray;
    Handler handler;
    Runnable runnable;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize et.
        timeText = findViewById(R.id.timeText);
        scoreText = findViewById(R.id.scoreText);
        scoreNumber = 0;
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);


        imageArray = new ImageView[] {imageView1,imageView2, imageView3,  imageView4,imageView5, imageView6, imageView7, imageView8, imageView9};

        hideImages();

        new CountDownTimer(10000, 1000) {

            @Override
            public void onTick(long l) {
                timeText.setText("Time : "+ l / 1000);
            }

            @Override
            public void onFinish() {

            }
        }.start();

    }

    // Increase Score
    public void increaseScore(View view) {
        scoreNumber++;

        scoreText.setText("Score : "+scoreNumber);
    }


    // Hide Images
    public void hideImages(){

        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {
                for(ImageView image : imageArray){
                    image.setVisibility(View.INVISIBLE);
                }

                //random generate
                Random random = new Random();
                int randNumber = random.nextInt(9); // 0 & 8' dahil üret.
                imageArray[randNumber].setVisibility(View.VISIBLE);

                handler.postDelayed(this, 370);
            }
        };

        handler.post(runnable);

    }
}