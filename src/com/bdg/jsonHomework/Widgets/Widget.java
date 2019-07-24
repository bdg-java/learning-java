package com.bdg.jsonHomework.Widgets;


public class Widget {
    private String debug;
    private Window windows;
    private Image images;
    private Text texts;

    Widget(String debug, Window windows, Image images, Text texts){
        this.debug = debug;
        this.windows =windows;
        this.images = images;
        this.texts = texts;
    }

    public Image getImages() {
        return images;
    }

    public String getDebug() {
        return debug;
    }

    public Window getWindows() {
        return windows;
    }

    public Text getTexts() {
        return texts;
    }
}
