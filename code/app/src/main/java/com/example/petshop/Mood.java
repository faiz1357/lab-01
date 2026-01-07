package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private Date moodDate;

    public Mood(){
        this.moodDate = new Date();
    }

    public Mood(Date moodDate){
        this.moodDate = moodDate;
    }

    public Date getDate() {
        return moodDate;
    }

    public void setDate(Date date) {
        this.moodDate = date;
    }
    public abstract String vibes();
}

