package com.hb.spring.pojo;

public class Hobby {
    private String song;
    private String dance;
    private String rap;
    private String basketball;

    public Hobby() {
    }

    public Hobby(String song, String dance, String rap, String basketball) {
        this.song = song;
        this.dance = dance;
        this.rap = rap;
        this.basketball = basketball;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getDance() {
        return dance;
    }

    public void setDance(String dance) {
        this.dance = dance;
    }

    public String getRap() {
        return rap;
    }

    public void setRap(String rap) {
        this.rap = rap;
    }

    public String getBasketball() {
        return basketball;
    }

    public void setBasketball(String basketball) {
        this.basketball = basketball;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "song='" + song + '\'' +
                ", dance='" + dance + '\'' +
                ", rap='" + rap + '\'' +
                ", basketball='" + basketball + '\'' +
                '}';
    }
}
