package com.example.android.quakereport;

/**
 * Created by adammcmurchie on 22/01/2017.
 */

public class Earthquake {

    // earthquake magnitude
    private String mMagnitude;

    //location of earthquake
    private String  mLocation;


    // date of earthquake
    private String mDate;

    /*
    * CONSTRUCT a new {@link Earthquake} OBJECT
    *
     */

    public Earthquake(String magnitude, String location, String date){

        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;

    }



    // returns constructed variables

    public String getMagnitude(){ return mMagnitude;}

    public String getLocation(){ return mLocation;}

    public String getDate(){ return mDate;}
}
