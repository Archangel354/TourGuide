package com.example.owner.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.attraction_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Trip's Diner", "2339 Dr Martin Luther King Jr St North", R.drawable.tripsdiner_restaurant));
        attractions.add(new Attraction("Red Mesa", "4912 4th St North", R.drawable.redmesa_restaurant));
        attractions.add(new Attraction("Noble Crust", "8300 4th St North", R.drawable.noblecrust_restaurant));
        attractions.add(new Attraction("Birch & Vine", "340 Beach Dr NE", R.drawable.birchandvine_restaurant));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_museums);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}