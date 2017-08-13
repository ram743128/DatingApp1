package com.ram.reversestring;

import android.app.Activity;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {

    private EditText mEditText;
    private TextView mTextView;
    private Object arr;
    private static final String TAG = "MyActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText=(EditText)findViewById(R.id.editText1);
        mTextView=(TextView)findViewById(R.id.textView2);
    }

    public void Revers(View view) {

        String inputString = mEditText.getText().toString();
        String outputString = "";

        String[] wordsArray = inputString.split(" ");
        for (int i = wordsArray.length - 1; i >=0 ; i--) {
            outputString = (outputString + wordsArray[i] + " ");
        }

        mTextView.setText(outputString);
//        if(!mEditText.getText().toString().equals("")){
//
////            arrayValue.add(mEditText.getText().toString());
////            arrayTitleValue.add("Text Box Value 1");
//        }
    }
}
