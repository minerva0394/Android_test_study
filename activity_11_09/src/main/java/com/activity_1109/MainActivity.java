package com.activity_1109;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button clickb_tn;
    private Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        clickb_tn = findViewById(R.id.bt1);

        bt2 = findViewById(R.id.bt2);

        clickb_tn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);
                intent.putExtra("studentName", "王晓明");
                intent.putExtra("score", 99);
                intent.putExtra("isPassed", true);

                startActivity(intent);  //startActivity和finish相互使用
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);

                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1 && resultCode == 2){
            String result = data.getStringExtra("data");
            Toast.makeText(MainActivity.this, result,Toast.LENGTH_SHORT).show();

        }
    }
}