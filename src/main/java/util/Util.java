package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Util {
    public static List<String> convertStringToList(String s) {
        try {
            return Arrays.asList(s.substring(1, s.length() - 1).split(", "));
        } catch (NumberFormatException e) {
            return Arrays.asList(s.substring(1, s.length() - 1).split(","));
        }
    }

    public static List<Integer> convertListStringToIntegerList(List<String> stringList) {
        List<Integer> intList = new ArrayList<>();
        for(String s : stringList) intList.add(Integer.valueOf(s));
        return  intList;
    }
}
