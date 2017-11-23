package com.nishanth.stacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DesignSpecs extends AppCompatActivity {
    TextView designTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_specs);
        designTxt = (TextView)findViewById(R.id.designSpecsText);
        designTxt.setText("The layout used throughout the app is Relative layout.\n\n" +
                "It allows us to organize the widgets/views relative to the positions of other views.\n\n" +
                "The ViewHolder has 'match_parent' set as its default layout width and height.\n\n" +
                "Scroll Views are used to scroll through large amounts of text.\n"+
                "The buttons have 'wrap_content' set as their default width and height.\n\n" +
                "The input fields or EditText is set to accept only Numeric values.\n\n" +
                "Warnings or Alerts are displayed as a text-based warning with a red font color.\n\n" +
                "Page navigation takes place with the help of intents, wherein the click of a button" +
                "is used to navigate to the corresponding activity.\n\n");
    }
}
