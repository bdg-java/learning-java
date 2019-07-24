package com.bdg.jsonHomework.Thumbnail;

public class Thumbnail_main {
    private String id;
    private String type;
    private String name;
    private Image images;
    private Thumbnail thumbnails;

    Thumbnail_main(String id, String type, String name, Thumbnail thumbnails, Image images){
        this.id= id;
        this.type = type;
        this.name = name;
        this.images =images;
        this.thumbnails = thumbnails;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Image getImages() {
        return images;
    }

    public Thumbnail getThumbnails() {
        return thumbnails;
    }

    public String getType() {
        return type;
    }


}
