package com.example.myself;

// Author : Christy Gunawan Simarmata - 10120806 - IF5
// Tanggal : 20 Mei 2022

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class FriendlistCard {
    int image;
    String title;
    GradientDrawable color;

    public FriendlistCard(GradientDrawable color, int image, String title) {
        this.image = image;
        this.title = title;
        this.color = color;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }


    public Drawable getgradient() {
        return color;
    }
}
