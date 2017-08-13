package com.ram.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.zip.Inflater;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {


    private TextView mNameTV;
    private EditText mPhoneEt;
    private Button mPhoneBtn;
    private MainActivity mMainActivity;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        mMainActivity=(MainActivity) getActivity();
        mNameTV = (TextView) view.findViewById(R.id.name_tv);
        mPhoneEt=(EditText) view.findViewById(R.id.phone_et);
        mPhoneBtn=(Button) view.findViewById(R.id.phone_btm);
        mPhoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainActivity.sendPhone(mPhoneEt.getText().toString());

            }
        });
        return view;
    }

    public void showData(String s) {
        mNameTV.setText(s);
    }
}
