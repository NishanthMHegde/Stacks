package com.nishanth.stacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Push extends AppCompatActivity {
 Button add;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push);
        add= (Button)findViewById(R.id.btnAdd);
        input = (EditText)findViewById(R.id.input);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(input.getText().toString())) {
                    Toast.makeText(Push.this, " Please enter a number", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    int num = Integer.parseInt(input.getText().toString());
                    MainActivity.s.push(num);
                    Toast.makeText(Push.this, " Pushed :" + num, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
