package com.example.kidzon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Rhyme extends AppCompatActivity {
    TextView rhymetext;
    String rhyme = "Johny, Johny\n" +
            "Yes, Papa?\n" +
            "Eating sugar?\n" +
            "No, papa!\n" +
            "Telling lies?\n" +
            "No, papa!\n" +
            "Open your mouth\n" +
            "Ah, ah, ah!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhyme);
        rhymetext = findViewById(R.id.rhymetext);
        rhymetext.setText(rhyme);
    }
}