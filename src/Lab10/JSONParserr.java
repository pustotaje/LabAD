package Lab10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONParserr {
    private static final String FILENAME = "example-json.json";

    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(FILENAME));
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            // Вывод всех книг
            System.out.println("Все книги:");
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                printBookInfo(book);
            }

            // Поиск книг по автору
            String authorToSearch = "Новый автор";
            System.out.println("\nКниги автора '" + authorToSearch + "':");
            jsonArray.stream()
                    .filter(book -> book instanceof JSONObject)
                    .map(book -> (JSONObject) book)
                    .filter(book -> authorToSearch.equals(book.getClass()))
                    .forEach(book -> printBookInfo((JSONObject) book));

            // Добавление новой книги
            JSONObject newBook = new JSONObject();
            newBook.put("title", "Новая книга");
            newBook.put("author", "Новый автор");
            newBook.put("year", 2023);
            jsonArray.add(newBook);

            // Удаление книги по названию
            String titleToRemove = "Новая книга";
            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (titleToRemove.equals(book.get("title"))) {
                    iterator.remove();
                    break; // Удаляем только одну книгу с данным названием
                }
            }

            // Сохранение изменений в файл
            saveJSONToFile(jsonObject);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для вывода информации о книге
    private static void printBookInfo(JSONObject book) {
        System.out.println("\nТекущий элемент: book");
        System.out.println("Название книги: " + book.get("title"));
        System.out.println("Автор: " + book.get("author"));
        System.out.println("Год издания: " + book.get("year"));
    }

    // Метод для сохранения JSON в файл
    private static void saveJSONToFile(JSONObject jsonObject) throws IOException {
        try (FileWriter file = new FileWriter(FILENAME)) {
            file.write(jsonObject.toJSONString());
            System.out.println("\nИзменения сохранены в файле.");
        }
    }
}