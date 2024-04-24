package Lab11;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> squares = squareNumbers(numbers);
        System.out.println("Квадраты чисел: " + squares);
    }

    public static List<Integer> squareNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : numbers) {
            result.add(num * num);
        }
        return result;
    }
}