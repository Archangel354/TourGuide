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
        attractions.add(new Attraction(getString(R.string.salvadorDaliTitle), getString(R.string.salvadorDaliAddress), R.drawable.salvadordali_museum));
        attractions.add(new Attraction(getString(R.string.fineArtsTitle), getString(R.string.fineArtsAddress), R.drawable.finearts_museum));
        attractions.add(new Attraction(getString(R.string.greatExplorationsTitle), getString(R.string.greatExplorationsAddress), R.drawable.childrens_museum));
        attractions.add(new Attraction(getString(R.string.holocaustTitle), getString(R.string.holocaustAddress), R.drawable.holocaust_museum));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_museums);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}