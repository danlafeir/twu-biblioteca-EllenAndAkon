package com.twu.biblioteca.Commands;

import com.twu.biblioteca.Biblioteca;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class ReturnBookCommandTest {

    @Test
    public void shouldReturnBookWhenExecuteIsCalled() throws IOException {
        Biblioteca biblioteca = mock(Biblioteca.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        ReturnBookCommand returnBookCommand = new ReturnBookCommand(biblioteca,bufferedReader);
        when(bufferedReader.readLine()).thenReturn("book");

        returnBookCommand.execute();

        verify(biblioteca).returnBook("book");
    }

}