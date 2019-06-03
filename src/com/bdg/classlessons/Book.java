package com.bdg.classlessons;

public class Book {

    private String title;
    private Author author;
    private double price;

    public Book(String title, String name, double price) {
        this.title = title;
        author = new Author(name, name);
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Book title: " + title + " price: " + price +
                " authorName: " + author.getFirstName();
    }
}
