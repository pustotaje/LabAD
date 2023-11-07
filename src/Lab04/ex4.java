package Lab04;

public class ex4 {
    public static void main(String[] args) {
        int height = 5; // высота треугольника

        int[][] triangle = new int[height][];

        // Заполнение массива
        for (int i = 0; i < height; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = j + 1;
            }
        }

        // Вывод треугольника в консольное окно
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
