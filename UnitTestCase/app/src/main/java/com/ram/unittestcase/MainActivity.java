package com.ram.unittestcase;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText mFirstNumberEt;
    private EditText mSecondNumberEt;
    private TextView mResultTv;
    private Calculator mCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirstNumberEt=(EditText)findViewById(R.id.firstnumber_et);
        mSecondNumberEt=(EditText)findViewById(R.id.secontnumber_et);
        mResultTv=(TextView)findViewById(R.id.result_tv);
        mCalc=new Calculator();
    }

    public void addNumbers(View view) {
        int a=Integer.parseInt(mFirstNumberEt.getText().toString());
        int b=Integer.parseInt(mSecondNumberEt.getText().toString());
        int result=mCalc.addNumbers(a,b);
        mResultTv.setText(String.valueOf(result));
    }

    public void subtractNumber(View view) {
        int a=Integer.parseInt(mFirstNumberEt.getText().toString());
        int b=Integer.parseInt(mSecondNumberEt.getText().toString());
        int result=mCalc.subtractNumber(a,b);
        mResultTv.setText(String.valueOf(result));

    }

    public void multiplyNumber(View view) {
        int a=Integer.parseInt(mFirstNumberEt.getText().toString());
        int b=Integer.parseInt(mSecondNumberEt.getText().toString());
        int result=mCalc.multplyNumber(a,b);
        mResultTv.setText(String.valueOf(result));
    }

    public void divideNumber(View view) {
        int a=Integer.parseInt(mFirstNumberEt.getText().toString());
        int b=Integer.parseInt(mSecondNumberEt.getText().toString());
        int result=mCalc.divideNumber(a,b);
        mResultTv.setText(String.valueOf(result));
    }
}
