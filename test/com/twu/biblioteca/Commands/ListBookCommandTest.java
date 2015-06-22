package com.twu.biblioteca.Commands;

import com.twu.biblioteca.Biblioteca;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ListBookCommandTest {

    @Test
    public void shouldListBooksWhenExecuteIsCalled(){
        Biblioteca biblioteca = mock(Biblioteca.class);
        ListBookCommand listBookCommand = new ListBookCommand(biblioteca);

        listBookCommand.execute();

        verify(biblioteca).listBooks();
    }
}