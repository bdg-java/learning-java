package com.classwork8;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter and the Chamber of Secrets", new Author("Joanne", "Rowling"), 56);
        System.out.println(book);
    }
}
