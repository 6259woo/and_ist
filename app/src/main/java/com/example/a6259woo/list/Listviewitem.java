package com.example.a6259woo.list;

import android.graphics.drawable.Drawable;

/**
 * Created by 6259woo on 2018. 5. 14..
 */

public class Listviewitem {
    String name;
    String artist;
    Drawable imgage;

    public String getArtist(){
        return artist;
    }

    public Drawable getImgage() {
        return imgage;
    }

    public String getName() {
        return name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setImgage(Drawable imgage) {
        this.imgage = imgage;
    }

    public void setName(String name) {
        this.name = name;
    }
}
