package com.keshanpadayachee.pressandholdexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder>
{

    Context context;
    int images[];
    String descriptions[];

    public RecyclerAdapter(Context pCt, int pImages[], String pDescriptions[]) {
        this.context = pCt;
        this.images = pImages;
        this.descriptions = pDescriptions;
    }



    public class RecyclerHolder extends RecyclerView.ViewHolder {

        ImageView imgDisplay;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            imgDisplay = itemView.findViewById(R.id.imgImages);

        }
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_layout,parent,false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {
        holder.imgDisplay.setImageResource(images[position]);
        holder.imgDisplay.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(context, descriptions[position], Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }


}
