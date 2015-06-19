package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryItemTest {

    private String title;
    private String author;
    private String yearPublished;
    private LibraryItem book;

    @Before
    public void setUp() {
        title = "Book Title";
        author = "Author";
        yearPublished = "2000";
        book = new Book(title, author, yearPublished);
    }

    @Test
    public void shouldPrintDetails() {
        PrintStream printStream = mock(PrintStream.class);
        book.printDetails(printStream);
        verify(printStream).format(anyString(), eq(title), eq(author), eq(yearPublished));
    }

    @Test
    public void shouldReturnTrueWhenCheckedOut() {
        book.checkOut();
        assertTrue(book.isCheckedOut());
    }

    @Test
    public void shouldReturnTrueWhenReturned() {
        book.checkOut();
        assertTrue(book.checkIn());
    }

}
