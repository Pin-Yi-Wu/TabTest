package com.example.mina.tabtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec spec = tabHost.newTabSpec("tab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator(getString(R.string.tab_1_title));
        tabHost.addTab(spec);

        spec=tabHost.newTabSpec("tab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator(getString(R.string.tab_2_title));
        tabHost.addTab(spec);

        spec= tabHost.newTabSpec("tab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator(getString(R.string.tab_3_title));
        tabHost.addTab(spec);

        tabHost.setCurrentTab(0);

        TabWidget tabWidget = (TabWidget)tabHost.findViewById(android.R.id.tabs);

        View tabview =tabWidget.getChildTabViewAt(0);
        TextView tab = (TextView)tabview.findViewById(android.R.id.title);
        tab.setTextSize(20);

        tabview = tabWidget.getChildTabViewAt(1);
        tab = (TextView)tabview.findViewById(android.R.id.title);
        tab.setTextSize(20);

        tabview = tabWidget.getChildTabViewAt(2);
        tab=(TextView)tabview.findViewById(android.R.id.title);
        tab.setTextSize(20);



    }
}
