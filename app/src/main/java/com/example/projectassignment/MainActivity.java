package com.example.projectassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener{
    private RecyclerView recyclerView;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a19xinhu";
    private DataAdapter dataAdapter;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recyclerview to show data
        recyclerView = findViewById(R.id.recycler_view);
        dataAdapter = new DataAdapter();
        recyclerView.setAdapter(dataAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        //button to start about activity
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick();
            }
        });

        //Json Task toget data
        new JsonTask(this).execute(JSON_URL);   //json data from URL
    }
    {    }
    @Override
    public void onPostExecute(String json) {
        //Gson need get from File-Project Structure-Dependencies- +button - search gson
        Gson gson = new Gson();
        Type type = new TypeToken<List<Data>>() {}.getType();
        List<Data> listOfData = gson.fromJson(json, type);
        dataAdapter.setData(listOfData);
        //used to make adapter to notice the data change
        dataAdapter.notifyDataSetChanged();

    }

    //start about activity
    private void onButtonClick(){
        Intent intent = new Intent(this,AboutActivity.class);
        startActivity(intent);
    }
}