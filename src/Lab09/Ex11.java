//!!!!!!!!!!!!
package Lab09;
import java.util.HashMap;
import java.util.Map;

public class Ex11 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        // Заполнение HashMap
        for (int i = 0; i < 10; i++) {
            map.put(i, " " + i);
        }

        // Находим строки, у которых ключ > 5
        System.out.println("Строки с ключом > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        // Если ключ = 0, выводим строки через запятую
        System.out.println("Строка с ключом 0:");
        if (map.containsKey(0)) {
            System.out.println(map.get(0));
        }

        // Перемножаем все ключи, где количество символов в строке > 5
        int product = 1;
        int count = 0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Произведение ключей, где длина строки > 5: " + product);
        } else {
            System.out.println("Нет ключей, где длина строки > 5");
        }
    }
}