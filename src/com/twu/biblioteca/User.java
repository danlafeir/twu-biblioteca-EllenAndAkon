package com.twu.biblioteca;

/**
 * Created by angoh on 6/19/15.
 */
public class User {
    public static final String LIBRARY_NUMBER = "123-4567";
    public static final String PASSWORD = "foobar";
    private boolean isLoggedIn;

    public User() {
        isLoggedIn = false;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public boolean login(String libraryNumber, String password) {
        isLoggedIn = libraryNumber.equals(LIBRARY_NUMBER) && password.equals(PASSWORD);
        return isLoggedIn();
    }
}
