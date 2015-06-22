package com.twu.biblioteca.Commands;

import com.twu.biblioteca.Biblioteca;

import java.io.BufferedReader;
import java.io.IOException;

public class CheckoutMovieCommand implements Command {
    private Biblioteca biblioteca;
    private BufferedReader bufferedReader;

    public CheckoutMovieCommand(Biblioteca biblioteca, BufferedReader bufferedReader) {
        this.biblioteca = biblioteca;
        this.bufferedReader = bufferedReader;
    }

    @Override
    public void execute() {
        try {
            biblioteca.checkoutMovie(bufferedReader.readLine());
        }
        catch (IOException e) {}
    }
}
