package com.twu.biblioteca;

import java.io.PrintStream;

/**
 * Created by egalperi on 6/16/15.
 */
public class Movie extends LibraryItem {

    private String rating;

    public Movie(String title, String author, String yearPublished, String rating) {
        super(title, author, yearPublished);
        this.rating = rating;
    }

    @Override
    public void printDetails(PrintStream printStream) {
        printStream.format("%20s %20s %20s %20s\n", title, author, yearPublished, rating);
    }
}
