package com.ram.asynctaskhw;

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
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ram on 7/25/2017.
 */

class MyAsynTask extends AsyncTask<String,String,ArrayList<Bitmap>> {
    Context mcontex;
    ImageView mimageview1, mimageview2, mimageview3;
    ArrayList<Bitmap> bitmaps;
    ProgressDialog mprogressDialog;

    public MyAsynTask(Context mcontex, ImageView mimageview1, ImageView mimageview2, ImageView mimageview3) {
        this.mcontex = mcontex;
        this.mimageview1 = mimageview1;
        this.mimageview2 = mimageview2;
        this.mimageview3 = mimageview3;
        mprogressDialog=new ProgressDialog(mcontex);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mprogressDialog.setMessage("Loading...");
        mprogressDialog.show();
    }

    @Override
    protected ArrayList<Bitmap> doInBackground(String... string) {
       bitmaps  = new ArrayList<Bitmap>();
        for(String s:string){
            Bitmap bm=null;

            try {
                Thread.sleep(1000);
                publishProgress("conecting.....");
                URL url = new URL(s);
                URLConnection urlConnection = url.openConnection();
                urlConnection.connect();
                Thread.sleep(1000);
                publishProgress("Dowloading.....");
                InputStream is = urlConnection.getInputStream();
                BufferedInputStream bis = new BufferedInputStream(is);
                Thread.sleep(1000);
                publishProgress("Converting.....");
                 bm = BitmapFactory.decodeStream(bis);
                bis.close();
                is.close();
                bitmaps.add(bm);


            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return bitmaps;
    }


    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        mprogressDialog.setMessage(values[0]);
    }

    @Override
    protected void onPostExecute(ArrayList<Bitmap> bitmaps) {
        super.onPostExecute(bitmaps);
        mimageview1.setImageBitmap(bitmaps.get(0));
        mimageview2.setImageBitmap(bitmaps.get(1));
        mimageview3.setImageBitmap(bitmaps.get(2));
    }
}


