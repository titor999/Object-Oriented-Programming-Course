package main.java.module1.week2.task3.c;

import main.java.module1.week2.task3.b.MergeSort;

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int[] arrayNumber = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arrayNumber[i] = s.nextInt();
        }

        // Merge sort from main.java.module1.week2/task3/b/MergeSort.java
        MergeSort.mergeSort(arrayNumber, arrayNumber.length);

        double median;
        if (arrayNumber.length % 2 == 0)
            median = ((double)arrayNumber[arrayNumber.length/2] + (double)arrayNumber[arrayNumber.length/2 - 1])/2;
        else
            median = arrayNumber[arrayNumber.length/2];

        System.out.println(median);
    }
}
