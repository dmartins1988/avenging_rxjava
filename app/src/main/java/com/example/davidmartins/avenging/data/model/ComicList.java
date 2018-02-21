package com.example.davidmartins.avenging.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Model for Comics List
 */

class ComicList {

    @Expose
    @SerializedName("available")
    private int mAvailable;

    @Expose
    @SerializedName("returned")
    private int mReturned;

    @Expose
    @SerializedName("collectionURI")
    private String mCollectionURI;

    @Expose
    @SerializedName("items")
    private List<Comic> mItems;

    public int getAvailable() {
        return mAvailable;
    }

    public void setAvailable(final int available) {
        mAvailable = available;
    }

    public int getReturned() {
        return mReturned;
    }

    public void setReturned(final int returned) {
        mReturned = returned;
    }

    public String getCollectionURI() {
        return mCollectionURI;
    }

    public void setCollectionURI(final String collectionURI) {
        mCollectionURI = collectionURI;
    }

    public List<Comic> getItems() {
        return mItems;
    }

    public void setItems(final List<Comic> items) {
        mItems = items;
    }
}

