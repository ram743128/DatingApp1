package com.ram.gettingdataback;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }


    public void goNext(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, 6);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 6)//second
        {
            if (resultCode == RESULT_OK) {//success
                String cityname = data.getStringExtra("mycity");
                Toast.makeText(this, cityname, Toast.LENGTH_SHORT).show();
            }
        }
    }
}