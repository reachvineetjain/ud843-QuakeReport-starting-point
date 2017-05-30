package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by Vineet K Jain on 5/13/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader <List<Earthquake>>{

    public static final String LOG_TAG = EarthquakeLoader.class.getName();
    public String mURL;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        mURL = url;
    }

    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG, "onstartLoading");
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        Log.i(LOG_TAG,"load In Background");
        if(mURL == null)
            return null;
        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mURL);
        return earthquakes;
    }
}