package com.twu.biblioteca.Commands;

import com.twu.biblioteca.Biblioteca;

public class ListBookCommand implements Command {

    private Biblioteca biblioteca;

    public ListBookCommand(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void execute() {
        biblioteca.listBooks();
    }
}
