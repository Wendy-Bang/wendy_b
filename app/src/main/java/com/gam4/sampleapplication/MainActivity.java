package com.gam4.sampleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tabhost 샘플 이벤트
        Button tabSampleButton = (Button) findViewById(R.id.tabSampleButton);
        tabSampleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TabhostActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //tabaction 샘플 이벤트
        Button tabActionButton = (Button) findViewById(R.id.tabAcyionButton);
        tabActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TabActionActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }
}
