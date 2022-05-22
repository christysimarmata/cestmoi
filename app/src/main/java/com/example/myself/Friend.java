package com.example.myself;

// Author : Christy Gunawan Simarmata - 10120806 - IF5
// Tanggal : 20 Mei 2022

public class Friend {
    private int friendId;
    private String name;
    private String phone;

    public Friend(int friendId, String name, String phone) {
        this.friendId = friendId;
        this.name = name;
        this.phone = phone;
    }

    public int getFriendId() {
        return friendId;
    }

    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
