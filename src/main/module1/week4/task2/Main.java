package main.module1.week4.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a message >>>");
        String userMessage = scanner.nextLine();
        System.out.println("Input a Data type >>>");
        String dataType = scanner.nextLine();

        System.out.printf("%s: %s -> %s: %s",
                userMessage,
                userMessage.getClass().getSimpleName(),
                valueCalculation(userMessage, dataType),
                valueCalculation(userMessage, dataType).getClass().getSimpleName()
                );
    }

    public static Object valueCalculation(String message, String dataType) {
        switch (dataType) {
            case "Integer" -> {
                try {
                    return Integer.valueOf(message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            } case "Float" -> {
                try {
                    return Float.valueOf(message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            } case "Double" -> {
                try {
                    return Double.valueOf(message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            } case "Character" -> {
                try {
                    return new char[message.length()];
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } case "Byte" -> {
                try {
                    return Byte.valueOf(message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            } case "Short" -> {
                try {
                    return Short.valueOf(message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            } case "Long" -> {
                try {
                    return Long.valueOf(message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            } case "Boolean" -> {
                try {
                    return Boolean.valueOf(message);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            default -> {
                return message;
            }
        }
    }
}



