package com.ram.fragmenteg;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;


public class MainActivity extends Activity {

    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;
    private FirstFragment mFirstFrag;
    private SecondFragment mSecFrag;
    private ThirdFragment mThirdFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentManager=getFragmentManager();
        mFragmentTransaction=mFragmentManager.beginTransaction();
        mFirstFrag=(FirstFragment) mFragmentManager.findFragmentById(R.id.fragment);
        mSecFrag=new SecondFragment();
        mThirdFrag=new ThirdFragment();
        mFragmentTransaction.add(R.id.myframe,mSecFrag);
        mFragmentTransaction.commit();

    }
    public void change(int c)
    {
        mFragmentTransaction=mFragmentManager.beginTransaction();
        Bundle bundle=new Bundle();
        bundle.putString("data",String.valueOf(c));
        if(mSecFrag.isResumed()){
            mThirdFrag.setArguments(bundle);
            mFragmentTransaction.replace(R.id.myframe,mThirdFrag);
        }else
        {  mSecFrag.setArguments(bundle);
            mFragmentTransaction.replace(R.id.myframe,mSecFrag);
        }
        mFragmentTransaction.commit();

    }
    public void sendData(String s)
    {
        if(mSecFrag.isResumed()){
            mSecFrag.showData(s);
        }else {
            mThirdFrag.showData(s);
        }

    }
    public void setdatafirstfrag(String s)
    {
       // mFirstFrag.setdata(s);
    }
}
