package com.example.davidmartins.avenging.data.ui.base;

/**
 * Base interface that any class that wants to act as a View in MVP
 */

public interface BaseView {

    void showProgress();

    void hideProgress();

    void showErrorMessage(String errorMessage);

    void showEmpty();

    void showMessageLayout(boolean isShown);

}

