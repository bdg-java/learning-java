package jsonparser.image;

public class Thumbnail {
    private String id;
    private String type;
    private String name;
    private Image image;
    private ThumbnailImage thumbnail;

    public Thumbnail(String id, String type, String name, Image image, ThumbnailImage thumbnail) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.image = image;
        this.thumbnail = thumbnail;
    }
}
