package com.example.splitwise_july;

import com.example.splitwise_july.commands.Command;
import com.example.splitwise_july.commands.RegisterUserCommand;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SplitwiseJulyApplication  implements CommandLineRunner {

    private final Scanner  sc;
    private RegisterUserCommand registerUserCommand;

    @Autowired
    public SplitwiseJulyApplication( RegisterUserCommand registerUserCommand) {
        sc= new Scanner(System.in);
        this.registerUserCommand=registerUserCommand;
    }

    @Override
    public void run(String... args) throws Exception {
        String input =  sc.nextLine();
        while(true){
            System.out.println("enter the command");
            String inpuut =sc.nextLine();
            registerUserCommand.execute(input);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseJulyApplication.class, args);
    }
}


//    private final List<Command> commands;

//    public SplitwiseJulyApplication() {
//        sc= new Scanner(System.in);
//        commands =new ArrayList<>();
//        commands.add(new RegisterUserCommand());
//        //commands.add(new UpdateProfileCommand());
//        //adding more commands will be hassle. and adding more commands will violate SRE principle
//        // use registry that stores the list of all commands and registry provide way for anyone to execute commands
//        // its much like facade ( adding intermediate layer)
//
//    }


//    @Override
//    public void run(String... args) throws Exception {
//        String input =  sc.nextLine();
//        while(true){
//            System.out.println("enter the command");
//            String inpuut =sc.nextLine();
//            for( Command command: commands)
//            {
//                if( command.matches(input))
//                {
//                    command.execute(input);
//                    break;
//                }
//
//            }
//        }
//    }
