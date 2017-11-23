package com.nishanth.stacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static Stack s;
    Button push,pop,display,btnDesc,animateBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = new Stack();
        animateBtn = (Button)findViewById(R.id.btnAnimate);
        push = (Button)findViewById(R.id.push);
        pop = (Button)findViewById(R.id.pop);
        display = (Button)findViewById(R.id.display);
        btnDesc = (Button)findViewById(R.id.btnContent);
        animateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Translation.class);
                startActivity(i);
            }
        });
        btnDesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ContentTabs.class);
                startActivity(i);
            }
        });
        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Push.class);
                startActivity(i);

            }
        });

        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Pop.class);
                startActivity(i);

            }
        });

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Display.class);
                startActivity(i);

            }
        });



    }
}
