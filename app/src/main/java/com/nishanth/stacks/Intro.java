package com.nishanth.stacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Intro extends AppCompatActivity {
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        tv = (TextView)findViewById(R.id.stackintro);
        tv.setText("Stack is a Last in First Out data stucture.\n" +
                "Stack is usually used in recursive operations.\n" +
                "Can be implemented using an array as well a Linked List.\n" +
                "Pop: Used to remove an item from the top of the Stack.\n" +
                "Push: Used to add an element to the top of the stack\n" +
                "Peak: Used to read the topmost item in the stack");
    }
}
