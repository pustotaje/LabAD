package Lab06;

public class ex02 {
    private static int staticInteger = 0;

    // Статический метод для отображения текущего значения и увеличения на единицу
    public static void displayAndIncrement() {
        System.out.println("Текущее значение: " + staticInteger);
        staticInteger++;
    }
}
