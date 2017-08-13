package com.ram.fragments;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {

    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;
    private Secondfragment mSecFrag;
    private Thirdfragmet mThirdFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentManager=getFragmentManager();
        mFragmentTransaction=mFragmentManager.beginTransaction();
        //create object of pragment progamatically
        mSecFrag=new Secondfragment();
        mThirdFrag=new Thirdfragmet();
        mFragmentTransaction.add(R.id.myframe,mSecFrag);
        mFragmentTransaction.commit();
    }

    public void change() {
    }
}
