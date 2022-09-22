package week1.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input a length an edge of icosahedron:");
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        // This is a search formula for an icosahedron volume
        double V = 5 * Math.pow(a, 3) / 12 * (3 + Math.sqrt(5));

        System.out.printf("V = %s cm3", V);
    }
}
