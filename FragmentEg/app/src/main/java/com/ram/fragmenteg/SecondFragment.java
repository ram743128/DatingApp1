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
public class SecondFragment extends Fragment {


    private TextView msecFragTv;
    private Button msecFragBt;
    private MainActivity mMainActivity;
    private int number;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_second, container, false);
        msecFragTv=(TextView)view.findViewById(R.id.tv_2);
        msecFragBt=(Button)view.findViewById(R.id.count_btn2);
        mMainActivity=(MainActivity)getActivity();
        Bundle bundle=getArguments();
        if(bundle!=null)
        {
            msecFragTv.setText(bundle.getString("data",null));
        }
        msecFragBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=Integer.parseInt(msecFragTv.getText().toString());
                number++;
                msecFragTv.setText(Integer.toString(number));
                mMainActivity.setdatafirstfrag(Integer.toString(number));
            }
        });
        return view;
    }
    public void showData(String s)
    {
        msecFragTv.setText(s);
    }

}
