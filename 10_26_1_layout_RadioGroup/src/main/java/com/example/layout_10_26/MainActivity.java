package com.example.layout_10_26;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author zengzl
 */
public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        radioGroup = findViewById(R.id.rdg);
        textView = findViewById(R.id.tv1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.rb1) {
                    textView.setText("性别:男");
                    Toast.makeText(MainActivity.this,"性别:男",Toast.LENGTH_SHORT).show();
                } else {
                    textView.setText("性别:女");
                    Toast.makeText(MainActivity.this,"性别:女",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}