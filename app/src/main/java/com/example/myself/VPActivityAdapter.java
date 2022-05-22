package com.example.myself;

// Author : Christy Gunawan Simarmata - 10120806 - IF5
// Tanggal : 19 Mei 2022

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VPActivityAdapter extends FragmentStateAdapter {
    private String[] titles = new String[] {"Activities","Friendlist"};

    public VPActivityAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0 :
                return new TabActivityFragment();
            case 1 :
                return new TabFriendlistFragment();
        }
        return new TabActivityFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

}
