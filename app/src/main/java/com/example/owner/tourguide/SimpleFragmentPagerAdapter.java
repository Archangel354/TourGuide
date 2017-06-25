package com.example.owner.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Owner on 6/24/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment returnFragment = null;
        switch (position){

            case 0:
                returnFragment =  new RestaurantsFragment();
            break;
            case 1:
                returnFragment =  new ParksFragment();
            break;
            case 2:
                returnFragment =  new MuseumsFragment();
            break;
            case 3:
                returnFragment =  new BeachesFragment();
            break;
        }
        return returnFragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 1) {
            return mContext.getString(R.string.category_parks);
        } else if (position == 2) {
            return mContext.getString(R.string.category_museums);
        } else {
            return mContext.getString(R.string.category_beaches);
        }

    }
}
