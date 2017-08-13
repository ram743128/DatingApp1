package com.ram.autocomplete;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView a1;
    String[] fruits={"Mango","guava","banana","papay","pineapple","pumpkin","apple","anar","mazaa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter= new ArrayAdapter<String(this,android.R.layout.select_dialog_item,fruits);
        a1=(AutoCompleteTextView)findViewById(R.id.auto);
        a1.setThreshold(1);
        a1.setAdapter(adapter);
        a1.setTextColor(Color.BLUE);
    }
}
