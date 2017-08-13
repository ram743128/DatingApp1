package com.ram.uicases;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText mNameEt;
    private TextView mHelloTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameEt=(EditText)findViewById(R.id.name_et);
        mHelloTv=(TextView)findViewById(R.id.hello_tv);
    }

    public void sayHello(View view) {
        String result="Hello, "+mNameEt.getText().toString();
        mHelloTv.setText(result);
    }
}
