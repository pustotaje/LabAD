package Lab03;
public class ex7 {
    public static void main(String[] args) {
        int arraySize = 10;
        char[] charArray = new char[arraySize];

        for (int i = 0; i < arraySize; i++) {
            charArray[i] = (char) ('a' + i * 2);
        }

        System.out.println("Прямой порядок:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(charArray[i] + " ");
        }

        System.out.println("\nОбратный порядок:");
        for (int i = arraySize - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
    }
}
