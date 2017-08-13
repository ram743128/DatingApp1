package com.ram.sendbroadcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendAction(View view) {
        Intent intent=new Intent("my.own.ACTION");
        intent.putExtra("mytitle","Hello");
        intent.putExtra("myContent","welcome");
        sendBroadcast(intent);
    }
}
