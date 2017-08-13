package com.ram.jsonparsingexample;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

/**
 * Created by ram on 7/27/2017.
 */

public class MyContactAsync extends AsyncTask<String,String,String> {
    private Context mContext;
    private ProgressDialog mPrograssDialog;
    private ListView mListView;
    private MyContactAdapter mMyContactAdapter;

    public MyContactAsync(Context mContext, ListView mListView) {
        this.mContext = mContext;
        this.mListView = mListView;
        mPrograssDialog=new ProgressDialog(mContext);
    }
}
