package com.udemy.section9.LinkedList.Challenge;

/**
 * Created by welencd on 2017-06-26.
 */
public class Song {
    private String title;
    private double duration;

    public Song(String name, double duration) {
        this.title = name;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
