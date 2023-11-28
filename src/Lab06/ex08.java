package Lab06;

public class ex08 {
    public static double calculateAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;
        return average;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        double average = calculateAverage(numbers);

        System.out.println("Average: " + average);
    }
}
