package com.example.demo.model;

import java.util.Date;
import java.util.GregorianCalendar;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;


    public String getText() {
        return text;
    }
    public Integer getLikes() {
        return likes;
    }
    public Date getCreationDate() {
        return creationDate;
    }

    public Post(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
        likes = 0;
    }
}
