package com.twu.biblioteca.Commands;

import com.twu.biblioteca.Biblioteca;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class CheckoutMovieCommandTest {

    @Test
    public void shouldCheckoutMovieWhenExecuteIsCalled() throws IOException {
        Biblioteca biblioteca = mock(Biblioteca.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        CheckoutMovieCommand checkoutMovieCommand = new CheckoutMovieCommand(biblioteca, bufferedReader);
        when(bufferedReader.readLine()).thenReturn("book");

        checkoutMovieCommand.execute();

        verify(biblioteca).checkoutMovie("book");
    }
}