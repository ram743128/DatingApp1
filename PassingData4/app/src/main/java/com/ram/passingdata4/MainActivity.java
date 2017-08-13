package com.ram.passingdata4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText mNameEt;
    private EditText mCompanyEt;
    private EditText mCityEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameEt=(EditText)findViewById(R.id.name_et);
        mCompanyEt=(EditText)findViewById(R.id.company_et);
        mCityEt=(EditText)findViewById(R.id.city_et);
    }

    public void goNext(View view) {
        String name=mNameEt.getText().toString();
        String company=mCompanyEt.getText().toString();
        String city=mCityEt.getText().toString();
        Intent intent=new Intent(MainActivity.this,MainActivity.class);
        intent.putExtra("myname",name);
        intent.putExtra("mycompany",company);
        intent.putExtra("mycity",city);
        startActivity(intent);
    }
}
