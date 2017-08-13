package com.ram.asynctaskc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView mDownloadIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDownloadIv=(ImageView)findViewById(R.id.download_iv);
    }

    public void download(View view) {
        MyAsyncTask myAsyncTask=new MyAsyncTask(MainActivity.this,mDownloadIv);
        myAsyncTask.execute("http://www.indiatourspackages.in/images/india-tour/tiger.jpg");
    }
}
