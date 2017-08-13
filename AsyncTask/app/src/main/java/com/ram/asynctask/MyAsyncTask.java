package com.ram.asynctask;

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

public class MyAsyncTask extends AsyncTask<String,String,Bitmap> {
    private final Context mConex;
    private final ImageView ImageView;
    private Context mContext;
    private ImageView mImageView;
    private ProgressDialog mProgressDialoge;

    public MyAsyncTask(Context mConex) {
        this.mConex = mConex;
        this.ImageView=mImageView;
    }

    @Override
    protected Bitmap doInBackground(String... params) {
        Bitmap bitmap=null;
        try{
            Thread.sleep(1000);
            publishProgress("connecting");
            URL url=new URL(params[0]);
            URLConnection urlConnection=url.openConnection();
            urlConnection.connect();
            Thread.sleep(1000);
            publishProgress("downloaing");
            InputStream is=urlConnection.getInputStream();
            BufferedInputStream bis=new BufferedInputStream(is);
            Thread.sleep(1000);

            bitmap= BitmapFactory.decodeStream(bis);
            bis.close();
            is.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return bitmap;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mProgressDialoge.setMessage("Loading...");
        mProgressDialoge.show();
    }



    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        mProgressDialoge.setMessage(values[0]);
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        mContext.ImageBitmap(bitmap);
        super.onPostExecute(bitmap);
    }
}
