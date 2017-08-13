package com.ram.listviewandadapter2;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ram.listviewandadapter2.R;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class Myadapter2 extends BaseAdapter {

    private Context mContex;
    private ArrayList<String> mStateList;
    private LayoutInflater mLayoutInflater;

    public Myadapter2(Context mContex , ArrayList<String> mStateList) {
        this.mContex = mContex;
        this.mStateList = mStateList;
        this.mLayoutInflater=LayoutInflater.from(mContex);
    }

    @Override
    public int getCount() {
        return mStateList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            convertView = mLayoutInflater.inflate(R.layout.item_layout2, parent, false);
        }
        TextView cTextview=(TextView)convertView.findViewById(R.id.textView2);
        cTextview.setText(mStateList.get(position));
        Log.i(TAG, "getView:position "+position);


        return convertView;
    }
}
