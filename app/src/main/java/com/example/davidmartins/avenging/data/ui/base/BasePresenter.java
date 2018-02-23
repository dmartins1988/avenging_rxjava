package com.example.davidmartins.avenging.data.ui.base;

/**
 * Base presenter that must be extended by all the other presenters
 */

public class BasePresenter<V extends BaseView> {

    private V mView;

    public void attachView(V view) {
        mView = view;
    }

    public void detachView() {
        mView = null;
    }

    public boolean isViewAttached() {
        return mView != null;
    }

    public V getView() {
        return mView;
    }
}
