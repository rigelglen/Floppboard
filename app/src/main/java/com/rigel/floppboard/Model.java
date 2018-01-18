package com.rigel.floppboard;

public class Model {
    private String title;
    private int image;

    public Model (String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

}
