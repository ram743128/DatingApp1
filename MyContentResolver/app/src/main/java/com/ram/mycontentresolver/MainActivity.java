package com.ram.mycontentresolver;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getContact(View view) {
        ContentResolver contentResolver=getContentResolver();
        //Uri uri= ContactsContract.Contacts.CONTENT_URI;//path
        Uri uri=Uri.parse("content://com.ram.mycontantprovider");
        Cursor c=contentResolver.query(uri,null,null,null,null);//query
        while (c.moveToNext()){
            Toast.makeText(this,c.getString(1), Toast.LENGTH_SHORT).show();
        }
    }
}
