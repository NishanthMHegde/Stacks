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

public class Tab2 extends Fragment {
    TextView pcode;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v= inflater.inflate(R.layout.pseudocodetab,container,false);
        pcode = (TextView)v.findViewById(R.id.pcode);
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

        return v;
    }
}
