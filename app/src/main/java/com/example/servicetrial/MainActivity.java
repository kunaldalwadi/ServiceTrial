package com.example.servicetrial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.servicetrial.databinding.MainActivityBinding;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    For more information
//    https://developer.android.com/guide/components/services

    private MainActivityBinding mMainActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainActivityBinding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(mMainActivityBinding.getRoot());

        mMainActivityBinding.btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(MainActivity.this, MyService.class));
            }
        });

        mMainActivityBinding.btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this, MyService.class));
            }
        });
    }
}