package module2.week5.task2.b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class Customers {
    public static void main(String[] args) throws IOException {
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.println("Введите абсолютный путь до файла: ");
            String src = inputScanner.nextLine();
            Map<String, Map<String, Integer>> result = getDataBase(src);


            result.forEach((key, value) -> {
                System.out.printf("%s:\n", key);
                value.forEach((key1, value1) -> System.out.printf("%s %s\n", key1, value1));
            });
        } catch (IOException e) {
            System.out.println("Неверный путь");
            System.exit(1);
        }

    }

    public static Map<String, Map<String, Integer>> getDataBase(String src) throws IOException {
        Map<String, Map<String, Integer>> map = new TreeMap<>();
        BiFunction<Integer, Integer, Integer> bFunc = Integer::sum;
        FileReader fileReader = new FileReader(src);
        BufferedReader rd = new BufferedReader(fileReader);
        String[] symbols;
        String line;
        while ((line = rd.readLine()) != null) {
            symbols = line.split(" ");
            int value = Integer.parseInt(symbols[2]);

            if (map.containsKey(symbols[0])) {
                map.get(symbols[0]).merge(symbols[1], value, bFunc);
            } else {
                map.put(symbols[0], new TreeMap<>());
                map.get(symbols[0]).merge(symbols[1], value, bFunc);
            }
        }
        rd.close();
        fileReader.close();
        return map;
    }
}
