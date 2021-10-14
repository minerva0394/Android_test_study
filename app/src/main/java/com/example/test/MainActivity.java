package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_TEST);
        //todo java代码中，获取图片资源失效，需要解决
        setContentView(R.layout.activity_main);
        getResources().getDimension(R.dimen.activity_horizontal_margin);
        Log.v("MainActivity","Verbose");
        Log.d("MainActivity", "Debug");
        Log.i("MainActivity", "Info");
        Log.w("MainActivity", "Warning");
        Log.e("MainActivity", "error");
        Log.wtf("MainActivity", "What the fuck");
    }
}