package main.java.module1.week3.task1.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Введите строку для поиска >>>");
        String findStr = scannerString.nextLine();

        System.out.println("Введите колличество строк >>>");
        int stringCount = scannerInt.nextInt();

        StringBuilder str = new StringBuilder();
        System.out.println("Введите строки в которых буде происходить поиск >>>");

        for (int i = 0; i < stringCount; i++) {
            String stringForSearch = scannerString.nextLine();
            str.append(stringForSearch);
        }

        int count = countSubstring(str.toString(), findStr);
        System.out.println(count);
    }

    public static int countSubstring(String str, String target) {
        return (str.split(target, -1).length) - 1;
    }
}
