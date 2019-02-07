package com.example.juman.fregment_lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity", "-------------onCreate----------");
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity", "-------------onStart----------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity", "-------------onResume----------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity", "-------------onPause----------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity", "-------------onStop----------");

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.e("MainActivity", "-----------onSaveInstanceState-----------------");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.e("MainActivity", "-----------onRestoreInstanceState-----------------");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity", "-------------onDestroy----------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MainActivity", "-------------onRestart----------");
    }

}
