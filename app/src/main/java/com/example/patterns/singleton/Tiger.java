package com.example.patterns.singleton;

import android.os.Bundle;
import android.util.Log;

/**
 * Created by admin on 8/22/2016.
 */
public class Tiger {

    private static final String TAG = "TigerTAG_";
    private static Tiger instance;

    private Tiger() {
    }

    public static Tiger getInstance() {

        if (instance == null) {

            instance = new Tiger();

        }
        return instance;
    }

    public void eat() {

        Log.d(TAG, "eat: " + this);
    }
}
