package Timus;

//EqualSidesOfAnArray

public class codewars5 {
    public static int findEvenIndex(int[] arr) {
        int index;
        int sumLeft;
        int sumRight;
        index = 0;
        while (index++ < arr.length - 1) {
            sumLeft = sumRight = 0;
            for (int i = 0; i < index; i++) sumLeft += arr[i];
            for (int j = arr.length - 1; j > index; j--) sumRight += arr[j];
            if (sumLeft == sumRight) return index;
        }
        return -1;
    }
}
