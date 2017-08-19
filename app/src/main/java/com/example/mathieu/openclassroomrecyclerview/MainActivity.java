package com.example.mathieu.openclassroomrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RecyclerView rv = (RecyclerView) findViewById(R.id.list);

        rv.setLayoutManager(new LinearLayoutManager(this));

        rv.setAdapter(new MyAdapter());
    }
}
