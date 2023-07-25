package com.example.splitwise_july.commands;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RegisterUserCommand implements Command{

    /**
     Register vinsmokesanji 003 namisswwaann
     u1 is registering with the username "vinsmokesanji", phone "003" and password as "namisswwaann"
     */

    @Override
    public boolean matches(String input) {
        List<String> words = new ArrayList<>();
        words = Arrays.stream(input.split(" ")).toList();

        //if(words.size() == 4 && words.get(0).equalsIgnoreCase("Register"))    ,no hardcoding of strings,for constants use interface
        // to avoid outOfBoundError check size before fetching any container/object
        if(words.size()==4 && words.get(0).equalsIgnoreCase(CommandKeywords.REGISTER_USER))
            return true;
        return false;

    }

    @Override
    public void execute(String input) {
        //checking again to make sure execute is called only after matches is called.
        // cant use flag, won't work if same object is used to call methods repetitively
        // cant use semaphores as it will hamper performance of using methods of the object concurrently,
        // also t1 calling matches followed by t2 calling execute on diff string will also lead to failure.
        if (!matches(input)) {
            throw new IllegalArgumentException("Invalid input format for RegisterUserCommand");
        }

        // Proceed with the execution logic for RegisterUserCommand
        List<String> words = Arrays.stream(input.split(" ")).toList();
        String username = words.get(1);
        String phone = words.get(2);
        String password = words.get(3);

        // calls the constructor ( through DTOs)
    }

    }

