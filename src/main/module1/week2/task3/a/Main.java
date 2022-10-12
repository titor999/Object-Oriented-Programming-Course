package main.module1.week2.task3.a;

import java.util.Scanner;

public class Main {
    static int largest(int[] arr) {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int[] arrayNumber = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arrayNumber[i] = s.nextInt();
        }

        System.out.println("Largest in given array is " + largest(arrayNumber));

        int count = 0;

        for (int j : arrayNumber) {
            if (j == largest(arrayNumber)) {
                count++;
            }
        }
        System.out.printf("count of numbers equal to the maximum is %s", count);
    }
}