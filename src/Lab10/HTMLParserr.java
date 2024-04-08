package Lab10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HTMLParserr {
    private static final String OUTPUT_FILE = "news_output.txt";

    public static void main(String[] args) {
        try {
            // Получаем HTML-код страницы
            Document doc = getHtmlDocument("http://fat.urfu.ru/index.html");

            if (doc != null) {
                // Извлекаем список новостей
                Elements newsParent = doc.select("body > table > tbody > tr >" +
                        " td > div > table > " + "tbody > tr:nth-child(5) > td:nth-child(3)" +
                        " > table > tbody > " + "tr > td:nth-child(1)");

                // Выводим последние 10 новостей в консоль и записываем в файл
                FileWriter writer = new FileWriter(OUTPUT_FILE);
                for (int i = 3; i < 20; i++) {
                    if (!(i % 2 == 0)) {
                        List<Node> nodes = newsParent.get(0).childNodes();
                        String theme = ((Element) nodes.get(i)).getElementsByClass("blocktitle").get(0).text();
                        String date = ((Element) nodes.get(i)).getElementsByClass("blockdate").get(0).text();

                        System.out.println("Тема: " + theme);
                        System.out.println("Дата: " + date + "\n");

                        // Записываем данные в файл
                        writer.write("Тема: " + theme + "\n");
                        writer.write("Дата: " + date + "\n\n");
                    }
                }
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при получении HTML-кода страницы: " + e.getMessage());
        }
    }

    // Метод для получения HTML-кода страницы
    private static Document getHtmlDocument(String url) throws IOException {
        Document doc = null;
        int retries = 3;
        int attempts = 0;

        while (attempts < retries) {
            try {
                doc = Jsoup.connect(url).get();
                break;
            } catch (IOException e) {
                attempts++;
                if (attempts == retries) {
                    throw e; // Если не удалось подключиться после трех попыток, выбрасываем исключение
                } else {
                    System.out.println("Ошибка подключения к сайту. Повторная попытка...");
                }
            }
        }
        return doc;
    }
}