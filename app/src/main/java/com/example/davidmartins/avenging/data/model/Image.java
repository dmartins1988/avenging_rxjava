package com.example.davidmartins.avenging.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Model for Image thumbnail
 */

public class Image {

    @Expose
    @SerializedName("path")
    private String mPath;

    @Expose
    @SerializedName("extension")
    private String mExtension;

    public String getPath() {
        return mPath;
    }

    public void setPath(final String path) {
        mPath = path;
    }

    public String getExtension() {
        return mExtension;
    }

    public void setExtension(final String extension) {
        mExtension = extension;
    }
}


