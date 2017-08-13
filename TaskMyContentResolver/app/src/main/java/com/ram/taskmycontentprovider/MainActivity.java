package com.ram.taskmycontentprovider;

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
    private EditText mNameEditText;
    private EditText mPhoneEditText;
    private SQLiteDatabase mDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMyHelper=new MyHelper(MainActivity.this,"EMPDB",null,1);
        mDB=mMyHelper.getWritableDatabase();
        mNameEditText=(EditText)findViewById(R.id.name_et);
        mPhoneEditText=(EditText)findViewById(R.id.phone_et);


    }

    public void insertData(View view) {
        ContentValues cv=new ContentValues();
        cv.put("name",mNameEditText.getText().toString());
        cv.put("phone",mPhoneEditText.getText().toString());
        long id=mDB.insert("employee",null,cv);
        Toast.makeText(this,String.valueOf(id), Toast.LENGTH_SHORT).show();

    }

    public void readData(View view) {
        Cursor c=mDB.query("employee",null,null,null,null,null,null);
        while (c.moveToNext()){
            Toast.makeText(this,c.getString(1), Toast.LENGTH_SHORT).show();
        }
    }

    public void updateData(View view) {
        ContentValues cv=new ContentValues();
        cv.put("name",mNameEditText.getText().toString());
        cv.put("phone",mPhoneEditText.getText().toString());
        int count = mDB.update("employee",cv,"name",new String[]{mNameEditText.getText().toString()});
        Cursor c=mDB.query("employee",null,null,null,null,null,null);
        if (c!=null) {
            Toast.makeText(this, count + "data updated", Toast.LENGTH_LONG).show();
        }
    }

    public void deleteData(View view) {
    }

    public void close(View view) {
    }
}
