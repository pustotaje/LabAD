package Lab09;

import java.util.Scanner;

public class Ex9 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public static void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
            insertAtHead(scanner.nextInt());
        }
        printList();
    }
}