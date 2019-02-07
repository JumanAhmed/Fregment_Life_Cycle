package com.example.juman.fregment_lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Juman on 5/2/2016.
 */
public class My_fregment extends Fragment {

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("My_fragment","-----------onAttach-----------------");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("My_fragment", "-----------onCreate-----------------");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("My_fragment", "-----------onCreateView-----------------");
        return inflater.inflate(R.layout.my_fregment_layout,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("My_fragment", "-----------onActivityCreated-----------------");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("My_fragment", "-----------onStart-----------------");
    }


    @Override
    public void onResume() {
        Log.i("My_fragment", "-----------onResume-----------------");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("My_fragment", "-----------onPause-----------------");
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.i("My_fragment", "-----------onSaveInstanceState-----------------");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        Log.i("My_fragment", "-----------onStop-----------------");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("My_fragment", "-----------onDestroyView-----------------");
        super.onDestroyView(); // it will destroy the fregment from activity,,,
    }

    @Override
    public void onDestroy() {
        Log.i("My_fragment", "-----------onDestroy-----------------");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("My_fragment", "-----------onDetach-----------------");
        super.onDetach(); // the activity is not tied any more ,, OnDetach() is opposite of OnAttach .
    }


}
