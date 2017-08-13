package com.ram.fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {

    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;
    private SecondFragment mSecFrag;
    private ThirdFragment mThirdFrag;
    private BlankFragment mFirstFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentManager = getFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFirstFrag=(BlankFragment)mFragmentManager.findFragmentById(R.id.fragment);
        mSecFrag = new SecondFragment();
        mThirdFrag = new ThirdFragment();
        mFragmentTransaction.add(R.id.myframe, mSecFrag);
        mFragmentTransaction.commit();
    }

    public void change() {
        mFragmentTransaction = mFragmentManager.beginTransaction();
        if (mSecFrag.isResumed()) {
            mFragmentTransaction.replace(R.id.myframe, mThirdFrag);
        } else

        {
            mFragmentTransaction.replace(R.id.myframe, mSecFrag);
        }

        mFragmentTransaction.commit();

    }

    public void sendData(String s) {
        if (mSecFrag.isResumed()) {
            mSecFrag.showData(s);
        } else {
            mThirdFrag.showData(s);
        }
    }
    public void sendPhone(String s)
    {
        mFirstFrag.showPhone(s);
    }
}
