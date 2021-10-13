package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MainActivity","Verbose");
        Log.d("MainActivity", "Debug");
        Log.i("MainActivity", "Info");
        Log.w("MainActivity", "Warning");
        Log.e("MainActivity", "error");
        Log.wtf("MainActivity", "What the fuck");
    }
}