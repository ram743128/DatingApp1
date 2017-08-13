package com.ram.fragments;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Fragment f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hii(View v) {

       if (v.getId()==R.id.homee)
        {
           f = new home();
        }

        else if(v.getId()==R.id.about)
        {
            f=new About();
        }

        else if(v.getId()==R.id.contacts)
        {
            f=new contacts();
        }
        FragmentManager fr=getSupportFragmentManager();
        FragmentTransaction ft=fr.beginTransaction();
        ft.replace(R.id.fragment2,f);
        ft.commit();

    }
}
