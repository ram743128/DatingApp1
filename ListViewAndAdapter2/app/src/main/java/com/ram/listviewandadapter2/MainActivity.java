package com.ram.listviewandadapter2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ListView mListView;
    private ArrayList<String> mCityList;
    private ArrayList<String> mStateList;
    private Myadapter mMyAdapter;
    public Myadapter mMyAdapter2;
    private ListView mListView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView=(ListView)findViewById(R.id.Listview);
        mListView2=(ListView)findViewById(R.id.Listview);
        mCityList=new ArrayList<String>();
        mStateList=new ArrayList<String>();
        mCityList.add("Bangalore");
        mCityList.add("Kolkata");
        mCityList.add("Delhi");
        mCityList.add("Mumbai");
        mCityList.add("Chennai");
        mCityList.add("Bangalore");
        mCityList.add("Kolkata");
        mCityList.add("Delhi");
        mCityList.add("Mumbai");
        mCityList.add("Chennai");
        mStateList.add("karnataka");
        mStateList.add("west bengal");
        mStateList.add("delhi");
        mStateList.add("Maharastera");
        mStateList.add("Tamil Nadu");
        mMyAdapter=new Myadapter(MainActivity.this,mCityList);
        mMyAdapter=new Myadapter(MainActivity.this,mStateList);
        mListView.setAdapter(mMyAdapter);
        mListView2.setAdapter(mMyAdapter2);
    }
}
