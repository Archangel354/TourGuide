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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.attraction_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Fort De Soto", "3500 Pinellas Bayway S, Tiere Verde, FL 33715", R.drawable.fortdesoto_park));
        attractions.add(new Attraction("Sunken Gardens", "1825 4th Street N, St. Petersburg, FL 33704", R.drawable.sunkengardens_park));
        attractions.add(new Attraction("Weedon Island", "1800 Weedon Dr NE, St. Petersburg, FL 33702", R.drawable.weedonisland_park));
        attractions.add(new Attraction("Egmont Key", "St. Petersburg, FL 33715", R.drawable.egmontkey_park));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_parks);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}