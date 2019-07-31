package com.bdg.agharibyan.jsonwithcorrectstructure.objects;

public class ThumbnailImage implements Sized, Url { //interfacei hertakanutyan tarberutyun ka(te vorn arajiny kgrem)?

    private final Image image;

    public ThumbnailImage(final Image image) {
        this.image = new Image(image.url(), image.width(), image.height());
    }

    @Override
    public int width() {
        return image.width();
    }

    @Override
    public int height() {
        return image.height();
    }

    @Override
    public String url() {
        return image.url();
    }
}
