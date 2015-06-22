package com.twu.biblioteca;

import com.twu.biblioteca.Commands.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BibliotecaApp {

    private Menu menu;
    private PrintStream printStream;

    public BibliotecaApp(PrintStream printStream, Menu menu) {
        this.printStream = printStream;
        this.menu = menu;
    }

    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(ir);
        PrintStream printStream = System.out;

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry Potter", "JK Rowling", "2000"));
        books.add(new Book("Twilight", "Stephanie Myers", "2000"));
        books.add(new Book("Native Son", "Richard Wright", "2000"));
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Harry Potter", "JK Rowling", "2000", "86"));
        movies.add(new Movie("Twilight", "Stephanie Myers", "2000", "5"));
        movies.add(new Movie("Seventh Son", "Richard Wright", "2000", "76"));
        User user = new User();
        Biblioteca biblioteca = new Biblioteca(printStream, books, movies);

        Map<String, Command> commandMap = new HashMap<String, Command>();

        commandMap.put("list books", new ListBookCommand(biblioteca));
        commandMap.put("list movies", new ListMovieCommand(biblioteca));
        commandMap.put("checkoutBook movie", new CheckoutMovieCommand(biblioteca,bufferedReader));
        commandMap.put("checkoutBook book", new CheckoutBookCommand(biblioteca,bufferedReader));
      //  commandMap.put("return book", ReturnBookCommand);

        Menu menu = new Menu(System.out, biblioteca, bufferedReader, user);
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
