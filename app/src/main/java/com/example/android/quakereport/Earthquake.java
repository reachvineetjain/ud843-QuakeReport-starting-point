package com.example.android.quakereport;

/**
 * Created by Vineet K Jain on 5/8/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mPlace;
    private long mDateandtime;
    private String mURL;

    public Earthquake(double magnitude, String place, long dateandtime, String url) {
        this.mMagnitude = magnitude;
        this.mPlace = place;
        this.mDateandtime = dateandtime;
        this.mURL = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getPlace() {
        return mPlace;
    }

    public long getDateandtime() {
        return mDateandtime;
    }

    public String getURL(){
        return mURL;
    }
}