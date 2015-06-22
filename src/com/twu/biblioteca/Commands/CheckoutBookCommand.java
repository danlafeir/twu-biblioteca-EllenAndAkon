package com.twu.biblioteca.Commands;

import com.twu.biblioteca.Biblioteca;

import java.io.BufferedReader;
import java.io.IOException;

public class CheckoutBookCommand implements Command {
    private Biblioteca biblioteca;
    private BufferedReader bufferedReader;

    public CheckoutBookCommand(Biblioteca biblioteca, BufferedReader bufferedReader) {
        this.biblioteca = biblioteca;
        this.bufferedReader = bufferedReader;
    }

    @Override
    public void execute() {
        try {
            biblioteca.checkoutBook(bufferedReader.readLine());
        } catch (IOException e) {}
    }
}
