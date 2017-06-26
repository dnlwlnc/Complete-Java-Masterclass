package com.udemy.section9.LinkedList.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by welencd on 2017-06-26.
 */
public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for (Song checkSong : this.songs) {
            if (checkSong.getTitle().equals(title)) {
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber-1;
        if ((index > 0) && (index <= this.songs.size())) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }
}
