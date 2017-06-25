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
        attractions.add(new Attraction(getString(R.string.fortDeSotoTitle), getString(R.string.fortDeSotoAddress), R.drawable.fortdesoto_park));
        attractions.add(new Attraction(getString(R.string.sunkenGardensTitle), getString(R.string.sunkenGardensAddress), R.drawable.sunkengardens_park));
        attractions.add(new Attraction(getString(R.string.weedonIslandTitle), getString(R.string.weedonIslandAddress), R.drawable.weedonisland_park));
        attractions.add(new Attraction(getString(R.string.egmontKeyTitle), getString(R.string.egmontKeyAddress), R.drawable.egmontkey_park));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_parks);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}