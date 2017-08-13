package com.ram.jsonparsing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ram on 7/26/2017.
 */

public class MyContactsAdapter extends BaseAdapter {
    private Context mContex;
    private ArrayList<Contact> mContactList;//define array this come from post execute method
    private LayoutInflater mLayoutInflator;

    public MyContactsAdapter(Context mContex, ArrayList<Contact> mContactList) {
        this.mContex = mContex;
        this.mContactList = mContactList;
        mLayoutInflator=LayoutInflater.from(mContex);
    }

    @Override
    public int getCount() {
        return mContactList.size();
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
            convertView=mLayoutInflator.inflate(R.layout.contact_layout,parent,false);
        }
        TextView idTv = (TextView) convertView.findViewById(R.id.id_tv);
        TextView nameTv = (TextView) convertView.findViewById(R.id.name_tv);
        TextView genderTv = (TextView) convertView.findViewById((R.id.gender_tv));
        idTv.setText(mContactList.get(position).getId());//get data position from array list mContactList and setting data at that position
        nameTv.setText(mContactList.get(position).getName());
        genderTv.setText(mContactList.get(position).getGender());


        return convertView;
    }
}
