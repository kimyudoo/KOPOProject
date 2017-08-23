package com.example.ydkim.testkopoporject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Created by admin on 2017-08-23.
 */

public class dooooooo_Activity {

    public class MainActivity extends AppCompatActivity {

        Animation flowAnim;
        TextView dooooooo_txt;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //setContentView(R.layout.activity_main);
            setContentView(R.layout.dooooooo);

            dooooooo_txt = (TextView) findViewById(R.id.dooooooo_txt);
            dooooooo_txt.setText("양두원입니다.");
            flowAnim = AnimationUtils.loadAnimation(this, R.anim.flow);

            dooooooo_txt.startAnimation(flowAnim);
        }
    }

}
