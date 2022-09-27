package week2.task2.b;

import java.util.Scanner;

public class Sqrt {
    static void sqrt(double a) {
        double b = a;
        int i = 0;
        while ((b*b > a) && (i < 200)) {
            b = (b+ a/b) / 2;
            i++;
        }
        System.out.println(b);
    }


    public static void main(String[] args) {
        System.out.println("Input an integer>>>");
        Scanner scanner = new Scanner(System.in);
        double integer = scanner.nextDouble();

        sqrt(integer);
    }
}
