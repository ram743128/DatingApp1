package com.ram.asynctaskc;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by ram on 7/21/2017.
 */

public class MyAsyncTask  extends AsyncTask<String,String,Bitmap>{
    private Context mContex;
    private ImageView mImageview;
    private ProgressDialog mProgressDialog;


    public MyAsyncTask(Context mContex, ImageView mImageview) {
        this.mContex = mContex;
        this.mImageview = mImageview;

        

    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mProgressDialog.setMessage("Loading...");
        mProgressDialog.show();
        }

    @Override
    protected Bitmap doInBackground(String... strings) {
        Bitmap bitmap=null;
        try {
            Thread.sleep(1000);
            publishProgress("Connecting...");
            URL url = new URL(strings[0]);
            URLConnection urlConnection=url.openConnection();
            urlConnection.connect();
            Thread.sleep(1000);
            publishProgress("downloading...");
            InputStream is=urlConnection.getInputStream();
            BufferedInputStream bis=new BufferedInputStream(is);
            Thread.sleep(1000);
            publishProgress("Convert...");
            bitmap= BitmapFactory.decodeStream(bis);


        }catch (Exception e){
            e.printStackTrace();
        }
        return bitmap;
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        mProgressDialog.setMessage(values[0]);
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        mImageview.setImageBitmap(bitmap);
        mProgressDialog.dismiss();
    }
}
