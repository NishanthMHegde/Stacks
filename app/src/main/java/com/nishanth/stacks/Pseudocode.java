package com.nishanth.stacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Pseudocode extends AppCompatActivity {
       TextView pcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pseudocode);
        pcode = (TextView)findViewById(R.id.pcode);
        pcode.setText("void push(int n){\n" +
                "        if(top == maxSize-1){\n" +
                "            resize();\n" +
                "\n" +
                "        }\n" +
                "        {\n" +
                "            top = top + 1;\n" +
                "            arr[top]=n;\n" +
                "            size++;\n" +
                "        }\n" +
                "\n" +
                "    }\n" +
                "    int peek(){\n" +
                "        if(top==-1){\n" +
                "            return Integer.MIN_VALUE;\n" +
                "\n" +
                "        }\n" +
                "        return arr[top];\n" +
                "    }\n" +
                "    int pop(){\n" +
                "        if(top==-1){\n" +
                "            return Integer.MIN_VALUE;\n" +
                "\n" +
                "        }\n" +
                "        size--;\n" +
                "        return arr[top--];\n" +
                "    }");
    }
}
