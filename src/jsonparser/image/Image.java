package jsonparser.image;

public class Image implements Sized {

       private String url;
       private double width;
       private double height;

    public Image(String url, double width, double height) {
        this.url = url;
        this.width = width;
        this.height = height;
    }

    @Override
    public double width() {
        return this.width;
    }

    @Override
    public double height() {
        return this.height;
    }

    public String url(){
        return this.url;
    }
}
