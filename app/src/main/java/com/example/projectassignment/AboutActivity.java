package com.example.projectassignment;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // new activity need to add to AndroidManifest.xml
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

    }
}
