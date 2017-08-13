package com.ram.activitystate;

import android.app.Activity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText mNameEt;
    private TextView mResultTv;
    private String result;
    private static final String TAG = "MainActivity Ram";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameEt = (EditText) findViewById(R.id.editText2);
        mResultTv = (TextView) findViewById(R.id.textView);
        Log.i(TAG, "onCreate: ");
       /* if (savedInstanceState != null) {
            result = savedInstanceState.getString("myvalue");
            mResultTv.setText(result);
        }*/
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        result=savedInstanceState.getString("myvalue");
        mResultTv.setText(result);
        Log.i(TAG, "onRestoreInstanceState: ");

    }

    @Override
    protected void onStart() {
        Log.i(TAG, "onStart: ");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "onResume: ");
        super.onResume();
    }
    
    public void setData(View view) {
        result=  "Hi "+mNameEt.getText().toString();
        mResultTv.setText(result);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("myvalue",result);
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState: ");
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onPause: ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy: ");
        super.onDestroy();
    }
}
