package module2.week5.task1.b;

import util.Util;

import java.util.*;

public class Stonks {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String s = inputScanner.nextLine();

        List<String> myList = new ArrayList<>(Arrays.asList(s.split(",")));
        List<Integer> result = Util.convertListStringToIntegerList(myList);

        System.out.println(maxProfit(result));
    }

    private static int maxProfit(List<Integer> intList) {

        if (intList.size() < 2) {
            System.out.println("Получение прибыли требует как минимум двух цен в массиве");
            System.exit(1);
        }

        int minIndex = intList.indexOf(Collections.min(intList)); // Индекс минимального значения
        int maxPrice = Collections.min(intList);
        int minPrice = Collections.min(intList);

        for (int i = minIndex; i < intList.size(); i ++) {
            if (maxPrice <= intList.get(i)) maxPrice = intList.get(i);
        }

        return maxPrice - minPrice;
    }
}
