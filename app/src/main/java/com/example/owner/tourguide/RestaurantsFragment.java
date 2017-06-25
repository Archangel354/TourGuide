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
        attractions.add(new Attraction(getString(R.string.tripsDinerTitle), getString(R.string.tripsDinerAddress), R.drawable.tripsdiner_restaurant));
        attractions.add(new Attraction(getString(R.string.redMesaTitle), getString(R.string.redMesaAddress), R.drawable.redmesa_restaurant));
        attractions.add(new Attraction(getString(R.string.nobleCrustTitle), getString(R.string.nobleCrustAddress), R.drawable.noblecrust_restaurant));
        attractions.add(new Attraction(getString(R.string.birchAndVineTitle), getString(R.string.birchAndVineAddress), R.drawable.birchandvine_restaurant));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
