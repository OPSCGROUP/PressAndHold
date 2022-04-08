package com.keshanpadayachee.pressandholdexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String descriptions[];
    int images[] = {R.drawable.barney,R.drawable.dice,R.drawable.gay_unicorn};

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        descriptions = getResources().getStringArray(R.array.description);

        RecyclerAdapter adapter = new RecyclerAdapter(this,images,descriptions);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}