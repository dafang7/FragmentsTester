package com.fangproductions.fragmentstester;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by derek.fang on 2/9/2015.
 */
public class FriendsFragment extends android.support.v4.app.ListFragment {

    private TextView mTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_friends, container, false);
        return rootView;
    }

    //ON RESUME SAVES ME
    @Override
    public void onResume() {
        super.onResume();

        mTextView = (TextView) getActivity().findViewById(R.id.centerTextView);
        mTextView.setText("FINALLY");
    }
}
