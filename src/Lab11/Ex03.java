package Lab11;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Watermelon");
        strings.add("melon");
        strings.add("Arbuz");
        strings.add("Cat");
        strings.add("chetire");

        List<String> capitalizedStrings = filterCapitalized(strings);
        System.out.println("Строки, начинающиеся с большой буквы: " + capitalizedStrings);
    }

    public static List<String> filterCapitalized(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.length() > 0 && Character.isUpperCase(str.charAt(0))) {
                result.add(str);
            }
        }
        return result;
    }
}