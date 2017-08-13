package com.ram.counter2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private  EditText mEditText;
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText=(EditText)findViewById(R.id.editText_et);
        mEditText.setText(a + "");

    }

    public void share(View view) {
        String name=mEditText.getText().toString();
       Intent shareintent=new Intent(MainActivity.this,SecondActivity.class);
        shareintent.putExtra("myname",name);
      startActivityForResult(shareintent,6);
    }

    public void increment(View view) {
        a = a+ 1;
        mEditText.setText(a + "");
    }
}
