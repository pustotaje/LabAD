package Lab09;

import java.util.*;

public class TestVariant1 {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        // Заполняем коллекции
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
            arrayDeque.add(i);
        }

        System.out.println("Время выполнения операции удаления в начале arrayList = " + getRunningTimeList(arrayList));
        System.out.println("Время выполнения операции удаления в начале linkedList = " + getRunningTimeList(linkedList));
        System.out.println("Время выполнения операции удаления в начале arrayDeque = " + getRunningTimeDeque(arrayDeque));

    }

    private static long getRunningTimeList(List<Integer> list){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        while (!list.isEmpty()) {
            list.remove(0);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTimeDeque(Deque<Integer> deque){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        while (!deque.isEmpty()) {
            deque.removeFirst();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}