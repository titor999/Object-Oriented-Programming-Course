package main.module1.week2.task1.a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            try {
                System.out.println("Введите целое число:");
                Scanner scanner = new Scanner(System.in);
                int year = scanner.nextInt();

                if (year == 1) {
                    System.out.println(year + " год");
                } else if (year >= 2 && year <= 4) {
                    System.out.println(year + " года");
                } else if (year >= 11 && year <= 20) {
                    System.out.println(year + " лет");
                } else if (year % 10 == 1) {
                    System.out.println(year + " год");
                } else if (year % 10 >= 2 && year % 10 <= 4) {
                    System.out.println(year + " года");
                } else
                    System.out.println(year + " лет");
            } catch (InputMismatchException e) {
                System.out.println("You inputted string value");
                System.exit(1);
            }
    }
}