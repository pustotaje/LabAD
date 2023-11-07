package Lab04;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String originalText = scanner.nextLine();

        System.out.print("Введите ключ (целое число): ");
        int key = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после ввода числа

        // Шифрование текста
        String encryptedText = encrypt(originalText, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.print("Выполнить обратное преобразование? (y/n): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("y")) {
            // Дешифрование текста
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (response.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }

        scanner.close();
    }

    // Метод для шифрования текста
    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                result.append((char) ((character - base + key) % 26 + base));
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }

    // Метод для дешифрования текста
    public static String decrypt(String text, int key) {
        return encrypt(text, 26 - key); // Для дешифрования используем обратный ключ
    }
}
