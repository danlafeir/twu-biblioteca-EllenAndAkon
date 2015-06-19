package com.twu.biblioteca;

import java.io.*;
import java.nio.Buffer;
import java.util.List;
import java.util.Scanner;

/**
 * Created by egalperi on 6/16/15.
 */
public class Biblioteca {

    private PrintStream printStream;
    private List<Book> books;
    private List<Movie> movies;

    public Biblioteca(PrintStream printStream, List<Book> books, List<Movie> movies) {
        this.printStream = printStream;
        this.books = books;
        this.movies = movies;
    }

    public void listBooks() {
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                book.printDetails(printStream);
            }
        }
        printStream.println("");
    }

    public boolean checkout(String bookTitle) {
        for (Book book : books) {
            if (book.title().equalsIgnoreCase(bookTitle)) {
                if (book.isCheckedOut()) {
                    return false;
                }
                book.checkOut();
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(Book book) {
        return book.checkIn();
    }

    public boolean returnBook(String bookTitle) {
        for (Book book : books) {
            if (book.title().equalsIgnoreCase(bookTitle)) {
                return returnBook(book);
            }
        }
        return false;
    }

    public void listMovies() {
        for (Movie movie : movies) {
            if (!movie.isCheckedOut()) {
                movie.printDetails(printStream);
            }
        }
        printStream.println("");
    }

    public boolean checkoutMovie(String movieTitle) {
        for(Movie movie: movies){
            if(movie.title().equalsIgnoreCase(movieTitle)){
                if(movie.isCheckedOut()){
                    return false;
                }
                movie.checkOut();
                return true;
            }
        }
        return false;
    }
}
