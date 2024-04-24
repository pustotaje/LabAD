package Lab11;

import java.util.ArrayList;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        int maxValue = 18;
        List<Integer> filteredNumbers = filterNumbersLessThan(numbers, maxValue);
        System.out.println("Числа меньше " + maxValue + ": " + filteredNumbers);
    }

    public static List<Integer> filterNumbersLessThan(List<Integer> numbers, int maxValue) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : numbers) {
            if (num < maxValue) {
                result.add(num);
            }
        }
        return result;
    }
}