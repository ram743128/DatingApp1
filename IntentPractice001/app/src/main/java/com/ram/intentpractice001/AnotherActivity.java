package com.ram.intentpractice001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends Activity {

    private TextView aName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        aName=(TextView)findViewById(R.id.name_tv);
        Intent i=getIntent();
       String name= i.getStringExtra("myname");
        aName.setText(name);
    }
}
