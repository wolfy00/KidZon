package com.example.kidzon;

import android.net.Uri;

import java.net.URI;

public class AlphabetData {

    private String Alphabet;
    private String ImgUrl;
    private String name;
    public AlphabetData(String Alphabet, String ImgUrl, String name){

        this.Alphabet = Alphabet;
        this.ImgUrl = ImgUrl;
        this.name = name;
    }

    public String getAlphabet() {
        return Alphabet;
    }

    public String getImgUrl() {
        return ImgUrl;
    }
     public String getName(){
        return name;
    }

}
