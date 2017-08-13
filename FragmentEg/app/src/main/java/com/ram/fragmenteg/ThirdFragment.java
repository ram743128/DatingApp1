package com.ram.fragmenteg;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {


    private TextView mThirdFragTv;
    private Button mThirdFragBt;
    private int number;
    private MainActivity mMainActivity;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_third, container, false);
        mThirdFragTv=(TextView)view.findViewById(R.id.tv_3);
        mThirdFragBt=(Button)view.findViewById(R.id.Count_btn3);
        mMainActivity=(MainActivity)getActivity();
        Bundle bundle=new Bundle();
        if (bundle!=null)
        {
            mThirdFragTv.setText(bundle.getString("data",null));
        }
        mThirdFragBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=Integer.parseInt(mThirdFragTv.getText().toString());
                number++;
                mThirdFragTv.setText(Integer.toString(number));
                mMainActivity.setdatafirstfrag(Integer.toString(number));
            }

        });
        return view;

    }
    public void showData(String s)
    {
        mThirdFragTv.setText(s);
    }

}
