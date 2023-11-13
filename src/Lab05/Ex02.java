package Lab05;

public class Ex02 {
    // Символьные поля
    private char startChar;
    private char endChar;

    // Конструктор класса
    public Ex02(char startChar, char endChar) {
        this.startChar = startChar;
        this.endChar = endChar;
    }

    // Метод для вывода символов в заданном диапазоне включительно
    public void printCharacterRange() {
        for (char currentChar = startChar; currentChar <= endChar; currentChar++) {
            System.out.print(currentChar + " ");
        }
        System.out.println(); // Переход на новую строку после вывода всех символов
    }

    // Пример использования класса
    public static void main(String[] args) {
        // Создаем объект класса с заданными значениями полей
        Ex02 rangePrinter = new Ex02('D', 'G');

        // Вызываем метод для вывода символов в заданном диапазоне
        rangePrinter.printCharacterRange();
    }
}
