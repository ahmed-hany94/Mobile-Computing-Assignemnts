package com.cse437.lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText weightEditText;
    EditText heightEditText;
    public static final String WEIGHT_MESSAGE = "com.cse437.lab3.WEIGHT_MESSAGE";
    public static final String HEIGHT_MESSAGE = "com.cse437.lab3.HEIGHT_MESSAGE";
    private final String warningMessage = "You must enter a valid weight and height value";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, Display.class);
        weightEditText = findViewById(R.id.weightEditText);
        heightEditText = findViewById(R.id.heightEditText);
        String weightEditTextString = weightEditText.getText().toString();
        String heightEditTextString = heightEditText.getText().toString();

        if (isNum(weightEditTextString)  && isNum(heightEditTextString)){
            intent.putExtra(WEIGHT_MESSAGE, weightEditTextString);
            intent.putExtra(HEIGHT_MESSAGE, heightEditTextString);
            startActivity(intent);
        }else{
            Toast.makeText(this, warningMessage, Toast.LENGTH_LONG).show();
        }

    }

    private boolean isNum(String s){
        return !s.matches("") && s.matches("[0-9.]+");
    }

}
