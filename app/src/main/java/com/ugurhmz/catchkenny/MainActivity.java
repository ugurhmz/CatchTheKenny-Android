package com.ugurhmz.catchkenny;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    // Global Olarak Tanımla
    TextView timeText;
    TextView scoreText;
    int scoreNumber;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize et.
        timeText = findViewById(R.id.timeText);
        scoreText = findViewById(R.id.scoreText);
        scoreNumber = 0;

    }


    public void increaseScore(View view) {
        scoreNumber++;

        scoreText.setText("Score : "+scoreNumber);
    }


}