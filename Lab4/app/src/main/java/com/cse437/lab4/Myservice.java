package com.cse437.lab4;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;


public class Myservice extends Service {

    private MediaPlayer mpAudio;
    private String serviceCreatedMessage = "Service Created";
    private String serviceStartedMessage = "Service Started";
    private String serviceStoppedMessage = "Service Stopped";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mpAudio = MediaPlayer.create(this, R.raw.moonlight_sonata);
        mpAudio.setLooping(true);
        Toast.makeText(this, serviceCreatedMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStart(@Nullable Intent intent, int startId) {
        super.onStart(intent, startId);
        mpAudio.start();
        Toast.makeText(this, serviceStartedMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mpAudio.stop();
        Toast.makeText(this, serviceStoppedMessage, Toast.LENGTH_LONG).show();
    }

}
