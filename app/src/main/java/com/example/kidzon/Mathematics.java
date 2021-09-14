package com.example.kidzon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mathematics extends AppCompatActivity {
    Button count , table,shapes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematics);
        count = findViewById(R.id.count);
        table = findViewById(R.id.table);
        shapes = findViewById(R.id.shapes);
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Mathematics.this,Count.class);
                startActivity(intent);
            }
        });

       table.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Mathematics.this,Tables.class);
               startActivity(intent);
           }
       });

      shapes.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(Mathematics.this,Shapes.class);
              startActivity(intent);
          }
      });
    }
}