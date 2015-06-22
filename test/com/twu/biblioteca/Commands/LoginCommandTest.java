package com.twu.biblioteca.Commands;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.User;
import org.junit.Test;

import java.io.BufferedReader;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LoginCommandTest {

    @Test
    public void shouldLoginWhenExecuteIsCalled(){
        User user = mock(User.class);
        BufferedReader bufferedReader = mock()
        LoginCommand loginCommand = new LoginCommand(user);

        loginCommand.execute();

        verify(user).login();
    }

}