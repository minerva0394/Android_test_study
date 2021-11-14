package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("mainActivity","调用onCreate");
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.e("mainActivity","调用onStart");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.e("mainActivity","调用onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("mainActivity","调用onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("mainActivity","调用onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("mainActivity","调用onDestroy");
    }
}