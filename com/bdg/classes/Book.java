package com.bdg.classes;

public class Book {
    private String title;
    private Author author;
    private double price;

    public Book(String title, Author name,double price) {
        this.title = title;
        this.price = price;
        author = name;
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

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book " + "title : " + title + " " + ", author =" + author + ", price = " + price ;
    }
}
