package jsonparser.image;

public class ThumbnailImage implements Sized {

    private Image image;

    public ThumbnailImage(Image image) {
        this.image = new Image(image.url(), image.width(), image.height());
    }

    @Override
    public double width() {
        return image.width();
    }

    @Override
    public double height() {
        return image.height();
    }

    public String url() {
        return image.url();
    }
}
