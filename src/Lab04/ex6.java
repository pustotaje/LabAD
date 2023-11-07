package Lab04;

import java.util.Arrays;
import java.util.Random;
public class ex6 {
    public static void main(String[] args) {
        int rows = 5; // количество строк
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

        // Генерация случайных индексов строки и столбца для удаления
        int rowIndex = random.nextInt(rows);
        int columnIndex = random.nextInt(columns);

        // Создание нового массива с уменьшенными размерами
        int[][] reducedMatrix = new int[rows - 1][columns - 1];

        // Копирование значений из исходного массива, исключая выбранную строку и столбец
        int reducedRowIndex = 0;
        int reducedColumnIndex;
        for (int i = 0; i < rows; i++) {
            if (i != rowIndex) {
                reducedColumnIndex = 0;
                for (int j = 0; j < columns; j++) {
                    if (j != columnIndex) {
                        reducedMatrix[reducedRowIndex][reducedColumnIndex] = matrix[i][j];
                        reducedColumnIndex++;
                    }
                }
                reducedRowIndex++;
            }
        }

        // Вывод массива с удаленной строкой и столбцом
        System.out.println("Массив с удаленной строкой и столбцом:");
        printMatrix(reducedMatrix);
    }

    // Метод для вывода массива в консоль
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
