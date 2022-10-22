package main.java.module2.week5.task3.a;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        System.out.println("Введите количество элементов: ");
        int count = inputInt.nextInt();
        String[] arrStr = new String[count];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < count; i++) {
            arrStr[i] = inputStr.nextLine();
        }

        System.out.printf("Результат: %s", removeDuplicates(arrStr).
                toString().
                replaceAll("^\\[|]$", ""));
    }

    public static LinkedHashSet<String> removeDuplicates(String[] arr)
    {
        return new LinkedHashSet<>(Arrays.asList(arr));
    }
}
