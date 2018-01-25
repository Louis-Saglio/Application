package com.example.louis.application;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by louis on 25/01/18.
 */

public class Adapter extends ArrayAdapter<Todo> {

    private int resource;
    private List<Todo> todos;

    public Adapter(@NonNull Context context, int resource, @NonNull List<Todo> objects) {
        super(context, resource, objects);
        this.todos = objects;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Todo todo = todos.get(position);

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) super.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(this.resource, null);
        }

        TextView title = convertView.findViewById(R.id.Name);
        TextView desc = convertView.findViewById(R.id.desc);
        TextView priority = convertView.findViewById(R.id.priority);

        title.setText(todo.getName());
        desc.setText(todo.getDesc());
        priority.setText(todo.getPriority());

        return convertView;
    }
}
