package com.ram.passingdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    private TextView mNameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mNameTv=(TextView)findViewById(R.id.name_tv);
        Intent intent =getIntent();
        String name=intent.getStringExtra("myname");
        mNameTv.setText(name);
    }
}
