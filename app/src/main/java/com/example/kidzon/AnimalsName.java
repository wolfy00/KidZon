package com.example.kidzon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnimalsName extends AppCompatActivity {
    RecyclerView recyclerView;
   String [] animals = {"lion","horse","tiger","rhinoceros","giraffe","leopard","cow","bear","deer","panda","camel"};

    AnimalAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_animals_name);
        recyclerView = findViewById(R.id.recyclerView2);



        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
            adapter = new AnimalAdapter(animals, this);

        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL));



    }
}