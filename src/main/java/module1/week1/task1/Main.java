package main.java.module1.week1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What's your name?");

        // Here we create obj. type Scanner and give him Standard input stream
        Scanner scanner = new Scanner(System.in);
        String UserName = scanner.nextLine();

        System.out.printf("Hello, %s!", UserName);
    }
}
