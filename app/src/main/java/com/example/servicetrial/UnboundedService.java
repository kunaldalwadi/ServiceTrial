package com.example.servicetrial;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

class UnboundedService extends Service {

    private MediaPlayer mMediaPlayer;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        //Things you want service to do goes here.
        mMediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        mMediaPlayer.setLooping(true);
        mMediaPlayer.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {

        //Stop your process or service here.
        mMediaPlayer.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
