package com.ram.love_meter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
TextView s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        s=(TextView)findViewById(R.id.text);
        String a=getIntent().getStringExtra("RESULT:");
        s.setText("RESULT:"+a);
    }
}
