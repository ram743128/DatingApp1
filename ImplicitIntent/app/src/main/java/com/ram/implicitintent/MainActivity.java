package com.ram.implicitintent;

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

    public void sharedata(View view) {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT,"hello friends");
        intent.setType("text/plain");
        startActivityForResult(intent,77);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==77){
            if(requestCode==RESULT_OK);
            String email=data.getStringExtra("myemail");
            Toast.makeText(this, "email", Toast.LENGTH_SHORT).show();
        }
    }
}
