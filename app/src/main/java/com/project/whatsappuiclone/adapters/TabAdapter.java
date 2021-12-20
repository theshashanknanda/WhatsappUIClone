package com.project.whatsappuiclone.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.project.whatsappuiclone.fragments.CallsFragment;
import com.project.whatsappuiclone.fragments.ChatFragment;
import com.project.whatsappuiclone.fragments.StatusFragment;

public class TabAdapter extends FragmentPagerAdapter {

    String arr[] = {"Chat", "Status", "Calls"};

    public TabAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new ChatFragment();
                break;

            case 1:
                fragment = new StatusFragment();
                break;

            case 2:
                fragment = new CallsFragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return arr[position];
    }
}
