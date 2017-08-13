package com.ram.asynctaskhw;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView mDownloadIv1;
    private ImageView mDownloadIv2;
    private ImageView mDownloadIv3;
    String[] s={"http://www.frostyappleorchard.com/uploads/2/1/0/2/21024428/3217245.jpg?149","https://www.polyvore.com/cgi/img-thing?.out=jpg&size=l&tid=177533934","https://s-media-cache-ak0.pinimg.com/originals/7f/f9/99/7ff999e7b5f1ad5f601813af47a1b8ee.jpg" +
            ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDownloadIv1=(ImageView)findViewById(R.id.dowload_Iv1);
        mDownloadIv2=(ImageView)findViewById(R.id.download_Iv2);
        mDownloadIv3=(ImageView)findViewById(R.id.download_Iv3);

    }

    public void download(View view) {
        MyAsynTask myAsynTask=new MyAsynTask(MainActivity.this,mDownloadIv1,mDownloadIv2,mDownloadIv3);
        myAsynTask.execute(s);

    }
}
