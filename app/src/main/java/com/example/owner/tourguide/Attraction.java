package com.example.owner.tourguide;

/**
 * Created by Owner on 6/18/2017.
 */

public class Attraction {

    //Title of the Attraction in St. Pete
    private String mAttractionTitle;

    // The description of the attraction in St. Pete
    private String mAttractionDescription;

    // Image Resource ID for the Attraction variable
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(String AttractionTitle, String AttractionDescription, int ImageResourceID) {
        mAttractionTitle = AttractionTitle;
        mAttractionDescription = AttractionDescription;
        mImageResourceID = ImageResourceID;
    }

    public String getmAttractionTitle() {
        return mAttractionTitle;
    }

    public String getmAttractionDescription() {
        return mAttractionDescription;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }
}
