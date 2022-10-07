package week3.task2.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner repeat_scanner = new Scanner(System.in);

        System.out.println("Enter a string >>>");
        String repeat = repeat_scanner.nextLine();

        System.out.println(funcRepeat(repeat));
    }
    public static String funcRepeat(String str) {
        str = str.replaceAll("([а-яa-z])\\1{2,}", "$1");

        return str;
    }
}
