package com.example.myself;

// Author : Christy Gunawan Simarmata - 10120806 - IF5
// Tanggal : 19 Mei 2022

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class VPMusicAdapter extends FragmentStateAdapter {

    private String[] titles = new String[] {"Music","Video"};

    public VPMusicAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0 :
                return new TabMusicFragment();
            case 1 :
                return new TabVideoFragment();
        }
        return new TabMusicFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }



}
