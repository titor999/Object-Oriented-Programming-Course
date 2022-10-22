package module2.week5.task2.a;

import java.util.*;

// здесь был count2
public class Dictionary {

    public static void main(String[] args) {
        Scanner scannerWords = new Scanner(System.in);
        Scanner scannerCountLines = new Scanner(System.in);

        System.out.println("Input a count lines >>>");
        int count = scannerCountLines.nextInt();

        System.out.println("Input lines >>>");

        Map<String, List<String>> map = getStringListMap(scannerWords, count);

        System.out.println(map.size());
        map.forEach((key, value) -> System.out.printf("%s - %s\n", key, value.toString().replaceAll("[\\[\\]]", "")));
    }

    private static Map<String, List<String>> getStringListMap(Scanner scannerWords, int count) {
        Map<String, List<String>> map = new TreeMap<>();

        for (int i = 0; i < count; i++) {
            String dictionary = scannerWords.nextLine();
            List<String> latinWordsDictionary = getLatinWords(dictionary);

            for (int j = 1; j < latinWordsDictionary.size(); j++) {
                map.computeIfAbsent(latinWordsDictionary.get(j), k -> new ArrayList<>()).add(latinWordsDictionary.get(0));
            }
        }
        return map;
    }

    private static List<String> getLatinWords(String input) {
        return Arrays.asList(input.replace(" -", ",").split(", "));
    }
}

