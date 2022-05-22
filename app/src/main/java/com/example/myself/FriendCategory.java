package com.example.myself;

// Author : Christy Gunawan Simarmata - 10120806 - IF5
// Tanggal : 20 Mei 2022

import java.util.List;

public class FriendCategory {

    private String nameCategory;
    private List<Friend> friendList;

    public FriendCategory(String nameCategory, List<Friend> friendList) {
        this.nameCategory = nameCategory;
        this.friendList = friendList;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Friend> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<Friend> friendList) {
        this.friendList = friendList;
    }
}
