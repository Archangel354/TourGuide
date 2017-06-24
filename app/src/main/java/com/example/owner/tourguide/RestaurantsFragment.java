package com.example.owner.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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


        TextView textView = new TextView(getActivity());
        //textView.setText(R.string.hello_blank_fragment);
        //return textView;


        final ArrayList<Attraction> Attractions = new ArrayList<Attraction>();
        Attractions.add(new Attraction("Trip's Diner", "2339 Dr Martin Luther King Jr St North", R.drawable.tripsdiner_restaurant));
        Attractions.add(new Attraction("Red Mesa", "4912 4th St North", R.drawable.redmesa_restaurant));
        Attractions.add(new Attraction("Noble Crust", "8300 4th St North", R.drawable.noblecrust_restaurant));
        Attractions.add(new Attraction("Birch & Vine", "340 Beach Dr NE", R.drawable.birchandvine_restaurant));

        return textView;
        }



        }
