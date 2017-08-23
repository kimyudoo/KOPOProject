package com.example.ydkim.testkopoporject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by 501ST01 on 2017-08-23.
 */

public class kimjihyunActivity extends MainActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kimjihyun);

        //버튼 클릭시 kimjihyun
        Button button = (Button)findViewById(R.id.jihyun_button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "이전 액티비티로 돌아갑니다.", Toast.LENGTH_LONG).show();

                finish();
            }
        });
    }
}
