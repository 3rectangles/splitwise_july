package com.example.splitwise_july.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommandRegistry {

    private final RegisterUserCommand registerUserCommand;
    private final UpdateProfileCommand updateProfileCommand;
    private final List< Command > commands;

    //@Autowired
    @Autowired
    public CommandRegistry( RegisterUserCommand registerUserCommand,
                            UpdateProfileCommand updateProfileCommand) {
        this.registerUserCommand = registerUserCommand;
        this.updateProfileCommand = updateProfileCommand;
        // instead of creating object yourself use dependency injection as much as u can
        commands = new ArrayList<>();
        commands.add(registerUserCommand);
        commands.add(updateProfileCommand);
    }

    public void execute( String input){
        for( Command command: commands)
        {
            if(command.matches(input))
            {
                command.execute(input);
                break;
            }
        }
    }
}
