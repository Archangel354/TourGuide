package com.example.owner.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.v7.appcompat.R.id.image;

/**
 * Created by Owner on 6/24/2017.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    //  Resource ID for the background color for this list of words
    private int mColorResourceId;

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions, int colorResourceId) {
        super(context, 0, attractions);
        mColorResourceId = colorResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        // Get the Attraction object at the position in the list.
        Attraction currentAtraction = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the title from the current Attraction object
        // and set this text on the title textView in the Layout.
        titleTextView.setText(currentAtraction.getmAttractionTitle());

        // Find the TextView in the list_item.xml layout with the address
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the address from the current Attraction object
        // and set this text on the address textView in the Layout.
        addressTextView.setText(currentAtraction.getmAttractionAddress());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView = (ImageView) listItemView.findViewById(image);

        // Check to see if an image is provided for this word or not
        if (currentAtraction.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentAtraction.getmImageResourceID());
            // Make really sure that this image is actually visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView placeholder (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
