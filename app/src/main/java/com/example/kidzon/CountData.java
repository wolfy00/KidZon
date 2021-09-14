package com.example.kidzon;



public class CountData {
    private int Numb;
    private String NumbName;


    public CountData(int Numb, String NumbName ){
        this.Numb = Numb;
        this.NumbName = NumbName;

    }
    public int getNumb(){
        return Numb;
    }

    public String getNumbName(){
        return NumbName;
    }


}
