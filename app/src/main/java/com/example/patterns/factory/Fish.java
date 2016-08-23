package com.example.patterns.factory;

import android.util.Log;

/**
 * Created by admin on 8/22/2016.
 */
public class Fish implements Animal{
    private static final String TAG = "FishTAG_";

    @Override
    public void eat() {
        Log.d(TAG, "eat: " + this);

    }

    @Override
    public void sleep() {

        Log.d(TAG, "sleep: " + this);
    }

    public void swim(){

        Log.d(TAG, "swim: " + this);
    }
}
