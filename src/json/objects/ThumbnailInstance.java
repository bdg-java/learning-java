package json.objects;

public class ThumbnailInstance {
    private String id;
    private ThumbnailType type;
    private String name;
    private Image image;
    private ThumbnailImage thumbnail;

    public ThumbnailInstance(String id, ThumbnailType type, String name, Image image, ThumbnailImage thumbnail) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.image = image;
        this.thumbnail = thumbnail;
        }
    public ThumbnailInstance() {

    }

    @Override
    public String toString() {
        return "id : " + this.id + ", type : " + this.type + ", name : " + this.name +
                ", image { " + this.image + " }" + ", thumbnails { " + this.thumbnail + " }";

    }
}
