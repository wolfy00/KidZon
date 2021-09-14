package com.example.kidzon;


import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class AlphaAdapter extends RecyclerView.Adapter<AlphaAdapter.ViewHolder> {

    private AlphabetData[] localDataSet;
    public TextView Alphabet, name;
    public ImageView image;
    public Context context;
    LinearLayout linearLayout;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
       // private final TextView textView;
        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

          //  textView = (TextView) view.findViewById(R.id.title_english);
        }

       // public TextView getTextView() {
        //    return textView;
      //  }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public AlphaAdapter(AlphabetData[] dataSet,Context mcontext) {
        localDataSet = dataSet;
        context = mcontext;
    }

    // Create new views (invoked by the layout manager)

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.alphabet_layout, viewGroup, false);
        Alphabet = view.findViewById(R.id.Alphabet);
        name = view.findViewById(R.id.name);
        image = view.findViewById(R.id.imageView);
        linearLayout = view.findViewById(R.id.linearLayout);


        return new ViewHolder(view);
    }



    // Replace the contents of a view (invoked by the layout manager)

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element

        name.setText(localDataSet[position].getName());
        Alphabet.setText(localDataSet[position].getAlphabet());
       image.setImageURI(Uri.parse(localDataSet[position].getImgUrl()+"/drawable/"+localDataSet[position].getName()));

       linearLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Toast.makeText(context, "that is  "+localDataSet[position].getName(), Toast.LENGTH_SHORT).show();
               MediaPlayer a = MediaPlayer.create(context,Uri.parse(localDataSet[position].getImgUrl()+"/raw/"+localDataSet[position].getName()));
               a.start();
           }
       });



    }


    // Return the size of your dataset (invoked by the layout manager)
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
