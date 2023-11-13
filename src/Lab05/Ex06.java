package Lab05;

public class Ex06 {
    private int max;
    private int min;

    public Ex06(int value1, int value2) {
        setFieldValues(value1, value2);
    }

    // Метод для присваивания значений полям
    public void setFieldValues(int value1, int value2) {
        if (value1 > value2) {
            max = value1;
            min = value2;
        } else {
            max = value2;
            min = value1;
        }
    }

    // Метод для отображения значений полей
    public void displayFieldValues() {
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
