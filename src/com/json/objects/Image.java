package com.json.objects;

public final class Image implements Url, Sized {

    private final String url;
    private final int width;
    private final int height;

    public Image(final String url, final int width, final int height) {
        this.url = url;
        this.width = width;
        this.height = height;
    }

    @Override
    public String url() {
        return this.url;
    }

    @Override
    public int width() {
        return this.width;
    }

    @Override
    public int height() {
        return this.height;
    }

    @Override
    public String toString() {
        return "Image{" +
                "url='" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
