package Lab05;

public class Ex03 {
    private int field1;
    private int field2;

    // Конструктор без аргументов
    public Ex03() {
        field1 = 0;
        field2 = 0;
    }

    // Конструктор с одним аргументом
    public Ex03(int value) {
        field1 = value;
        field2 = 0;
    }

    // Конструктор с двумя аргументами
    public Ex03(int value1, int value2) {
        field1 = value1;
        field2 = value2;
    }

    public int getField1() {
        return field1;
    }

    public void setField1(int value) {
        field1 = value;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int value) {
        field2 = value;
    }
}
