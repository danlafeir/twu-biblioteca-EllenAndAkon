package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by angoh on 6/19/15.
 */
public class LibrarianTest {

    @Test
    public void shouldReturnTrueWhenCredentialsMatchHardCodedValues(){
        Librarian librarian = new Librarian();

        boolean valueToCheck = librarian.login("123-4567","foobar");

        assertThat(valueToCheck,is(true));
    }

    @Test
    public void shouldReturnFalseWhenCredentialsDontMatchHardCodedValues(){
        Librarian librarian = new Librarian();

        boolean valueToCheck = librarian.login("23-4567","foobar");

        assertThat(valueToCheck,is(false));
    }
}