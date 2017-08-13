package com.ram.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    private Button mChangeBtn;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view= inflater.inflate(R.layout.fragment_blank, container, false);
        mChangeBtn=(Button)view.findViewById(R.id.change_btn);
        mChangeBtn.setOnClickListener(new View.OnClickListener() {//save progamatically
            @Override
            public void onClick(View v) {
                MainActivity mainActivity=(MainActivity) getActivity();//return paraent activity
                mainActivity.change();
            }
        });
        return view;
    }

}
