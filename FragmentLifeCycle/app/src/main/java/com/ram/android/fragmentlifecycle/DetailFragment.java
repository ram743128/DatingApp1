package com.ram.android.fragmentlifecycle;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by MOHGOEL on 7/13/2017.
 */

public class DetailFragment extends Fragment {
    public static final String LOG_TAG = DetailFragment.class.getSimpleName();
    private TextView tvCountryName;
    private TextView tvCapitalName;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.i(LOG_TAG, "3: onCreateView");

        View view = inflater.inflate(R.layout.detail_fragment, container, false);
        tvCountryName = (TextView) view.findViewById(R.id.country_name_textview);
        tvCapitalName = (TextView) view.findViewById(R.id.capital_name_textview);
        return view;
    }

    public void update(String country, String capital) {
        tvCountryName.setText(country);
        tvCapitalName.setText(capital);
    }

    @Override
    public void onAttach(Context context) {
        Log.i(LOG_TAG, "1: onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i(LOG_TAG, "2: onCreate");
        super.onCreate(savedInstanceState);
    }



    @Override
    public void onStart() {
        Log.i(LOG_TAG, "4: onStart");

        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i(LOG_TAG, "5: onResume");

        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i(LOG_TAG, "6: onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i(LOG_TAG, "7: onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i(LOG_TAG, "8: onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i(LOG_TAG, "9: onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i(LOG_TAG, "10: onDetach");
        super.onDetach();
    }
}
