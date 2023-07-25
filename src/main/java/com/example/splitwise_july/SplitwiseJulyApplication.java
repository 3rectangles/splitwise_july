package com.example.splitwise_july;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitwiseJulyApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseJulyApplication.class, args);
    }

    private Scanner  sc = new Scanner(System.in);

    @Override
    public void run(String... args) throws Exception {
        String input =  sc.nextLine();


    }
}
