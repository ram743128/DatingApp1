package com.ram.taskmycontentresolver;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText mNameEditText;
    private EditText mPhoneEditText;
    private SQLiteDatabase mDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void read(View view) {
        ContentValues cv=new ContentValues();
        cv.put("name",mNameEditText.getText().toString());
        cv.put("phone",mPhoneEditText.getText().toString());
        long id=mDB.insert("employee",null,cv);
        Toast.makeText(this,String.valueOf(id), Toast.LENGTH_SHORT).show();
    }

    public void insert(View view) {
    }

    public void update(View view) {
    }

    public void delete(View view) {
    }
}
