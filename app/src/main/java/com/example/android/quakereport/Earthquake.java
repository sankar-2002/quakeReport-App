package com.example.android.quakereport;

//Earthquake object contains info related to single earthquake....

public class Earthquake {   //1.earthquake_list_item.xml......2.Earthquake.java.....3.(earthquakeActivity.xml) & EarthquakeActivity.java....4.EarthquakeAdapter.java and updating EarthquakeActivity

    private double mMagnitude;  //private global variables...

    private String mLocation;

    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;


    //constructing a new Earthquake object(constructor) which has a parameter(magnitude,location,date)....

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {

        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    //private global variables require public methods so that other classes can access this info..

    public double getMagnitude() { return mMagnitude;}  //returns the magnitude of earthquake..

    public  String getLocation() { return mLocation;} //returns the location of earthquake...

    public long getTimeInMilliseconds() { return mTimeInMilliseconds;} //returns the date of earthquake...

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}


