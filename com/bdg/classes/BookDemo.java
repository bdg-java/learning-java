package com.bdg.classes;

public class BookDemo {
    public static void main(String[] args) {
//        Author author = new Author(" Russel","Winderand");
        Book book = new Book("Developing Java Software",new Author(" Russel","Winderand"),79.75);
        System.out.println(book);
    }
}
