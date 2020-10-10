package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    Button CS, IS, IES, MIS, SS, GTS;
    private Intent intent_control;
    private Intent intent_if;
    private Intent intent_ifelse;
    private Intent intent_multiif;
    private Intent intent_switch;
    private Intent intent_goto;
    //CS=control statement(제어문), IS=if statement(if문), SS=switch statement(스위치문), GTS=goto문
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost1 = (TabHost) findViewById(R.id.tabHost1) ;
        tabHost1.setup() ;

        // 첫 번째 Tab. (탭 표시 텍스트:"TAB 1"), (페이지 뷰:"content1")
        TabHost.TabSpec ts1 = tabHost1.newTabSpec("Tab Spec 1") ;
        ts1.setContent(R.id.content1) ;
        ts1.setIndicator("제어문") ;
        tabHost1.addTab(ts1)  ;

        // 두 번째 Tab. (탭 표시 텍스트:"TAB 2"), (페이지 뷰:"content2")
        TabHost.TabSpec ts2 = tabHost1.newTabSpec("Tab Spec 2") ;
        ts2.setContent(R.id.content2) ;
        ts2.setIndicator("if 문") ;
        tabHost1.addTab(ts2) ;

        // 세 번째 Tab. (탭 표시 텍스트:"TAB 3"), (페이지 뷰:"content3")
        TabHost.TabSpec ts3 = tabHost1.newTabSpec("Tab Spec 3") ;
        ts3.setContent(R.id.content3) ;
        ts3.setIndicator("if-else 문") ;
        tabHost1.addTab(ts3) ;

        /*CS=findViewById(R.id.btn_6_1);
        CS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_control = new Intent(getApplicationContext(), ControlActivity.class);
                startActivity(intent_control);
            }
        });

        IS=findViewById(R.id.btn_6_2);
        IS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        IES=findViewById(R.id.btn_6_3);
        IES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        MIS=findViewById(R.id.btn_6_4);
        MIS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        SS=findViewById(R.id.btn_6_5);
        SS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        GTS=findViewById(R.id.btn_6_6);
        GTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }
}
