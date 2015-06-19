package com.twu.biblioteca;

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
    @Test
    public void shouldPrintDetails() {
        PrintStream printStream = mock(PrintStream.class);
        String title = "Jurassic World";
        String author = "Akon";
        String yearPublished = "2015";
        String rating = "9";
        LibraryItem movie = new Movie(title, author, yearPublished, rating);
        movie.printDetails(printStream);
        verify(printStream).format(anyString(), eq(title), eq(author), eq(yearPublished), eq(rating));
    }

}
