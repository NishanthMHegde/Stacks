package com.nishanth.stacks;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Translation extends AppCompatActivity {
    Button push,pop;
    ImageView one,two,three,four,arrow;
    int top =-1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translation);
        push = (Button)findViewById(R.id.pushAnim);
        pop = (Button)findViewById(R.id.popAnim);
        one = (ImageView)findViewById(R.id.imageView);
        two = (ImageView)findViewById(R.id.imageView2);
        three = (ImageView)findViewById(R.id.imageView3);
        four = (ImageView)findViewById(R.id.imageView4);
        arrow = (ImageView)findViewById(R.id.imageView5);
        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimatorSet animSet = new AnimatorSet();
                 if(top==-1) {
                     ObjectAnimator oneX = ObjectAnimator.ofFloat(one, "translationY", 900f);
                     ObjectAnimator arrowY = ObjectAnimator.ofFloat(arrow,"translationY",-310f);




                     top++;
                     animSet.playSequentially(oneX,arrowY);
                 }
                 else if(top==0) {
                     ObjectAnimator twoY = ObjectAnimator.ofFloat(two, "translationY", 750f);

                     ObjectAnimator twoX = ObjectAnimator.ofFloat(two, "translationX", -150f);
                     top++;
                     ObjectAnimator arrowY = ObjectAnimator.ofFloat(arrow,"translationY",-450f);

                     animSet.playSequentially(twoX,twoY,arrowY);
                 }
                 else if(top==1) {
                     ObjectAnimator threeY = ObjectAnimator.ofFloat(three, "translationY", 620f);
                     ObjectAnimator threeX = ObjectAnimator.ofFloat(three, "translationX", -300f);
                     ObjectAnimator arrowY = ObjectAnimator.ofFloat(arrow,"translationY",-590f);
                     top++;

                     animSet.playSequentially(threeX,threeY,arrowY);
                 }
                 else if(top==2) {
                     ObjectAnimator fourY = ObjectAnimator.ofFloat(four, "translationY", 490f);
                     ObjectAnimator fourX = ObjectAnimator.ofFloat(four, "translationX", -450f);
                     ObjectAnimator arrowY = ObjectAnimator.ofFloat(arrow,"translationY",-730f);
                     top++;

                     animSet.playSequentially(fourX,fourY,arrowY);
                 }
                 else{
                     Toast.makeText(Translation.this," Stack Overflow",Toast.LENGTH_SHORT).show();
                 }





                animSet.start();

            }
        });
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimatorSet animSet = new AnimatorSet();
                if(top==0) {
                    ObjectAnimator oneX = ObjectAnimator.ofFloat(one, "translationY", -900f);
                    ObjectAnimator arrowY = ObjectAnimator.ofFloat(arrow,"translationY",0f);


                    top--;
                    animSet.playSequentially(oneX,arrowY);
                }
                else if(top==1) {
                    ObjectAnimator twoY = ObjectAnimator.ofFloat(two, "translationY", -780f);

                    ObjectAnimator twoX = ObjectAnimator.ofFloat(two, "translationX", 130f);
                    ObjectAnimator arrowY = ObjectAnimator.ofFloat(arrow,"translationY",-310f);
                    top--;

                    animSet.playSequentially(twoX,twoY,arrowY);
                }
                else if(top==2) {
                    ObjectAnimator threeY = ObjectAnimator.ofFloat(three, "translationY", -650f);
                    ObjectAnimator threeX = ObjectAnimator.ofFloat(three, "translationX", 260f);
                    ObjectAnimator arrowY = ObjectAnimator.ofFloat(arrow,"translationY",-450f);
                    top--;

                    animSet.playSequentially(threeX,threeY,arrowY);
                }
                else if(top==3) {
                    ObjectAnimator fourY = ObjectAnimator.ofFloat(four, "translationY", -520);
                    ObjectAnimator fourX = ObjectAnimator.ofFloat(four, "translationX", 390f);
                    ObjectAnimator arrowY = ObjectAnimator.ofFloat(arrow,"translationY",-590f);
                    top--;

                    animSet.playSequentially(fourX,fourY,arrowY);
                }
                else{
                    Toast.makeText(Translation.this," Stack Underflow",Toast.LENGTH_SHORT).show();
                }





                animSet.start();

            }
        });

    }

}
