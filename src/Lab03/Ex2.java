package Lab03;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели (на русском): ");
        String dayOfWeek = scanner.nextLine();

        int dayNumber;
        switch (dayOfWeek.toLowerCase()) {
            case "понедельник":
                dayNumber = 1;
                break;
            case "вторник":
                dayNumber = 2;
                break;
            case "среда":
                dayNumber = 3;
                break;
            case "четверг":
                dayNumber = 4;
                break;
            case "пятница":
                dayNumber = 5;
                break;
            case "суббота":
                dayNumber = 6;
                break;
            case "воскресенье":
                dayNumber = 7;
                break;
            default:
                System.out.println("Такого дня нет");
                return;
        }

        System.out.println("Порядковый номер дня недели: " + dayNumber);
    }
}
