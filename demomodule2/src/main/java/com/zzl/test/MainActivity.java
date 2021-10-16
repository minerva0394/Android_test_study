package com.zzl.test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundResource(R.mipmap.bg);
        setContentView(frameLayout);
        TextView textView1 = new TextView(this);
        textView1.setText("开始游戏");
        textView1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        textView1.setTextColor(Color.rgb(255,251,240));
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        textView1.setLayoutParams(params);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this).setTitle("系统提示")
                        .setMessage("Becareful")
                        .setPositiveButton("确定",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Log.i("桌面台球","进入游戏");
                                    }
                                }).setNegativeButton("退出", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.i("桌面台球","退出游戏");
                        finish();
                    }
                }).show();
            }
        });
        frameLayout.addView(textView1);
    }
}