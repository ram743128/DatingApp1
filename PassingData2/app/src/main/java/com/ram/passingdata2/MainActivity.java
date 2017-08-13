package com.ram.passingdata2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {


    private EditText mNameEt;
    private EditText mPhoneNumberEt;
    private EditText mAddressEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameEt=(EditText)findViewById(R.id.name_et);
        mPhoneNumberEt=(EditText)findViewById(R.id.phone_et);
        mAddressEt=(EditText)findViewById(R.id.address_et);
    }
    public void GoNext(View view){
        String name=mNameEt.getText().toString();
        String phoneNumber=mPhoneNumberEt.getText().toString();
        String Address=mAddressEt.getText().toString();
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("myname",name);
        intent.putExtra("myphone",phoneNumber);
        intent.putExtra("myaddress",Address);
        startActivity(intent);

    }
}
