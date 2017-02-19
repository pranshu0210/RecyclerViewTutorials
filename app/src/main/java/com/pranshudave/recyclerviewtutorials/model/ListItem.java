package com.pranshudave.recyclerviewtutorials.model;

/**
 * Java Representation of our data to be displayed in the recyclerView
 * Created by pranshu on 18/2/17.
 */

public class ListItem {
    private String title;
    private int imageResId;
    private String subtitle;
    private boolean favourite = false;

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
}
