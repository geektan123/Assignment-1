package com.example.assignment_1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

     private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listView);

        // Create a list of text items
        List<String> textItems = new ArrayList<>();
        textItems.add("Item 1");
        textItems.add("Item 2");
        textItems.add("Item 3");
        textItems.add("Item 4");
        textItems.add("Item 5");

        // Create an ArrayAdapter to display the list items
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, textItems);

        // Set the adapter to the ListView
        listView.setAdapter(adapter);
    }
    }
