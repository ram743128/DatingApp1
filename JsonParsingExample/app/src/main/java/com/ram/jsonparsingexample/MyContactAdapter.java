package com.ram.jsonparsingexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ram on 7/27/2017.
 */
//base adapter for small data we take
public class MyContactAdapter extends BaseAdapter {
    private Context mContex;
    private ArrayList<Contact> mContactList;
    private LayoutInflater mLayoutInflator;

    public MyContactAdapter(Context mContex, ArrayList<Contact> mContactList) {
        this.mContex = mContex;
        this.mContactList = mContactList;
        mLayoutInflator=LayoutInflater.from(mContex);

    }

    @Override
    public int getCount() {          //getCount is method of adapter,How many items are in the data set represented by this Adapter.
        return mContactList.size();
    }

    @Override
    public Object getItem(int position) {//Get the data item associated with the specified position in the data set.
        return null;
    }

    @Override
    public long getItemId(int position) {//Get the row id associated with the specified position in the list
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {//Get a View that displays the data at the specified position in the data set.
    if(convertView==null){
        convertView=mLayoutInflator.inflate(R.layout.contact_layout,parent,false);//press alt+Enter on .contact_layout and create a layout resource file contact_layout.xml.
        TextView idTv=(TextView)convertView.findViewById(R.id.id_tv);
        TextView nameTv=(TextView)convertView.findViewById(R.id.name_tv);
        TextView  genderTv=(TextView)convertView.findViewById(R.id.gender_tv);
        idTv.setText(mContactList.get(position).getId());
        nameTv.setText(mContactList.get(position).getId());
        genderTv.setText(mContactList.get(position).getGender());
    }

        return convertView;
    }
}
