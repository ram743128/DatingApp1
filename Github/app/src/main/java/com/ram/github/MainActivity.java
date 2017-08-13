package com.ram.github;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText mEditText;
    private TextView mTextview;
    private TextView mTextview1;
    private TextView mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText=(EditText)findViewById(R.id.Search_et);
        mTextview1=(TextView)findViewById(R.id.url_tv);
        mEditText2=(TextView)findViewById(R.id.github_result_tv);
        msp=getSharedPreferences("name",MODE_APPEND)
    ErrorMessage msg=(TextView)findViewById(R.id.github_result_tv)
         void makeGitHubquery()
    { String gitHubQuery
    }
}
