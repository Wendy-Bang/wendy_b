package com.gam4.sampleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.Toast;

public class TabhostActivity extends AppCompatActivity {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabhost);

        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();


        TabHost.TabSpec spec1 = tabHost.newTabSpec("Tab1").setContent(R.id.linearLayout).setIndicator("첫번째");
        tabHost.addTab(spec1);

        TabHost.TabSpec spec2 = tabHost.newTabSpec("Tab2").setContent(R.id.linearLayout2).setIndicator("두번째");
        tabHost.addTab(spec2);

        TabHost.TabSpec spec3 = tabHost.newTabSpec("Tab3").setContent(R.id.linearLayout3).setIndicator("세번째");
        tabHost.addTab(spec3);

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                 if(tabId.equals("Tab1")){
                     Toast toast = Toast.makeText(getApplicationContext(), "1번째 액티비티", Toast.LENGTH_SHORT);
                     toast.show();
                 }else if(tabId.equals("Tab2")){
                     Toast toast = Toast.makeText(getApplicationContext(), "2번째 액티비티", Toast.LENGTH_SHORT);
                     toast.show();
                 }if(tabId.equals("Tab3")){
                    Toast toast = Toast.makeText(getApplicationContext(), "3번째 액티비티", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }
}
