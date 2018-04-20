package com.gamma.recyclerapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by UCA on 19/04/2018.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder>{
    private ArrayList<Movie> movies;

    public static class MovieViewHolder extends RecyclerView.ViewHolder{
        CardView card;
        TextView name;
        ImageView img;
        Button btn;

        public MovieViewHolder(View itemView){
            super(itemView);
            card = itemView.findViewById(R.id.maincard);
            name = itemView.findViewById(R.id.title);
            img = itemView.findViewById(R.id.img);
            btn = itemView.findViewById(R.id.btn);
        }
    }

    public MovieAdapter(ArrayList<Movie> movies){
        this.movies = movies;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview,parent,false);
        return (new MovieViewHolder(v));
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {
        holder.name.setText(movies.get(position).getName());
        holder.img.setImageResource(movies.get(position).getImg());
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),movies.get(position).getDesc(),Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
