package com.twu.biblioteca.Commands;

import com.twu.biblioteca.Biblioteca;

import java.io.BufferedReader;
import java.io.IOException;

public class ReturnBookCommand implements Command {
    private Biblioteca biblioteca;
    private BufferedReader bufferedReader;

    public ReturnBookCommand(Biblioteca biblioteca, BufferedReader bufferedReader) {
        this.biblioteca = biblioteca;
        this.bufferedReader = bufferedReader;
    }

    @Override
    public void execute() {
        try {
            biblioteca.returnBook(bufferedReader.readLine());
        } catch (IOException e) {}
    }
}
