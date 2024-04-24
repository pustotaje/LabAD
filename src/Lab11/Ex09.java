package Lab11;

import java.util.ArrayList;
import java.util.List;

public class Ex09 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple123");
        strings.add("banana");
        strings.add("orange456");
        strings.add("grape789");
        strings.add("pineapple");

        List<String> filteredStrings = filterAlphabeticStrings(strings);
        System.out.println("Строки, содержащие только буквы: " + filteredStrings);
    }

    public static List<String> filterAlphabeticStrings(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.matches("[a-zA-Z]+")) {
                result.add(str);
            }
        }
        return result;
    }
}