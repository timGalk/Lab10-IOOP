package edu.io;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String directorName;
    private int duration;
    private ArrayList<CastMember> cast;

    public Movie(String title, String directorName, int duration, ArrayList<CastMember> cast) {
        this.title = title;
        this.directorName = directorName;
        this.duration = duration;
        this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ArrayList<CastMember> getCast() {
        return cast;
    }

    public void setCast(ArrayList<CastMember> cast) {
        this.cast = cast;
    }

//    @Override
//    public String toString() {
//        return "Movie{" +
//                "title='" + title + '\'' +
//                ", directorName='" + directorName + '\'' +
//                ", duration=" + duration +
//                ", cast=" + cast +
//                '}';
//    }
}
