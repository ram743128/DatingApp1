package com.ram.intentpractice001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;
    private Button mButton;
    private static final String TAG = "MainActivity Ram";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText=(EditText)findViewById(R.id.name_et);
        mButton=(Button)findViewById(R.id.GoNext_btn);
        Log.i(TAG, "onCreate: ");
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=mEditText.getText().toString();
                Intent i=new Intent(getApplicationContext(),AnotherActivity.class);
                i.putExtra("myname",name);
                startActivity(i);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }
}
