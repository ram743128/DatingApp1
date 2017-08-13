package com.ram.counter2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {
    private TextView sEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        sEditText=(EditText)findViewById(R.id.editText2);
        Intent intent=getIntent();
        String name=intent.getStringExtra("myname");
        sEditText.setText(name);

    }

    public void sendback(View view) {

    }
}
