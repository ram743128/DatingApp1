package com.ram.practise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView l;
    String s[]={"rohit","ram","ritesh"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(ListView)findViewById(R.id.list);
        ArrayAdapter<String> a=new getArrayAddapter
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu_main,main);
        return true ;
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        

        return super.onContextItemSelected(item);
    }
}
}
