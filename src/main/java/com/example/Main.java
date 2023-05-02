package com.example;

import com.example.Greetings.Greetings;
import com.example.Http.Client;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Argument passed is: " + Arrays.toString(args));
        System.out.println("Hello world! Please help me!");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input) {
            case "greet" -> {
                Greetings greetings = new Greetings();
                greetings.greet();
            }
            case "http" -> {
                Client client = new Client();
                String body1 = client.get("https://square.github.io/okhttp/");
                System.out.println(body1);
            }
            default -> System.out.println("Invalid argument passed");
        }
    }
}