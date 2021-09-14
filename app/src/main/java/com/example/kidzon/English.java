package com.example.kidzon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class English extends AppCompatActivity {
    Button CapsAlpha, Words,rhyme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        CapsAlpha = findViewById(R.id.CapsAlpha);
        Words = findViewById(R.id.words);
        rhyme = findViewById(R.id.rhyme);


        CapsAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(English.this, "Let's Learn Alphabets", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(English.this,CapsAlphabet.class);
                startActivity(intent);

            }
        });

        Words.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(English.this, Words.class);
                startActivity(intent);
            }
        });

        rhyme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(English.this, Rhyme.class);
                startActivity(intent);

            }
        });

    }
}