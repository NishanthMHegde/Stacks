package com.nishanth.stacks;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Display extends AppCompatActivity {
    ArrayList<Integer> numbers;
    ListView list;
    ArrayAdapter adapter;
    TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        list = (ListView)findViewById(R.id.listNumbers);
        status = (TextView)findViewById(R.id.status);
        numbers = new ArrayList<Integer>();
        if(MainActivity.s.getSize()!=0) {
            for (int i = MainActivity.s.getTop(); i >= 0; i--) {
                numbers.add(Stack.arr[i]);


            }
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, numbers);
            list.setAdapter(adapter);
        }
        else {
              status.setText("STACK IS EMPTY");
            status.setTextColor(Color.RED);
        }
    }
}
