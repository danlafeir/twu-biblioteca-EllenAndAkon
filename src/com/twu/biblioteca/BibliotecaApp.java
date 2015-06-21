package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class BibliotecaApp {

    private Menu menu;
    private PrintStream printStream;

    public BibliotecaApp(PrintStream printStream, Menu menu) {
        this.printStream = printStream;
        this.menu = menu;
    }

    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(ir);
        PrintStream printStream = System.out;

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry Potter", "JK Rowling", "2000"));
        books.add(new Book("Twilight", "Stephanie Myers", "2000"));
        books.add(new Book("Native Son", "Richard Wright", "2000"));
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Harry Potter", "JK Rowling", "2000", "86"));
        movies.add(new Movie("Twilight", "Stephanie Myers", "2000", "5"));
        movies.add(new Movie("Seventh Son", "Richard Wright", "2000", "76"));
        Librarian librarian = new Librarian();
        Biblioteca biblioteca = new Biblioteca(printStream, books, movies);

        Menu menu = new Menu(System.out, biblioteca, reader, librarian);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(printStream, menu);

        bibliotecaApp.start();
    }

    public void start() {
        printStream.println("Welcome to Biblioteca!");
        while (menu.isStillAlive()) {
            menu.displayMenu();
            menu.selectOption(menu.getUserInput());
        }

    }

}
