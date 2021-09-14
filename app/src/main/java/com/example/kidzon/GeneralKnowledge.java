package com.example.kidzon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GeneralKnowledge extends AppCompatActivity {
    Button animalBtn,fruitBtn,colorBtn;
    public Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_knowledge);
        animalBtn = findViewById(R.id.animalBtn);
        fruitBtn = findViewById(R.id.fruitBtn);
        colorBtn = findViewById(R.id.colorBtn);

        animalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(GeneralKnowledge.this, AnimalsName.class);

                startActivity(intent);




            }
        });
        fruitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 intent = new Intent(GeneralKnowledge.this, Fruits.class);

                startActivity(intent);

            }
        });

        colorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(GeneralKnowledge.this, Colors.class);

                startActivity(intent);

            }
        });
    }
}

