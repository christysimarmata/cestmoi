package com.example.myself;

// Author : Christy Gunawan Simarmata - 10120806 - IF5
// Tanggal : 17 Mei 2022

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.myself.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {

                case R.id.homemenu:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.activitymenu:
                    replaceFragment(new DailyActivityFragment());
                    break;
                case R.id.gallerymenu:
                    replaceFragment(new GalleryFragment());
                    break;
                case R.id.musicmenu:
                    replaceFragment(new MusicFragment());
                    break;
                case R.id.profilemenu:
                    replaceFragment(new ProfileFragment());
                    break;

            }

            return true;
        });
    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }

}

