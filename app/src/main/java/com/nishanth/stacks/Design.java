package com.nishanth.stacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Design extends AppCompatActivity {
 Button btnDS,btnBL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
        btnDS = (Button)findViewById(R.id.btnDS);
        btnBL = (Button)findViewById(R.id.btnBL);
        btnDS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Design.this,DesignSpecs.class);
                startActivity(i);
            }
        });
        btnBL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Design.this,BusinessLogic.class);
                startActivity(i);
            }
        });
    }
}
