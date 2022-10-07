package week3.task1.c;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sensor reading >>>");
        String sensorPackage = scanner.nextLine();

        System.out.println("How to sort? (by height id - 1 / by average temperature rise - 2) >>>");
        int sortingOption = scanner.nextInt();

        Integer[][] result = OutputReadings(sensorPackage);
        switch (sortingOption) {
            case 1 -> {
                Arrays.sort(result, Comparator.comparingInt(o -> o[0]));
                for (Integer[] integers : result) System.out.println(integers[0] + " " +
                        Double.parseDouble(String.valueOf(integers[1])));
            }
            case 2 -> {
                Arrays.sort(result, Comparator.comparingInt(o -> o[1]));
                for (Integer[] integers : result) System.out.println(integers[0] + " " +
                        Double.parseDouble(String.valueOf(integers[1])));
            }
        }
    }

    public static Integer[][] OutputReadings(String readings) {
        String[] text = readings.split("@");
        Integer[][] output = new Integer[text.length][2];

        for (int i = 0; i < text.length; i++){
            output[i][0] = Integer.parseInt(text[i].substring(0, 2));
            output[i][1] = Integer.parseInt(text[i].substring(2));
        }
        return output;
    }
}