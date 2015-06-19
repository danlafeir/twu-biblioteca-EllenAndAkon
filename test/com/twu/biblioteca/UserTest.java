package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by angoh on 6/19/15.
 */
public class UserTest {

    @Test
    public void shouldReturnTrueWhenCredentialsMatchHardCodedValues(){
        User user = new User();

        boolean valueToCheck = user.login("123-4567","foobar");

        assertThat(valueToCheck,is(true));
    }

    @Test
    public void shouldReturnFalseWhenCredentialsDontMatchHardCodedValues(){
        User user = new User();

        boolean valueToCheck = user.login("23-4567","foobar");

        assertThat(valueToCheck,is(false));
    }
}