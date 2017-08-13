package com.ram.gettingdataback;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.app.Activity.RESULT_OK;
import static com.ram.gettingdataback.R.id.City_Name;

public class SecondActivity extends Activity {
private EditText myCityNameEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        myCityNameEt=(EditText)findViewById(R.id.City_Name);

    }

    public void setData(View view) {
        Intent intent =new Intent();
        intent.putExtra("mycity",myCityNameEt.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }
}
