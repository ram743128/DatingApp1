package com.ram.reversearray1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends Activity {

    private TextView mUserValue;
    private TextView mReverseValue;
    private EditText mNumber;
    Random r;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNumber=(EditText)findViewById(R.id.et_num);
        mUserValue=(TextView)findViewById(R.id.tv_n1);
        mReverseValue=(TextView)findViewById(R.id.tv_n2);
    }

    public void generateReverseNumber(View view) {
        int length=Integer.parseInt(mNumber.getText().toString());
        int[] nums=new int[length];
        r=new Random();
        for(i=0;i<length;i++) {
            nums[i] = r.nextInt((100 - 1) + 1);
            mUserValue.setText(Arrays.toString(nums));
        }
        int[] reverse=new int[length];
        for(i=0;i<length;i++){
            reverse[i]=nums[(length-1)-i];
        }
        mReverseValue.setText(Arrays.toString(reverse));


    }
}
