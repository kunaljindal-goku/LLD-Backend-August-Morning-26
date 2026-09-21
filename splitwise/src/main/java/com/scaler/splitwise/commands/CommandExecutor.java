package com.scaler.splitwise.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandExecutor {

    private List<Command> commands;

    @Autowired // autoamtically adds all the command which have @component written on them
    public CommandExecutor(List<Command> commands) {
        this.commands = commands;
    }

    public void executeCommand(String inputCommand) {
        for(Command command: commands) {
            if(command.matches(inputCommand)) {
                command.execute(inputCommand);
            }
        }
    }
}
