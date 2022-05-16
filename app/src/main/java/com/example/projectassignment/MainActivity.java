package com.example.projectassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener{
    private RecyclerView recyclerView;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a19xinhu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //List<String> mountains = Arrays.asList("Kinnekulle","Billingen","K2","Kebenikaise","Hannerberg","Hunneberg");

        recyclerView = findViewById(R.id.recycler_view);

        new JsonTask(this).execute(JSON_URL);   //json data from URL
        //DataAdapter dataAdapter = new DataAdapter(data);
        //recyclerView.setAdapter(dataAdapter);
        //recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    @Override
    public void onPostExecute(String json) {

        Gson gson = new Gson();
        Type type = new TypeToken<List<Data>>() {}.getType();
        List<Data> listOfData = gson.fromJson(json, type);
        recyclerView.setAdapter(new DataAdapter(listOfData));
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }
}