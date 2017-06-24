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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.attraction_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Trip's Diner", "2339 Dr M.L.K. Jr St N, St. Petersburg, FL 33704", R.drawable.tripsdiner_restaurant));
        attractions.add(new Attraction("Red Mesa", "4912 4th St N, St. Petersburg, FL 33703", R.drawable.redmesa_restaurant));
        attractions.add(new Attraction("Noble Crust", "8300 4th St N, St. Petersburg, FL 33702", R.drawable.noblecrust_restaurant));
        attractions.add(new Attraction("Birch & Vine", " 340 Beach Dr NE, St. Petersburg, FL 33701", R.drawable.birchandvine_restaurant));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
