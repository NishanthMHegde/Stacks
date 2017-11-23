package com.nishanth.stacks;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nishanth on 17-11-2017.
 */

public class Tab5 extends Fragment {
    TextView test;
    ImageView table;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.testingtab,container,false);
        test = (TextView)v.findViewById(R.id.testscenarios);
        table = (ImageView)v.findViewById(R.id.imageView6);
        test.setText(" Test Sceanrios:\n" +
                "\n" +
                "TS01: User does not enter a number but presses Push button.\n" +
                "TS02: User enters a character which is not a number.\n" +
                "TS03: Number of items exceed the stack maximum size\n" +
                "TS04: Stack Underflow\n" +
                "TS05: User navigates away from display\n" +
                "\n" +
                "Requirements Traceability matrix:");


        return v;
    }
}
