package Lab04;

import java.util.Random;
public class ex5 {
    public static void main(String[] args) {
        int rows = 3; // количество строк
        int columns = 5; // количество столбцов

        int[][] matrix = new int[rows][columns];

        // Заполнение массива случайными числами
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(100); // случайное число от 0 до 99
            }
        }

        // Вывод исходного массива
        System.out.println("Исходный массив:");
        printMatrix(matrix);

        // Создание нового массива для расположения столбцов в строках
        int[][] transposedMatrix = new int[columns][rows];

        // Заполнение нового массива значениями из исходного массива, меняя местами строки и столбцы
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        // Вывод массива с поменянными строками и столбцами
        System.out.println("Массив с поменянными строками и столбцами:");
        printMatrix(transposedMatrix);
    }

    // Метод для вывода массива в консоль
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
