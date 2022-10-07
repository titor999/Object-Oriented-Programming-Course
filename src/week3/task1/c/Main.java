package week3.task1.c;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sensor reading >>>");
        String sensorPackage = scanner.nextLine();

        System.out.println("How to sort? (by height id - 1 / by average temperature rise - 2) >>>");
        int sortingOption = scanner.nextInt();

        String[] arr = GetSensorPackage(sensorPackage, sortingOption);
        for (String s: arr) {
            System.out.println(s);
        }
    }

    public static String[] GetSensorPackage(String sensorPackage, int sortingOption) {
        String[] arr = sensorPackage.split("@");

        switch (sortingOption) {
            case 1 -> {
                Arrays.sort(arr);
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = arr[i].substring(0, 2) + " " + Double.parseDouble(arr[i].substring(2));
                }
            }
            case 2 -> {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].length() == 3) {
                        arr[i] = " " + arr[i].substring(2) + arr[i].substring(0, 2);
                    } else {
                        arr[i] = arr[i].substring(2) + arr[i].substring(0, 2);
                    }
                }
                Arrays.sort(arr);
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = arr[i].substring(2) + " " + Double.parseDouble(arr[i].substring(0, 2));
                }
            }
        }
        return arr;
    }
}