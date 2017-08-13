package com.ram.counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNumberTv=(TextView)findViewById(R.id.integer_tv);

    }
    public void send(View view)
    {
        String number=mNumberTv.getText().toString();
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("Number",number);
        startActivity(intent);
    }
    public void increase(View view)
    {
        int num=Integer.parseInt(mNumberTv.getText().toString());
        num=num+1;
        mNumberTv.setText(String.valueOf(num));
    }



}
