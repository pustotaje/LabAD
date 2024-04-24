package Lab11;

import java.util.ArrayList;
import java.util.List;

public class Ex08 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        int minValue = 12;
        List<Integer> filteredNumbers = filterNumbersGreaterThan(numbers, minValue);
        System.out.println("Числа больше " + minValue + ": " + filteredNumbers);
    }

    public static List<Integer> filterNumbersGreaterThan(List<Integer> numbers, int minValue) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : numbers) {
            if (num > minValue) {
                result.add(num);
            }
        }
        return result;
    }
}