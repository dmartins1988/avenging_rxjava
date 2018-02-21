package com.example.davidmartins.avenging.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Model for URL
 */

public class Url implements Serializable {

    @Expose
    @SerializedName("type")
    private String mType;

    @Expose
    @SerializedName("url")
    private String mUrl;

    public String getType() {
        return mType;
    }

    public void setType(final String type) {
        mType = type;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(final String url) {
        mUrl = url;
    }
}


