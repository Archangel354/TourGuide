package com.example.owner.tourguide;

/**
 * Created by Owner on 6/18/2017.
 */

public class Attraction {

    //Title of the Attraction in St. Pete
    private String mAttractionTitle;

    // The description of the attraction in St. Pete
    private String mAttractionAddress;

    // Image Resource ID for the Attraction variable
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(String AttractionTitle, String AttractionAddress, int ImageResourceID) {
        mAttractionTitle = AttractionTitle;
        mAttractionAddress = AttractionAddress;
        mImageResourceID = ImageResourceID;
    }

    public String getmAttractionTitle() {
        return mAttractionTitle;
    }

    public String getmAttractionAddress() {
        return mAttractionAddress;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
