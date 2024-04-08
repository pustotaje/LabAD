package Lab10;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XMLparser {
    private static final String FILENAME = "example.xml";

    public static Document loadDocument() throws ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        try {
            return builder.parse(FILENAME);
        } catch (Exception e) {
            return builder.newDocument();
        }
    }

    public static void saveDocument(Document doc) throws TransformerException, IOException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        DOMSource source = new DOMSource(doc);
        try (FileOutputStream fos = new FileOutputStream(FILENAME)) {
            StreamResult result = new StreamResult(fos);
            transformer.transform(source, result);
        }
    }

    public static void addBook(Document doc, String title, String author, String year) {
        Element root = doc.getDocumentElement();
        Element book = doc.createElement("book");
        Element titleElement = doc.createElement("title");
        titleElement.setTextContent(title);
        Element authorElement = doc.createElement("author");
        authorElement.setTextContent(author);
        Element yearElement = doc.createElement("year");
        yearElement.setTextContent(year);
        book.appendChild(titleElement);
        book.appendChild(authorElement);
        book.appendChild(yearElement);
        root.appendChild(book);
    }

    public static List<Element> searchBooksByAuthor(Document doc, String author) {
        List<Element> result = new ArrayList<>();
        NodeList books = doc.getElementsByTagName("book");
        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            String bookAuthor = book.getElementsByTagName("author").item(0).getTextContent();
            if (bookAuthor.equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public static List<Element> searchBooksByYear(Document doc, String year) {
        List<Element> result = new ArrayList<>();
        NodeList books = doc.getElementsByTagName("book");
        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            String bookYear = book.getElementsByTagName("year").item(0).getTextContent();
            if (bookYear.equals(year)) {
                result.add(book);
            }
        }
        return result;
    }

    public static void removeBookByTitle(Document doc, String title) {
        NodeList books = doc.getElementsByTagName("book");
        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            String bookTitle = book.getElementsByTagName("title").item(0).getTextContent();
            if (bookTitle.equals(title)) {
                book.getParentNode().removeChild(book);
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            Document doc = loadDocument();
            Scanner scanner = new Scanner(System.in);

            // Добавление новой книги
            addBook(doc, "Новая книга", "Новый автор", "2024");

            // Поиск книг по автору
            List<Element> booksByAuthor = searchBooksByAuthor(doc, "Новый автор");
            System.out.println("Книги автора 'Новый автор':");
            for (Element book : booksByAuthor) {
                System.out.println("Название: " + book.getElementsByTagName("title").item(0).getTextContent());
            }

            // Поиск книг по году издания
            List<Element> booksByYear = searchBooksByYear(doc, "2024");
            System.out.println("\nКниги изданные в 2024 году:");
            for (Element book : booksByYear) {
                System.out.println("Название: " + book.getElementsByTagName("title").item(0).getTextContent());
            }

            // Удаление книги
            removeBookByTitle(doc, "Новая книга");

            // Сохранение изменений в файл
            saveDocument(doc);

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}