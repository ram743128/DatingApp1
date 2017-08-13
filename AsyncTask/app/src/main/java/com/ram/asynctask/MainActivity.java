package com.ram.asynctask;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView mDowanloadTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDowanloadTv=(ImageView)findViewById(R.id.download_iv);
    }


    public void download(View view) {
        MyAsyncTask myAsyncTask=new MyAsyncTask(MainActivity.this,mDowanloadTv);
        myAsyncTask.execute("https://image.shutterstock.com/z/stock-photo-beautiful-bengal-tiger-queen-tiger-613180241.jpg")
    }
}
