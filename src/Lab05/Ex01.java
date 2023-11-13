package Lab05;

public class Ex01 {
    private char symbol;

    // Открытый метод для присвоения значения полю
    public void setSymbol(char newSymbol) {
        this.symbol = newSymbol;
    }

    // Открытый метод для возвращения кода символа
    public int getSymbolCode() {
        return (int) this.symbol;
    }

    // Открытый метод для вывода в консоль символа и его кода
    public void printSymbolInfo() {
        System.out.println("Символ: " + this.symbol);
        System.out.println("Код символа: " + getSymbolCode());
    }

    // Пример использования класса
    public static void main(String[] args) {
        // Создаем объект класса
        Ex01 symbolInfo = new Ex01();

        // Присваиваем значение полю
        symbolInfo.setSymbol('A');

        // Выводим информацию о символе в консоль
        symbolInfo.printSymbolInfo();
    }
}
