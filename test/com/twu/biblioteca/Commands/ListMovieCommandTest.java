package com.twu.biblioteca.Commands;

import com.twu.biblioteca.Biblioteca;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ListMovieCommandTest {

    @Test
    public void shouldListMoviesWhenExecuteIsCalled(){
        Biblioteca biblioteca = mock(Biblioteca.class);
        ListMovieCommand listBookCommand = new ListMovieCommand(biblioteca);

        listBookCommand.execute();

        verify(biblioteca).listMovies();
    }

}