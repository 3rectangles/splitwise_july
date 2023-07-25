package com.example.splitwise_july.commands;

// every command has two functions
public interface Command {
    // check if string matches the pattern of this command
    boolean matches( String input);
    // execute the command
    void execute( String input);
}
