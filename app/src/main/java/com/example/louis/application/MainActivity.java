package com.example.louis.application;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.list_todo);

        ArrayList<Todo> todos = new ArrayList<>();
        Adapter adapter = new Adapter(this, R.layout.item_todo, todos);

        ListView listView = findViewById(R.id.list_item);
        listView.setAdapter(adapter);

        todos.add(new Todo("Courses", "Acheter pain vin et fromage", "haute"));
    }
}
