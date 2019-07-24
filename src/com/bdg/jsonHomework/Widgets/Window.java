package com.bdg.jsonHomework.Widgets;

public class Window {
    private String title;
    private String name;
    private float width;
    private float height;

    Window(String title, String name, float width, float height ){
        this.title = title;
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public String getTitle() {
        return title;
    }
}
