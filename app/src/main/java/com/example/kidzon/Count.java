package com.example.kidzon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Count extends AppCompatActivity {
    RecyclerView recyclerView;

    CountData o1 = new CountData(1,"one");
    CountData o2 = new CountData(2,"two");
    CountData o3 = new CountData(3,"three");
    CountData o4 = new CountData(4,"four");
    CountData o5 = new CountData(5,"five");
    CountData o6 = new CountData(6,"six");
    CountData o7= new CountData(7,"seven");
    CountData o8= new CountData(8,"eight");
    CountData o9= new CountData(9,"nine");
    CountData o10= new CountData(10,"ten");
    CountData o11= new CountData(11,"eleven");
    CountData o12= new CountData(12,"twelve");
    CountData o13= new CountData(13,"thirteen");
    CountData o14= new CountData(14,"fourteen");
    CountData o15= new CountData(15,"fifteen");
    CountData o16= new CountData(16,"sixteen");
    CountData o17= new CountData(17,"seventeen");
    CountData o18= new CountData(18,"eighteen");
    CountData o19= new CountData(19,"nineteen");
    CountData o20= new CountData(20,"twenty");

    CountData[] arr = {o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CountAdapter adapter = new CountAdapter(arr,this);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,androidx.recyclerview.widget.DividerItemDecoration.VERTICAL));


    }
}