package com.ram.sqlitedatabase;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText mNameEt;
    private EditText mPhoneEt;
    private MyHelper mMyHelper;
    private SQLiteDatabase mdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameEt=(EditText)findViewById(R.id.name_et);
        mPhoneEt=(EditText)findViewById(R.id.phone_et);
        mMyHelper=new MyHelper(MainActivity.this, "STUDDB",null,1);
        mdb=mMyHelper.getWritableDatabase();
    }

    public void insertdata(View view) {
        ContentValues cv=new ContentValues();
        cv.put("name",mNameEt.getText().toString());
        cv.put("phone",mPhoneEt.getText().toString());
        long id=mdb.insert("Student",null,cv);
        Toast.makeText(this,String.valueOf(id) ,Toast.LENGTH_SHORT).show();
    }

    public void readdata(View view) {
        Cursor c=mdb.query("Student",null,null,null,null,null,null);
        while (c.moveToNext())
        {
            Toast.makeText(this, c.getString(1), Toast.LENGTH_SHORT).show();
        }
    }
}
