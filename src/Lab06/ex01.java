package Lab06;

public class ex01 {
    private char charField;
    private String textField;

    // Перегруженный метод для присваивания значений полям
    public void setField(char value) {
        charField = value;
    }

    // Перегруженный метод для присваивания значений полям
    public void setField(String value) {
        textField = value;
    }

    // Перегруженный метод для присваивания значений полям
    public void setField(char[] value) {
        if (value.length == 1) {
            charField = value[0];
        } else {
            textField = String.valueOf(value);
        }
    }

    // Метод для отображения значений полей
    public void displayFieldValues() {
        System.out.println("charField: " + charField);
        System.out.println("textField: " + textField);
    }
}
