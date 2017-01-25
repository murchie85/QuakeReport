package com.example.android.quakereport;

/**
 * Created by adammcmurchie on 22/01/2017.
 */

public class Earthquake {

    // earthquake magnitude
    private String mMagnitude;

    //location of earthquake
    private String  mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }



    // returns constructed variables

    public String getMagnitude(){ return mMagnitude;}

    public String getLocation(){ return mLocation;}

    public long getTimeInMilliseconds() {return mTimeInMilliseconds;}

    // public String getDate(){ return mDate;}


}
