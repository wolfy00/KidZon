package com.example.kidzon;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {
    String [] localDataSet;
    String Url = "android.resource://com.example.kidzon/drawable/";
    ImageView image;
    TextView name;
    Context context;


    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(View view) {
            super(view);
        }
    }
    public AnimalAdapter(String [] localDataSet, Context context){
        this.context = context;
        this.localDataSet = localDataSet;
    }

    @NonNull
    @Override
    public AnimalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.names_layout,parent,false);
       image =  view.findViewById(R.id.imageView);
       name = view.findViewById(R.id.name);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalAdapter.ViewHolder holder, int position) {

        image.setImageURI(Uri.parse(Url+localDataSet[position]));
        name.setText(localDataSet[position]);

    }
    @Override


    public int getItemCount() {
        return localDataSet.length;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}
