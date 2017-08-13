package com.ram.pallindrom;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText mEditText;
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = (EditText) findViewById(R.id.num_et);
        mText = (TextView) findViewById(R.id.textView);
    }
    public void checkon(View view) {
        String origanal = mEditText.getText().toString();
        String reverse = "";
        char [] ch=origanal.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            reverse=reverse+ch[i];
        }
        if(origanal.equals(reverse))
        {
            mText.setText("Enter number is pallindrome");
        }
        else
            mText.setText(("Enter number is not pallindrome"));
    }
}
