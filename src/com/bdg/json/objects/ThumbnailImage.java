package com.bdg.json.objects;


/**
 * @author William Arustamyan
 */


public final class ThumbnailImage implements Url, Sized {

    private final Image image;

    public ThumbnailImage(final Image image) {
        this.image = new Image(image.url(), image.width(), image.height());
    }

    @Override
    public String url() {
        return image.url();
    }

    @Override
    public int width() {
        return image.width();
    }

    @Override
    public int height() {
        return image.height();
    }
}
