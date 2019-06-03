package com.lesson8;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book("Developing Java Software", new Author("Russel", "Winderand"), 56);
        System.out.println(book);
    }
}
