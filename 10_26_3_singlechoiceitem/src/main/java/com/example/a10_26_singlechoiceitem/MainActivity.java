package com.example.a10_26_singlechoiceitem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * @author zengzl
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private int[] textSizeArr = {10, 20, 25, 30, 40};
    int textSize = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        // 设置按钮监听
        findViewById(R.id.bt1).setOnClickListener(this);
        textView = findViewById(R.id.tv1);
    }

    @Override
    public void onClick(View v) {
        AlertDialog dialog;
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("设置字体大小")
                .setIcon(R.mipmap.ic_launcher)
                .setSingleChoiceItems(new String[]{"小号", "默认", "中号",
                        "大号", "特大号"}, textSize, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        textSize = which;
                    }
                })
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    //设置字体大小
                    public void onClick(DialogInterface dialog, int which) {
                        textView.setTextSize(textSizeArr[textSize]);
                        dialog.dismiss(); //关闭对话框
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        dialog = builder.create();
        dialog.show();
    }
}