package Lab11;

import java.util.ArrayList;
import java.util.List;

public class Ex07 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orangeeee");
        strings.add("grape");
        strings.add("pineapple");

        int minLength = 6;
        List<String> filteredStrings = filterStringsByLength(strings, minLength);
        System.out.println("Строки длиннее " + minLength + " символов: " + filteredStrings);
    }

    public static List<String> filterStringsByLength(List<String> strings, int minLength) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.length() > minLength) {
                result.add(str);
            }
        }
        return result;
    }
}