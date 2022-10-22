package main.java.module2.week5.task1.c;
import main.resources.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WaterContainer {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String s = inputScanner.nextLine();

        List<String> myList = new ArrayList<>(Arrays.asList(s.split(",")));
        List<Integer> result = Util.convertListStringToIntegerList(myList);

        System.out.println(maxArea(result));
    }

    public static int maxArea(List<Integer> height) {
        int maxArea = 0, left = 0, right = height.size() - 1;
        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height.get(left), height.get(right)) * (right - left));
            if (height.get(left) < height.get(right))
                left++;
            else
                right--;
        }
        return maxArea;
    }
}
