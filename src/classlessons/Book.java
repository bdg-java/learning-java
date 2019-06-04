package classlessons;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book (String title, Author name, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String toString() {
        return "Book: " + title + " , " + author + " , " + price + "";
    }
}
