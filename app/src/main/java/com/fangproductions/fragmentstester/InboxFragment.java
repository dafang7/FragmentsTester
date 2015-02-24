package com.fangproductions.fragmentstester;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by derek.fang on 2/9/2015.
 */
public class InboxFragment extends android.support.v4.app.ListFragment {

    private TextView mCenterTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_inbox, container, false);

        return rootView;
    }

    //Apparently updating views and stuff needs to be done in On Resume....
    @Override
    public void onResume() {
        super.onResume();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getListView().getContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.android_names));
        setListAdapter(adapter);

        mCenterTextView = (TextView) getActivity().findViewById(R.id.centeredText);
        mCenterTextView.setText("OVERLAY");
    }
}
