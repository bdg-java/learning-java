package com.bdg.person;


/**
 * @author William Arustamyan
 */


public class Book {

    private String title;

    private String[] authors;

    private int currentAuthorSize = 0;

    public String getTitle() {
        return this.title;
    }

    public String[] getAuthors() {
        return this.authors;
    }

    //Es mi qich hetaqrqracrel em es methody :)
    public void addAuthors(String name) {

        int maxAuthorCount = 10;
        if (this.authors == null) {
            this.authors = new String[maxAuthorCount];
            this.authors[0] = name;
            this.currentAuthorSize++;
            return;
        }

        if (this.currentAuthorSize != maxAuthorCount) {
            this.authors[this.currentAuthorSize] = name;
            this.currentAuthorSize++;
        }


    }

}
