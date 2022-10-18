package main.module2.week5.task1c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a listArray >>>");
        String s = scanner.nextLine();
        System.out.println(convertListStringToIntegerList(convertStringToList(s)));
    }

    // работает только либо без пробелов либо с пробелами
    private static List<String> convertStringToList(String s) {
        try {
            return Arrays.asList(s.substring(1, s.length() - 1).split(", "));
        } catch (NumberFormatException e) {
            return Arrays.asList(s.substring(1, s.length() - 1).split(","));
        }

    }

    private static List<Integer> convertListStringToIntegerList(List<String> stringList) {
        List<Integer> intList = new ArrayList<>();
        for(String s : stringList) intList.add(Integer.valueOf(s));
        return  intList;
    }
}

