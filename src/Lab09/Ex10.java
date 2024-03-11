package Lab09;

import java.util.Scanner;

public class Ex10 {
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

    public static void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент " + (i + 1) + ":");
            insertAtTail(scanner.nextInt());
        }
        printList();
    }
}