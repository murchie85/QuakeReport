package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by adammcmurchie on 22/01/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake>{

    //CONSTRUCT NEW EARTHQUAKE ADAPTER


    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes){
        super(context, 0, earthquakes);
    }

    // returns item view - displays earthquake info

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // check if existing listview (CALLED convertview) to reuse
        //otherwise if convertview = null then inflate listitem layout

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(       // inflate ze badboy
                    R.layout.earthquake_list_item, parent, false);
        }

        // find earthquake at given position in list of earthquakes
        Earthquake currentEarthquake = getItem(position);

        //find Textview ID with ID magnitude
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        // display magnitude of current in that Textview
        magnitudeView.setText(currentEarthquake.getMagnitude());

        // find Textview wiht ID location
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        // display location of current in that Textview
        locationView.setText(currentEarthquake.getLocation());

        // find textview with date ID in that textview location
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // display date of current in that textview
        dateView.setText(currentEarthquake.getDate());

        // once we have the info, we return the view to the caller
        return listItemView;



    }
}
