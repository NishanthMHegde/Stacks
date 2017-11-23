package com.nishanth.stacks;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pop extends AppCompatActivity {
       Button pop;
       TextView status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);
        pop = (Button)findViewById(R.id.popItem);
        status = (TextView)findViewById(R.id.status);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status.setText("");
                int num = MainActivity.s.pop();
                if(num==Integer.MIN_VALUE){
                    status.setText("STACK IS EMPTY");
                    status.setTextColor(Color.RED);
                }
                else {
                    status.setText("Popped item is:" + num);
                    status.setTextColor(Color.GREEN);
                }

            }
        });
    }
}
