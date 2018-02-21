package com.example.davidmartins.avenging.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Model for Comic
 */

public class Comic implements Serializable {

    @Expose
    @SerializedName("id")
    private int mId;

    @Expose
    @SerializedName("title")
    private String mTitle;

    @Expose
    @SerializedName("description")
    private String mDescription;

    @Expose
    @SerializedName("startYear")
    private int mStartYear;

    @Expose
    @SerializedName("endYear")
    private int mEndYear;

    @Expose
    @SerializedName("rating")
    private String mRating;

    @Expose
    @SerializedName("type")
    private String mType;

    @Expose
    @SerializedName("modified")
    private String mModified;

    @Expose
    @SerializedName("name")
    private String mName;

    @Expose
    @SerializedName("resourceId")
    private String mResourceId;

    @Expose
    @SerializedName("thumbnail")
    private Image mThumbnail;

    @Expose
    @SerializedName("images")
    private List<Image> mImageList;

    public int getId() {
        return mId;
    }

    public void setId(final int id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(final String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(final String description) {
        mDescription = description;
    }

    public int getStartYear() {
        return mStartYear;
    }

    public void setStartYear(final int startYear) {
        mStartYear = startYear;
    }

    public int getEndYear() {
        return mEndYear;
    }

    public void setEndYear(final int endYear) {
        mEndYear = endYear;
    }

    public String getRating() {
        return mRating;
    }

    public void setRating(final String rating) {
        mRating = rating;
    }

    public String getType() {
        return mType;
    }

    public void setType(final String type) {
        mType = type;
    }

    public String getModified() {
        return mModified;
    }

    public void setModified(final String modified) {
        mModified = modified;
    }

    public String getName() {
        return mName;
    }

    public void setName(final String name) {
        mName = name;
    }

    public String getResourceId() {
        return mResourceId;
    }

    public void setResourceId(final String resourceId) {
        mResourceId = resourceId;
    }

    public Image getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(final Image thumbnail) {
        mThumbnail = thumbnail;
    }

    public List<Image> getImageList() {
        return mImageList;
    }

    public void setImageList(final List<Image> imageList) {
        mImageList = imageList;
    }
}







