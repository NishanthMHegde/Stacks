package com.nishanth.stacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Operations extends AppCompatActivity {
    TextView businessLogic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operations);
        businessLogic = (TextView)findViewById(R.id.business);
               businessLogic.setText("The concept behind the app is to demonstrate the use of Stacks.\n" +
                "We create a Stack class which has 2 variables, namely Top and maxSize \n" +
                "Top is initialized to -1 and maxSize to 5.\n We define 3 operations, namely: Push,Pop and display.\n\n" +
                "Push method is used to add the input number to top of stack and increment the top variable.\n\n" +
                "Pop method is used to remove the topmost element and decrement the value of top.\n\n" +
                "When the stack reaches it's maximum size, we dynamically increase the size of the stack.\nSo in practice, the stack is infinite." +
                "Display method displays the stack in order. If no elements are present, it displays a text-based" +
                "warning.\n\n");


    }
}
