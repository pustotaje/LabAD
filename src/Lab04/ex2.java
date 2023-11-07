package Lab04;

public class ex2 {
    public static void main(String[] args) {
        int height = 5; // высота треугольника

        // Внешний цикл для строк
        for (int i = 1; i <= height; i++) {
            // Вложенный цикл для вывода звездочек
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
