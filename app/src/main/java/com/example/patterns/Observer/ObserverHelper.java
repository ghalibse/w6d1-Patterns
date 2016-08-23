package com.example.patterns.Observer;

import android.util.Log;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;

/**
 * Created by evin on 8/22/16.
 */
public class ObserverHelper {
    public static Observer<String> createObserver() {
        return new Observer<String>() {
            public static final String TAG = "ObserverHelperTAG_";

            // Triggered for each emitted value
            @Override
            public void onNext(String s) {

                Log.d(TAG, "onNext: " + s);
            }

            // Triggered once the observable is complete
            @Override
            public void onCompleted() {

                Log.d(TAG, "onCompleted: " + "done!");
            }

            // Triggered if there is any errors during the event
            @Override
            public void onError(Throwable e) {
            }
        };
    }

    public static Observable<String> createObservable() {
        return Observable.create(
                new Observable.OnSubscribe<String>() {
                    @Override
                    public void call(Subscriber<? super String> sub) {
                        // "Emit" any data to the subscriber
                        sub.onNext("a");
                        sub.onNext("b");
                        sub.onNext("c");
                        // Trigger the completion of the event
                        sub.onCompleted();
                    }
                }
        );
    }

}
