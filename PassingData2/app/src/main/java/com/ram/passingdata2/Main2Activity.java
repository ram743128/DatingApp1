package com.ram.passingdata2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.R.attr.phoneNumber;

public class Main2Activity extends Activity {

    private TextView mNameTv;
    private TextView mPhoneNumber;
    private TextView mAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mNameTv=(TextView)findViewById(R.id.textView2);
        mPhoneNumber=(TextView)findViewById(R.id.textView4);
        mAddress=(TextView)findViewById(R.id.textView5);
        Intent intent=getIntent();
        String name=intent.getStringExtra("myname");
        mNameTv.setText(name);
        String PhoneNumber=intent.getStringExtra("myphone");
        mPhoneNumber.setText(PhoneNumber);
        String Address=intent.getStringExtra("myaddress");
        mAddress.setText(Address);




    }
}
