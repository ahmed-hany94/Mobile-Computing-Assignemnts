package com.cse437.lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    private float height;
    private float weigth;
    private float bmi;
    TextView BMIValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        height = Float.parseFloat(intent.getStringExtra(MainActivity.HEIGHT_MESSAGE)) / 100;
        weigth = Float.parseFloat(intent.getStringExtra(MainActivity.WEIGHT_MESSAGE));
        bmi = weigth / (height * height);
        BMIValue = findViewById(R.id.BMIValue);
        BMIValue.setText(String.valueOf(bmi));
    }
}
