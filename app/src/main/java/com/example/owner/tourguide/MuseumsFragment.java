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
        attractions.add(new Attraction("Salvador Dalí Museum", "1 Dali Blvd, St Petersburg, FL 33701", R.drawable.salvadordali_museum));
        attractions.add(new Attraction("Museum of Fine Arts", "255 Beach Dr NE, St. Petersburg, FL 33701", R.drawable.finearts_museum));
        attractions.add(new Attraction("Great Explorations Children's Museum", "1925 4th St N, St. Petersburg, FL 33704", R.drawable.childrens_museum));
        attractions.add(new Attraction("Florida Holocaust Museum", " 55 5th St S, St. Petersburg, FL 33701", R.drawable.holocaust_museum));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_museums);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}