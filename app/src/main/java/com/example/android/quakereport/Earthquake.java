package com.example.android.quakereport;

import android.os.AsyncTask;

import java.util.List;

/**
 * Created by adammcmurchie on 22/01/2017.
 */

public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude;

    //location of earthquake
    private String  mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    /** URL for earthquake data from the USGS dataset */
    private static final String USGS_REQUEST_URL =
            "http://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&orderby=time&minmag=6&limit=10";

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    // returns constructed variables

    public double getMagnitude(){ return mMagnitude;}

    public String getLocation(){ return mLocation;}

    public long getTimeInMilliseconds() {return mTimeInMilliseconds;}

    public String getUrl() {return mUrl;}






}
