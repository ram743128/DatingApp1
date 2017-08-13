package com.ram.listviewandadapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ListView mListView;
    private ArrayList<String> mCityList;
    private Myadapter mMyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView=(ListView)findViewById(R.id.Listview);
        //create a list view Array with the hep of new
        mCityList=new ArrayList<String>();
        mCityList.add("Bangalore");
        mCityList.add("chennai");
        mCityList.add("mumbai");
        mCityList.add("delhi");
        mCityList.add("kolkata");
        mCityList.add("Bangalore");
        mCityList.add("chennai");
        mCityList.add("mumbai");
        mCityList.add("delhi");
        mCityList.add("kolkata");
        mCityList.add("Bangalore");
        mCityList.add("chennai");
        mCityList.add("mumbai");
        mCityList.add("delhi");
        mCityList.add("kolkata");
        mMyAdapter=new Myadapter(MainActivity.this,mCityList);//combining dataset and adapter
        mListView.setAdapter(mMyAdapter);//combining adapter and view
    }
}
