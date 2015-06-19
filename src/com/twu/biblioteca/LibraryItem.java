package com.twu.biblioteca;

import java.io.PrintStream;

/**
 * Created by angoh on 6/19/15.
 */
public class LibraryItem {
    protected String title;
    protected String author;
    protected String yearPublished;
    protected boolean checkedOut;

    public LibraryItem(String title, String author, String yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        checkedOut = false;
    }

    public LibraryItem() {
    }

    public String title() {
        return this.title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public boolean checkIn() {
        if (isCheckedOut()) {
            checkedOut = false;
            return true;
        }
        return false;
    }

    public void printDetails(PrintStream printStream) {
        printStream.format("%20s %20s %20s\n", title, author, yearPublished);
    }

}
