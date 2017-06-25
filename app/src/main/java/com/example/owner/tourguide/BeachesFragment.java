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
        attractions.add(new Attraction(getString(R.string.passAGrilleTitle), getString(R.string.passAGrilleAddress), R.drawable.passagrille_beach));
        attractions.add(new Attraction(getString(R.string.treasureIslandTitle), getString(R.string.treasureIslandAddress), R.drawable.treasureisland_beach));
        attractions.add(new Attraction(getString(R.string.archibaldBeachTitle), getString(R.string.archibaldBeachAddress), R.drawable.archibald_beach));
        attractions.add(new Attraction(getString(R.string.indianRocksTitle), getString(R.string.indianRocksAddress), R.drawable.indianrocks_beach));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_beaches);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}