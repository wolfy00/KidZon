package com.example.kidzon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

public class CapsAlphabet extends AppCompatActivity {
    RecyclerView recyclerView;
     String Url = "android.resource://com.example.kidzon/";




    AlphabetData o1 = new AlphabetData("A",  Url,"apple");
    AlphabetData o2 = new AlphabetData("B",  Url,"banana");
    AlphabetData o3 = new AlphabetData("C",  Url,"cat");
    AlphabetData o4 = new AlphabetData("D",  Url,"dog");
    AlphabetData o5 = new AlphabetData("E",  Url,"elephant");
    AlphabetData o6 = new AlphabetData("F",  Url,"fish");
    AlphabetData o7 = new AlphabetData("G",  Url,"giraffe");
    AlphabetData o8 = new AlphabetData("H",  Url,"house");
    AlphabetData o9 = new AlphabetData("I",  Url,"icecream");
    AlphabetData o10 = new AlphabetData("J",  Url,"joker");
    AlphabetData o11= new AlphabetData("K",  Url,"kite");
    AlphabetData o12= new AlphabetData("L",  Url,"lion");
    AlphabetData o13= new AlphabetData("M",  Url,"monkey");
    AlphabetData o14= new AlphabetData("N",  Url,"nest");
    AlphabetData o15= new AlphabetData("O",  Url,"orange");
    AlphabetData o16= new AlphabetData("P",  Url,"parrot");
    AlphabetData o17= new AlphabetData("Q",  Url,"queen");
    AlphabetData o18= new AlphabetData("R",  Url,"rat");
    AlphabetData o19= new AlphabetData("S",  Url,"sun");
    AlphabetData o20 = new AlphabetData("T",  Url,"tree");
    AlphabetData o21 =new AlphabetData("U",  Url,"umbrella");
    AlphabetData o22= new AlphabetData("V",  Url,"van");
    AlphabetData o23 =new AlphabetData("W",  Url,"watermelon");
    AlphabetData o24= new AlphabetData("X",  Url,"xerox");
    AlphabetData o25 =new AlphabetData("Y",  Url,"yacht");
    AlphabetData o26 = new AlphabetData("Z",  Url,"zebra");



    AlphabetData[] AlphabetsArray = {o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20,o21,o22,o23,o24,o25,o26};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caps_alphabet);
        recyclerView = findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        AlphaAdapter adapter = new AlphaAdapter(AlphabetsArray,this);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, androidx.recyclerview.widget.DividerItemDecoration.VERTICAL));



    }
}