package com.scaler.splitwise.commands;

import org.springframework.stereotype.Component;

@Component
public class DeleteUserCommand implements Command{
    @Override
    public boolean matches(String command) {
        return false;
    }

    @Override
    public void execute(String command) {
        // call delete api
    }
}
