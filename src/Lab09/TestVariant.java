package Lab09;

import java.util.*;

public class TestVariant {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTimeList(arrayList));
        System.out.println("Время выполнения операции добавления linkedList = " + getRunningTimeList(linkedList));
        System.out.println("Время выполнения операции добавления arrayDeque = " + getRunningTimeDeque(arrayDeque));

    }

    private static long getRunningTimeList(List<Integer> list){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTimeDeque(Deque<Integer> deque){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 1000000; i++) {
            deque.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}