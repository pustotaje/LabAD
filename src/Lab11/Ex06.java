package Lab11;

import java.util.ArrayList;
import java.util.List;


public class Ex06 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(7);
        numbers.add(20);
        numbers.add(4);
        numbers.add(30);

        int divisor = 5;
        List<Integer> divisibleNumbers = filterDivisibleNumbers(numbers, divisor);
        System.out.println("Числа, делящиеся на " + divisor + " без остатка: " + divisibleNumbers);
    }

    public static List<Integer> filterDivisibleNumbers(List<Integer> numbers, int divisor) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }
        return result;
    }
}