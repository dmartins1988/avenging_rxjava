package com.example.davidmartins.avenging.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Model for Character Data Container
 */

public class CharacterDataContainer<T> {

    @Expose
    @SerializedName("offset")
    private int mOffset;

    @Expose
    @SerializedName("limit")
    private int mLimit;

    @Expose
    @SerializedName("total")
    private int mTotal;

    @Expose
    @SerializedName("count")
    private int mCount;

    @Expose
    @SerializedName("results")
    private T mResults;

    public int getOffset() {
        return mOffset;
    }

    public void setOffset(final int offset) {
        mOffset = offset;
    }

    public int getLimit() {
        return mLimit;
    }

    public void setLimit(final int limit) {
        mLimit = limit;
    }

    public int getTotal() {
        return mTotal;
    }

    public void setTotal(final int total) {
        mTotal = total;
    }

    public int getCount() {
        return mCount;
    }

    public void setCount(final int count) {
        mCount = count;
    }

    public T getResults() {
        return mResults;
    }

    public void setResults(final T results) {
        mResults = results;
    }
}




