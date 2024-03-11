package Lab09;

import java.util.*;

public class TestVariant2 {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        // Заполняем коллекции
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            arrayDeque.add(i);
        }

        System.out.println("Время выполнения операции получения элемента по индексу arrayList = " + getRunningTimeList(arrayList));
        System.out.println("Время выполнения операции получения элемента по индексу arrayDeque = " + getRunningTimeDeque(arrayDeque));

    }

    private static long getRunningTimeList(List<Integer> list){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция получения элемента по индексу
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTimeDeque(Deque<Integer> deque){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция получения элемента по индексу
        Iterator<Integer> iterator = deque.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}