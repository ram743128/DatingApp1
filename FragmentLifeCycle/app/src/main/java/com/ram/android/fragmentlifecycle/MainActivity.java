package com.ram.android.fragmentlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static com.ram.android.fragmentlifecycle.MenuFragment.LOG_TAG;

public class MainActivity extends AppCompatActivity {
    public static String TAG="MainActivityRAM";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(LOG_TAG,"oncreate");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LOG_TAG,"onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(LOG_TAG,"onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG_TAG,"onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOG_TAG,"onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_TAG,"ondestroy");
    }
}
