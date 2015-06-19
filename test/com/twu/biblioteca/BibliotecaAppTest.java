package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

/**
 * Created by angoh on 6/17/15.
 */
public class BibliotecaAppTest {
    private BufferedReader reader;
    private PrintStream printStream;
    private Biblioteca biblioteca;
    private List<Book> books;
    private Menu menu;
    private BibliotecaApp bibliotecaApp;

    @Before
    public void setUp() throws IOException {
        reader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        books = new ArrayList<Book>();
//        biblioteca = mock(Biblioteca.class);
        menu = mock(Menu.class);
        when(reader.readLine()).thenReturn("list books");
        bibliotecaApp = new BibliotecaApp(printStream, menu);
    }

    @Test
    public void testWelcomeMessagePrints()  {
        bibliotecaApp.start();

        verify(printStream).println("Welcome to Biblioteca!");
    }

    @Test
    public void shouldDisplayMenuOnStart(){
        when(menu.isStillAlive()).thenReturn(true).thenReturn(false);
        bibliotecaApp.start();

        verify(menu).displayMenu();
    }

    @Test
    public void shouldQuit(){
        bibliotecaApp.start();

        assertTrue(bibliotecaApp.quit());
    }
}
