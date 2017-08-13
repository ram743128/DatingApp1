package com.ram.fragmenteg;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


    private Button mChangeBtn;
    private Button mCountBtn1;
    private TextView mPhoneTv;
    private MainActivity mMainActiviy;
    private FirstFragment mFirstFrag;
    private int number;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_first, container, false);
        mChangeBtn=(Button)view.findViewById(R.id.change_btn);
        mFirstFrag=new FirstFragment();
        mMainActiviy= (MainActivity) getActivity();
        mCountBtn1=(Button)view.findViewById((R.id.count_btn));
        mPhoneTv=(TextView)view.findViewById((R.id.TV_1));
        mChangeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainActiviy.change(Integer.parseInt(mPhoneTv.getText().toString()));
            }
        });
        mCountBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=Integer.parseInt(mPhoneTv.getText().toString());
                number++;
                mPhoneTv.setText(Integer.toString(number));
                mMainActiviy.setdatafirstfrag(Integer.toString(number));
            }
        });
        return view;

    }

}
