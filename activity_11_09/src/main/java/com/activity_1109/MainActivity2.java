package com.activity_1109;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private ImageView clickb_tn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        clickb_tn2 = findViewById(R.id.image1);

        clickb_tn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                finish();
                Intent intent = getIntent();
                String name = intent.getStringExtra("studentName");
                int score = intent.getIntExtra("score",0);
                boolean isPassed = intent.getBooleanExtra("isPadded", true);
                Toast.makeText(MainActivity2.this, "获取到的姓名为"+name, Toast.LENGTH_SHORT).show();

            }

        });

    }
}