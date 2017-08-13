package com.ram.contentmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Contentmenu extends AppCompatActivity {
    ListView l;
    String b[]={"ram","diksha","rohit","mahesh"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contentmenu);
        l=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String> a=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,b);
        l.setAdapter(a);
        registerForContextMenu(l);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) p


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getTitle()=="call")
        {
        Toast.makeText(this,"call",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Block")
        {
                Toast.makeText(this,"Block",Toast.LENGTH_LONG).show();
        }
        else {
            return false;
        }
        return true;
    }
}
