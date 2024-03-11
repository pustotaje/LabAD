package Lab09;

public class Ex14 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    // Методы с использованием цикла
    public static void createHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
    }

    public static void createTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public static String toStringList() {
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.data + " ");
            temp = temp.next;
        }
        return sb.toString();
    }

    public static void AddFirst(int data) {
        createHead(data);
    }

    public static void AddLast(int data) {
        createTail(data);
    }

    public static void Insert(int index, int data) {
        if (index < 0 || index > getSize()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + getSize());
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public static void RemoveFirst() {
        if (head != null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }

    public static void RemoveLast() {
        if (head != null) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                Node temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
        }
    }

    public static void Remove(int index) {
        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + getSize());
        }
        if (index == 0) {
            RemoveFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

    public static int getSize() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public static void main(String[] args) {
        // Создаем список с головы
        for (int i = 10; i > 0; i--) {
            createHead(i);
        }
        System.out.println("Список после создания с головы: " + toStringList());

        // Создаем список с хвоста
        for (int i = 1; i <= 10; i++) {
            createTail(i);
        }
        System.out.println("Список после создания с хвоста: " + toStringList());

        // Добавляем элемент в начало списка
        AddFirst(0);
        System.out.println("Список после добавления элемента в начало: " + toStringList());

        // Добавляем элемент в конец списка
        AddLast(11);
        System.out.println("Список после добавления элемента в конец: " + toStringList());

        // Вставляем элемент в список с указанным номером
        Insert(5, 100);
        System.out.println("Список после вставки элемента с указанным номером: " + toStringList());

        // Удаляем элемент с головы списка
        RemoveFirst();
        System.out.println("Список после удаления элемента с головы: " + toStringList());

        // Удаляем последний элемент списка
        RemoveLast();
        System.out.println("Список после удаления последнего элемента: " + toStringList());

        // Удаляем из списка элемент с указанным номером
        Remove(5);
        System.out.println("Список после удаления элемента с указанным номером: " + toStringList());
    }
}