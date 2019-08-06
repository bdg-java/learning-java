package ahakobyan.classLessons.homeworkOfClasses;

public class Book {

    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public Author author() {
        return this.author;
    }

    public String toString() {
        return "Book: "+this.title+", "+this.author+","+this.price+"";
    }
}
