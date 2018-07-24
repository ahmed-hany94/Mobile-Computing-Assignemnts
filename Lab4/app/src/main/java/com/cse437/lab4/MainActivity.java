package com.cse437.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button playBtn;
    private Button stopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playBtn = findViewById(R.id.startServiceBtn);
        playBtn.setOnClickListener(this);
        stopBtn = findViewById(R.id.stopServiceBtn);
        stopBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == playBtn){
            startService(new Intent(this, Myservice.class));
        }else if(view == stopBtn){
            stopService(new Intent(this, Myservice.class));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.
        }
    }*/
}
