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

public class Tab4 extends Fragment{
    TextView design;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.designspecstab,container,false);
        design = (TextView)v.findViewById(R.id.designSpecsText);
        design.setText("The layout used throughout the app is Relative layout.\n\n" +
                "It allows us to organize the widgets/views relative to the positions of other views.\n\n" +
                "The ViewHolder has 'match_parent' set as its default layout width and height.\n\n" +
                "Scroll Views are used to scroll through large amounts of text.\n"+
                "The buttons have 'wrap_content' set as their default width and height.\n\n" +
                "The input fields or EditText is set to accept only Numeric values.\n\n" +
                "Warnings or Alerts are displayed as a text-based warning with a red font color.\n\n" +
                "Page navigation takes place with the help of intents, wherein the click of a button" +
                "is used to navigate to the corresponding activity.\n\n");
        return v;
    }
}
