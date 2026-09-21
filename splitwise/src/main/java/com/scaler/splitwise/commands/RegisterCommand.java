package com.scaler.splitwise.commands;

import org.springframework.stereotype.Component;

@Component
public class RegisterCommand implements Command{
    @Override
    public boolean matches(String command) {
        String tokens[] = command.split(" ");
        if(tokens[0].equalsIgnoreCase("register"))
            return true;
        return false;
    }

    @Override
    public void execute(String command) {
        String tokens[] = command.split(" ");
        if(tokens[0].equals("register")) {
            // register api
        }
    }
}
