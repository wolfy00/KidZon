package com.example.kidzon;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static android.content.ContentValues.TAG;


public class CountAdapter extends RecyclerView.Adapter<CountAdapter.ViewHolder> {
    public LinearLayout linearLayout1;
    private CountData[] localDataSet;
    private Context context;
    TextView number,numbname,pic;
    String Url = "android.resource://com.example.kidzon/raw/";

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
        }

    }

    public CountAdapter(CountData[] DataSet,Context mcontext){
        context = mcontext;
        localDataSet = DataSet;
    }


    @NonNull
    @Override
    public CountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.count_layout, parent,false);
        number = view.findViewById(R.id.number);
        pic = view.findViewById(R.id.pic);
        numbname = view.findViewById(R.id.numbname);
        linearLayout1 = view.findViewById(R.id.linearLayout1);

        return new ViewHolder(view);
    }

    public String stringRepeat(String r, Integer n){
        String str = r;
        //number of times repetition

        //empty stringbuffer
        StringBuffer str_bfr = new StringBuffer();
        for(int i=0;i<n;i++)
        {
            //append string to stringbuffer n times
            str_bfr.append(str);
        }
        //converting stringbuffer back to string using toString() method
        str = str_bfr.toString();
        return str;
    }

    @Override
    public void onBindViewHolder(@NonNull CountAdapter.ViewHolder holder, int position) {

       Integer x =  localDataSet[position].getNumb();
       number.setText(x.toString());

        numbname.setText(localDataSet[position].getNumbName());

       pic.setText(stringRepeat("I ",localDataSet[position].getNumb()));

       linearLayout1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(context,  "that is  "+localDataSet[position].getNumb(), Toast.LENGTH_SHORT).show();
               MediaPlayer mediaPlayer =  MediaPlayer.create(context, Uri.parse(Url+localDataSet[position].getNumbName()));
               mediaPlayer.start();

           }
       });




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
