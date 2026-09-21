package com.scaler.splitwise.commands;

import org.springframework.stereotype.Component;

@Component
public class SettleUpCommand implements Command{
    @Override
    public boolean matches(String command) {
        // validations around string
        String tokens[] = command.split(" ");
        if(tokens[0].equalsIgnoreCase("settleup"))
            return true;
        return false;
    }

    @Override
    public void execute(String command) {
        String tokens[] = command.split(" ");
        if(tokens[1].equals("group")) {
            // call group settle up api
        }
        else if(tokens[1].equals("user")) {
            // call user settle up api
        }
    }
}
