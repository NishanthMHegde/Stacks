package com.nishanth.stacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.*;
import java.util.Stack;

public class Animation extends AppCompatActivity {
 ListView lv;
 AnimStack as;
    Button push,pop;
    EditText input;
    int size;
    Stack s;
    ArrayList<Integer> list;
    ArrayAdapter<Integer> ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
         s = new Stack();
         size =0;
        as = new AnimStack();
        lv = (ListView)findViewById(R.id.lvanim);
        push = (Button)findViewById(R.id.pushBtn);
        pop = (Button)findViewById(R.id.popBtn);
        input = (EditText)findViewById(R.id.userInput);

        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(input.getText().toString())){
                    Toast.makeText(Animation.this,"Please Enter some text",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(as.getSize()==5){
                    Toast.makeText(Animation.this,"Stack Overflow",Toast.LENGTH_SHORT).show();
                }
                else {
                    as.push(Integer.parseInt(input.getText().toString()));
                     list = new ArrayList<Integer>();

                    for(int i=as.getTop();i>=0;i--){
                        list.add(as.arr[i]);
                    }

                     ad = new ArrayAdapter<Integer>(Animation.this,R.layout.custom_list_item,list);
                    lv.setAdapter(ad);
                    size++;



                }
            }
        });
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(as.getSize()==0){
                    Toast.makeText(Animation.this,"Stack Underflow",Toast.LENGTH_SHORT).show();
                }
                else {

                        as.pop();
                        list.removeAll(list);
                    for(int i=as.getTop();i>=0;i--){
                        list.add(as.arr[i]);
                    }

                    ad = new ArrayAdapter<Integer>(Animation.this,R.layout.custom_list_item,list);
                    lv.setAdapter(ad);
                }
            }
        });

    }
}
