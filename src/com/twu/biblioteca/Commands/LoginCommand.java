package com.twu.biblioteca.Commands;

import com.twu.biblioteca.User;

public class LoginCommand implements Command {
    private User user;

    public LoginCommand(User user) {
        this.user = user;
    }

    @Override
    public void execute() {}
}
