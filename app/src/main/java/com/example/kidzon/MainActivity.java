package com.example.kidzon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button eng , math, gk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eng = findViewById(R.id.eng);
        math = findViewById(R.id.math);
        gk = findViewById(R.id.gk);

        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome to English", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, English.class);
                startActivity(intent);


            }
        });

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome to Mathematics", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Mathematics.class);
                startActivity(intent);

            }
        });

        gk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome to General Knowledge", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, GeneralKnowledge.class);
                startActivity(intent);

            }
        });





    }
}