package com.bdg;

public class Book {
    String title;
    String author;
    Double price;

    public Book(String title, String author, Double price){
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double getAuthor() {
        double auth = Double.parseDouble(author);
        return auth;
    }

    public double getTitle() {
        double titl = Double.parseDouble(title);
        return titl;
    }


    public String toString(){
        return "["+"Autor:"+ author + "Title:" + title + "Price"+ price+"]";
    }
}
