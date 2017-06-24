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
public class BeachesFragment extends Fragment {


    public BeachesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.attraction_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Pass-A-Grille Beach", " 113 11th Ave, St. Pete Beach, FL 33706", R.drawable.passagrille_beach));
        attractions.add(new Attraction("Treasure Island", "10400 Gulf Blvd, Treasure Island, FL 33706", R.drawable.treasureisland_beach));
        attractions.add(new Attraction("Archibald Beach Park", "15100 Gulf Blvd, St. Petersburg, FL 33708", R.drawable.archibald_beach));
        attractions.add(new Attraction("Indian Rocks Beach", "1700 Gulf Blvd.\n" +
                "Indian Rocks Beach, FL 33785", R.drawable.indianrocks_beach));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_beaches);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}