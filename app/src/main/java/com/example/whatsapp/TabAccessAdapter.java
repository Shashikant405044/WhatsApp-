package com.example.whatsapp;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAccessAdapter extends FragmentPagerAdapter {

    public TabAccessAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                ChatFragment chatFragment=new ChatFragment();
                return chatFragment;
            case 1:
                ContactFragment contactFragment=new ContactFragment();
                return contactFragment;
            case 2:
                GroupFragment groupFragment=new GroupFragment();
                return groupFragment;
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "Wash" ;
            case 1:
                return "Maintenance";
            case 2:
                return "Special Care";
            default:
                return null;

                //shshsgit
        }
    }
}
