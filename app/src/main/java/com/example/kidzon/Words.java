package com.example.kidzon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Words extends AppCompatActivity {
      String[] words = {"in", "out", "off", "on", "good", "bad", "new", "old", "little","big", "dry", "wet", "hot", "cold", "up", "down", "soft",
                        "hard", "easy", "hard", "narrow", "wide", "long", "short", "tall", "short", "high", "low", "slow", "fast", "rough", "smooth",
                       "happy", "sad", "dirty", "clean", "begin", "end", "start", "finish", "weak", "strong", "alive", "dead", "dark", "light", "heavy", "light",
                       "empty", "full", "awake", "asleep", "under", "over", "closed", "open", "loose", "tight", "young", "old","early", "late", "poor", "rich", "cool",
                    "warm", "wrong", "right", "left", "right", "thick", "thin", "few", "many", "pull", "push", "near", "far", "north", "south", "winter", "summer",
                   "east", "west", "night", "day", "morning", "night", "stop", "go", "above", "below"};
      TextView setword,setopword;
      String word="",opword="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        setword = findViewById(R.id.word);
        setopword = findViewById(R.id.opword);

        for (int i = 0; i < words.length ; i++) {

            if (i % 2 == 0) {
                word +=  words[i]+"  "+"\n";
            } else {
                opword += words[i]+"  "+"\n";

            }


        }
            setword.setText(word);
        setopword.setText(opword);
    }
}