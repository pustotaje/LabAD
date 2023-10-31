package Lab03;

public class ex8 {
    public static void main(String[] args) {
        char[] array = new char[10];
        char letter = 'B';

        for (int i = 0; i < 10; i++) {
            // Пропускаем гласные буквы
            while (letter == 'A' || letter == 'E' || letter == 'I') {
                letter++;
            }
            array[i] = letter;
            letter++;
        }

        // Отображение содержимого массива
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
