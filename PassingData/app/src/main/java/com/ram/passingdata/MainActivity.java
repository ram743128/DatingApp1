package com.ram.passingdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText mNameEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameEt=(EditText)findViewById(R.id.name_et);
    }

    public void goNext(View view) {
        String name=mNameEt.getText().toString();
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("myname",name);
        startActivity(intent);

    }
}
