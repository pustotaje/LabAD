package Lab04;

public class ex3 {
    public static void main(String[] args) {
        int width = 5; // ширина прямоугольника
        int height = 5; // высота прямоугольника

        int[][] rectangle = new int[height][width];

        // Заполнение массива цифрой 2
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rectangle[i][j] = 2;
            }
        }

        // Вывод прямоугольника в консольное окно
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
