package com.ram.listviewandadapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ram on 7/20/2017.
 */

public class Myadapter extends BaseAdapter {
    private Context mContex;
    private ArrayList<String> mCityList;
    private LayoutInflater mLayoutInflater;
    private static final String TAG = "Myadapter";

    public Myadapter(Context mContex, ArrayList<String> mCityList) {
        this.mContex = mContex;
        this.mCityList = mCityList;
        this.mLayoutInflater=LayoutInflater.from(mContex);
    }

    @Override
    public int getCount() {
        return mCityList.size();
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
        if(convertView==null){
            //create the view that will appear in your list(or other view that takes an adapter)
            convertView=mLayoutInflater.inflate(R.layout.item_layout,parent,false);
        }
        TextView cityTV= (TextView) convertView.findViewById(R.id.city_tv);
        cityTV.setText(mCityList.get(position));
        Log.i(TAG, "getView: position"+position);
        return convertView;
    }
}
