package module1.week2.task2.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input a pyramid height:");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Left Pattern
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("#");
            }

            // Space between left and right pyramids
            System.out.print(" ");

            // Right Pattern
            System.out.println("#".repeat(i));
        }
    }
}
