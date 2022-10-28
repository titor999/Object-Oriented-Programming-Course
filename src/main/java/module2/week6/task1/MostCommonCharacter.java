package module2.week6.task1;

import java.util.*;

public class MostCommonCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] split = s.replaceAll("'", "").split("");
        Map<String, Long> map = new TreeMap<>();

        mapPutValues(split, map);

        System.out.printf("['%s', %s]", getString(map), map.get(getString(map)));
    }

    private static String getString(Map<String, Long> map) {
        return map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
    }

    private static void mapPutValues(String[] split, Map<String, Long> map) {
        for (String str: split) {
            long count = Arrays.stream(split).filter(p -> p.equals(str)).count();
            map.put(str, count);
        }
    }
}

