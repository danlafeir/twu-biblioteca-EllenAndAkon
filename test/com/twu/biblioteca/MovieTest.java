package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by angoh on 6/19/15.
 */
public class MovieTest {

    private String title;
    private String author;
    private String yearPublished;
    private String rating;

    @Before
    public void setUp(){
        title = "Jurassic World";
        author = "Akon";
        yearPublished = "2015";
        rating = "9";
    }

    @Test
    public void shouldPrintDetails() {
        PrintStream printStream = mock(PrintStream.class);
        LibraryItem movie = new Movie(title, author, yearPublished, rating);
        movie.printDetails(printStream);
        verify(printStream).format(anyString(), eq(title), eq(author), eq(yearPublished), eq(rating));
    }


}
