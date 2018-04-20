package com.gamma.recyclerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    MovieAdapter adapter;
    ArrayList<Movie> movies;
    LinearLayoutManager lmanager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movies = new ArrayList<Movie>();
        rv =findViewById(R.id.mainrecycler);
        rv.setHasFixedSize(true);

        lmanager = new LinearLayoutManager(this);
        rv.setLayoutManager(lmanager);
        prepareMovies();
        adapter = new MovieAdapter(movies);
        rv.setAdapter(adapter);
    }

    public void prepareMovies(){
        String TAG = "MSG";
        movies = new ArrayList<>();
        movies.add(new Movie("Avengers: Infinity War","2:30",R.drawable.img1,"Lastest Marvel MCU Movie"));
        movies.add(new Movie("Jurassic World : Fallen Kingdom","2:00",R.drawable.img2,"Lastest Jurassic World Movie"));
    }
}
