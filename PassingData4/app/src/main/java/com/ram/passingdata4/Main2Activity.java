package com.ram.passingdata4;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends Activity {
    private TextView mNameTv;
    private TextView mCompanyTv;
    private TextView mCityTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mNameTv=(TextView)findViewById(R.id.name_tv);
        mCompanyTv=(TextView)findViewById(R.id.company_et);
        mCityTv=(TextView)findViewById(R.id.city_et);
        Intent intent =getIntent();
        String name=intent.getStringExtra("myname");
        mNameTv.setText(name);
        String company=intent.getStringExtra("mycompany");
        mNameTv.setText(company);
        String city=intent.getStringExtra("mycity");
        mNameTv.setText(city);

    }
}
