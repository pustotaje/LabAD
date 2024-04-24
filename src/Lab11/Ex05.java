package Lab11;

import java.util.ArrayList;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");
        strings.add("pineapple");

        String substring = "an";
        List<String> filteredStrings = filterStringsContainingSubstring(strings, substring);
        System.out.println("Строки, содержащие подстроку \"" + substring + "\": " + filteredStrings);
    }

    public static List<String> filterStringsContainingSubstring(List<String> strings, String substring) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.contains(substring)) {
                result.add(str);
            }
        }
        return result;
    }
}