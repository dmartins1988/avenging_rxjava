package com.example.davidmartins.avenging.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by david.martins on 21/02/2018.
 */

public class CharacterDataWrapper<T> {

    @Expose
    @SerializedName("code")
    private int mCode;

    @Expose
    @SerializedName("status")
    private String mStatus;

    @Expose
    @SerializedName("copyright")
    private String mCopyright;

    @Expose
    @SerializedName("attributionText")
    private String mAttributionText;

    @Expose
    @SerializedName("attributionHTML")
    private String mAttributionHTML;

    @Expose
    @SerializedName("data")
    private CharacterDataContainer<T> mData;

    public int getCode() {
        return mCode;
    }

    public void setCode(final int code) {
        mCode = code;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(final String status) {
        mStatus = status;
    }

    public String getCopyright() {
        return mCopyright;
    }

    public void setCopyright(final String copyright) {
        mCopyright = copyright;
    }

    public String getAttributionText() {
        return mAttributionText;
    }

    public void setAttributionText(final String attributionText) {
        mAttributionText = attributionText;
    }

    public String getAttributionHTML() {
        return mAttributionHTML;
    }

    public void setAttributionHTML(final String attributionHTML) {
        mAttributionHTML = attributionHTML;
    }

    public CharacterDataContainer<T> getData() {
        return mData;
    }

    public void setData(final CharacterDataContainer<T> data) {
        mData = data;
    }
}
