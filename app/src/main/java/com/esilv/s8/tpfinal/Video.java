package com.esilv.s8.tpfinal;

import java.util.Date;

/**
 * Created by Jessica on 22/03/2017.
 */

public class Video {

    private String title;
    private String author;
    private Date date;
    private String description;
    private Video thumbnail;

    public Video(String title, String description, Date date, String author, Video thumbnail){
        this.title = title;
        this.author = author;
        this.date = date;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Video getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Video thumbnail) {
        this.thumbnail = thumbnail;
    }

}

