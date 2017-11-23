package com.nishanth.stacks;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Nishanth on 17-11-2017.
 */

public class Tab1 extends Fragment {
    TextView intro;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.introtab,container,false);
        intro =(TextView)v.findViewById(R.id.stackintro);
        intro.setText("Stack is a Last in First Out data stucture.\n" +
                "Stack is usually used in recursive operations.\n" +
                "Can be implemented using an array as well a Linked List.\n" +
                "Pop: Used to remove an item from the top of the Stack.\n" +
                "Push: Used to add an element to the top of the stack\n" +
                "Peak: Used to read the topmost item in the stack");

        return v;
    }
}
