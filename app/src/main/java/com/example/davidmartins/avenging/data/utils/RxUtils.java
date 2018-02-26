package com.example.davidmartins.avenging.data.utils;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Utils for RxJava
 */

public class RxUtils {

    public static <T> Observable.Transformer<T, T> applyObservableAsync() {
        return observable -> observable
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());
    }

}
