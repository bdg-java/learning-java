package com.bdg.jsonHomework.Thumbnail;

public class Image {
    private String url;
    private float height;
    private float width;

    Image(String url, float height, float width){
        this.url = url;
        this.height = height;
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public String getUrl() {
        return url;
    }
}
