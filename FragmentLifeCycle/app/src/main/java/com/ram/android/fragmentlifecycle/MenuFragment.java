package com.ram.android.fragmentlifecycle;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by MOHGOEL on 7/13/2017.
 */

public class MenuFragment extends ListFragment {
    public static final String LOG_TAG = MenuFragment.class.getSimpleName();

    String[] countryNames = new String[]{"Norway", "Austrailia", "Netherlands", "U.S.A",
            "New Zealand", "Canada", "Ireland", "Germany"};
    String[] capitalNames = new String[]{"Oslo", "Canberra", "Amsterdam", "Washington, D.C.",
            "Wellington", "Ottawa", "Dublin", "Berlin"};

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(LOG_TAG, "3: onCreateView");

        View view = inflater.inflate(R.layout.menu_fragment, container, false);
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, countryNames);
        setListAdapter(adapter);
        return view;
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

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        DetailFragment fragmentDetail = (DetailFragment) getFragmentManager().findFragmentById(R.id.detail_fragment);
        fragmentDetail.update(countryNames[position], capitalNames[position]);
        getListView().setSelector(android.R.color.holo_green_dark);
    }
}
