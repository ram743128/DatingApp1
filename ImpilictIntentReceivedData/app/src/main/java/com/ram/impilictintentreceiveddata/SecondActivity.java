package com.ram.impilictintentreceiveddata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {
    private TextView mDispalyTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mDispalyTv=(TextView)findViewById(R.id.display_tv);
        Intent intent=getIntent();
        String msg=intent.getStringExtra(Intent.EXTRA_TEXT);
        mDispalyTv.setText(msg);
    }

    public void sendData(View view) {
        Intent intent=new Intent();
        intent.putExtra("myemail","ram20yadav@gmail.com");
        setResult(RESULT_OK,intent);
        finish();
    }
}
