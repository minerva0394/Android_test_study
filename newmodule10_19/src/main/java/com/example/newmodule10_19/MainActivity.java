package com.example.newmodule10_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button btn2;
    private Button btn1;
    private EditText account;
    private EditText password;
    private TextView text1;
    private TextView text2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        btn1 = findViewById(R.id.Btn1);
        btn2 = findViewById(R.id.Btn2);
        account = findViewById(R.id.account);
        password = findViewById(R.id.password);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);

        // 匿名内部类实现点击效果
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.setText("跳转中...");
                Log.i("一键登录按钮", "一键登录被点击");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setText("正在登录中");
                Log.i("登录按钮", "登录按钮被点击");
            }
        });

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("账号输入", "账号正在输入");
            }
        });

        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("密码输入框", "密码正在输入");
            }
        });

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("忘记密码", "点击");
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("注册新账号", "点击");
            }
        });

    }

//    public void btnClick(View view) {
//        btn2.setText("Click");
//    }
}