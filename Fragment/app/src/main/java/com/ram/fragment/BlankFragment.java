package com.ram.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    private Button mChangeBtn;
    private EditText mNameEt;
    private Button mSendDataBtn;
    private MainActivity mainActivity;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
         mainActivity = (MainActivity) getActivity();
        mChangeBtn = (Button) view.findViewById(R.id.change_btn);
        mNameEt=(EditText)view.findViewById(R.id.name_et);
        mSendDataBtn=(Button)view.findViewById(R.id.sendata);
        mSendDataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.sendData(mNameEt.getText().toString());
            }
        });
        mChangeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainActivity.change();
            }


        });
        return view;


    }

    public void showPhone(String s) {
        mNameEt.setText(s);


    }
}
