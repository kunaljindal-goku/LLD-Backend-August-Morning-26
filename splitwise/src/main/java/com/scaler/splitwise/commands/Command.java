package com.scaler.splitwise.commands;

public interface Command {

    boolean matches(String command);
    void execute(String command);
}
