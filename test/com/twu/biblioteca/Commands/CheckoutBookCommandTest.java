package com.twu.biblioteca.Commands;

import com.twu.biblioteca.Biblioteca;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CheckoutBookCommandTest {

    @Test
    public void shouldCallCheckoutBookWhenExecuteIsCalled() throws IOException {
            Biblioteca biblioteca = mock(Biblioteca.class);
            BufferedReader bufferedReader = mock(BufferedReader.class);
            CheckoutBookCommand checkoutBookCommand = new CheckoutBookCommand(biblioteca, bufferedReader);
            when(bufferedReader.readLine()).thenReturn("book");

            checkoutBookCommand.execute();

            verify(biblioteca).checkoutBook("book");
    }
}