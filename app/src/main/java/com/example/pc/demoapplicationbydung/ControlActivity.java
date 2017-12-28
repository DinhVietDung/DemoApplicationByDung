package com.example.pc.demoapplicationbydung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ControlActivity extends AppCompatActivity {

    ListView lvContact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        lvContact= findViewById(R.id.contact_lv);

    }
}
