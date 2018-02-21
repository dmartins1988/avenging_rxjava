package com.example.davidmartins.avenging.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


/**
 * Model for Character
 */

public class Character implements Serializable {

    @Expose
    @SerializedName("id")
    private int mId;

    @Expose
    @SerializedName("name")
    private String mName;

    @Expose
    @SerializedName("description")
    private String mDescription;

    @Expose
    @SerializedName("resourceURI")
    private String mResourceURI;

    @Expose
    @SerializedName("urls")
    private List<Url> mUrls;

    @Expose
    @SerializedName("thumbnail")
    private Image mThumbnail;

    @Expose
    @SerializedName("comics")
    private ComicList mComics;

    @Expose
    @SerializedName("stories")
    private ComicList mStories;

    @Expose
    @SerializedName("events")
    private ComicList mEvents;

    @Expose
    @SerializedName("series")
    private ComicList mSeries;

    public int getId() {
        return mId;
    }

    public void setId(final int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(final String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(final String description) {
        mDescription = description;
    }

    public String getResourceURI() {
        return mResourceURI;
    }

    public void setResourceURI(final String resourceURI) {
        mResourceURI = resourceURI;
    }

    public List<Url> getUrls() {
        return mUrls;
    }

    public void setUrls(final List<Url> urls) {
        mUrls = urls;
    }

    public Image getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(final Image thumbnail) {
        mThumbnail = thumbnail;
    }

    public ComicList getComics() {
        return mComics;
    }

    public void setComics(final ComicList comics) {
        mComics = comics;
    }

    public ComicList getStories() {
        return mStories;
    }

    public void setStories(final ComicList stories) {
        mStories = stories;
    }

    public ComicList getEvents() {
        return mEvents;
    }

    public void setEvents(final ComicList events) {
        mEvents = events;
    }

    public ComicList getSeries() {
        return mSeries;
    }

    public void setSeries(final ComicList series) {
        mSeries = series;
    }
}



