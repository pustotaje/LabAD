package Lab11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int[] commonElements = findCommonElements(array1, array2);
        System.out.println("Общие элементы: " + Arrays.toString(commonElements));
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        Set<Integer> commonSet = new HashSet<>();
        for (int num : array2) {
            if (set1.contains(num)) {
                commonSet.add(num);
            }
        }

        int[] result = new int[commonSet.size()];
        int index = 0;
        for (int num : commonSet) {
            result[index++] = num;
        }
        return result;
    }
}
