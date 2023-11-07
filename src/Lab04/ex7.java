package Lab04;

public class ex7 {
    public static void main(String[] args) {
        int rows = 4; // Количество строк
        int cols = 5; // Количество столбцов

        int[][] snakeArray = new int[rows][cols];
        int counter = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Заполнение слева направо для четных строк
                for (int j = 0; j < cols; j++) {
                    snakeArray[i][j] = counter;
                    counter++;
                }
            } else {
                // Заполнение справа налево для нечетных строк
                for (int j = cols - 1; j >= 0; j--) {
                    snakeArray[i][j] = counter;
                    counter++;
                }
            }
        }

        // Вывод результата
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(snakeArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
