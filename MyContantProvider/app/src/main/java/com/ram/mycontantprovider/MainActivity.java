package com.ram.mycontantprovider;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private MyHelper mMyHelper;
    private SQLiteDatabase mDb;
    private EditText mNameEt;
    private EditText mPhoneEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMyHelper=new MyHelper(MainActivity.this,"EMPDB",null,1);
        mDb=mMyHelper.getWritableDatabase();
        mNameEt=(EditText)findViewById(R.id.name_et);
        mPhoneEt=(EditText)findViewById(R.id.phone_et);
    }

    public void insertData(View view) {
        ContentValues cv=new ContentValues();
        cv.put("name",mNameEt.getText().toString());
        cv.put("phone",mPhoneEt.getText().toString());
        long id=mDb.insert("employee",null,cv);
        Toast.makeText(this, String.valueOf(id), Toast.LENGTH_SHORT).show();
    }

    public void readData(View view) {
        Cursor c=mDb.query("employee",null,null,null,null,null,null);
        while (c.moveToNext()){
            Toast.makeText(this, c.getString(1), Toast.LENGTH_SHORT).show();
        }
    }
}
