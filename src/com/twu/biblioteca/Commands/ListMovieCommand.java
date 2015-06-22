package com.twu.biblioteca.Commands;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.User;

public class ListMovieCommand implements Command {
    private Biblioteca biblioteca;

    public ListMovieCommand(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void execute() {
        biblioteca.listMovies();
    }
}
