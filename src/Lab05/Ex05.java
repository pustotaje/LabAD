package Lab05;

public class Ex05 {
    private int fieldValue;

    // Конструктор, работающий по тому же принципу, что и метод для присваивания значения полю
    public Ex05() {
        setFieldValue(0);
    }

    // Метод для присваивания значения полю
    public void setFieldValue(int value) {
        if (value > 100) {
            fieldValue = 100;
        } else {
            fieldValue = value;
        }
    }

    // Метод для проверки значения поля
    public int getFieldValue() {
        return fieldValue;
    }
}
