package com.example.ydkim.testkopoporject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by JK on 2017-08-23.
 */


public class GwangWon_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gwangwon);

        Button GBACKbtn = (Button) findViewById(R.id.GBACKbtn);
        GBACKbtn.setOnClickListener(new View.OnClickListener() {
            public void  onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), dooooooo_Activity.class);
                startActivity(intent);
            }
        });

        Button GNEXTbtn = (Button) findViewById(R.id.GNEXTbtn);
        GNEXTbtn.setOnClickListener(new View.OnClickListener() {
            public void  onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), junwooActivity.class);
                startActivity(intent);
            }
        });
    }
}
