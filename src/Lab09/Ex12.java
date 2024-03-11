package Lab09;

import java.util.ArrayList;
import java.util.List;

public class Ex12 {
    public static void main(String[] args) {
        int N = 10; // Замените на нужное количество людей
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        int index = 0;
        while (list.size() > 1) {
            index = (index + 1) % list.size();
            list.remove(index);
        }
        System.out.println("Оставшийся человек: " + list.get(0));
    }
}