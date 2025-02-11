package DataStructures.LinkedLists;

import DataStructures.LinkedLists.Common.SinglyLinkedListNode;

public class PrintElementsLinkedList {
    public static void main(String[] args) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(16);
        head.next = new SinglyLinkedListNode(13);

        printLinkedList(head);
    }

    static void printLinkedList(SinglyLinkedListNode head) {
        System.out.println(head.data);

        while (head.next != null) {
            head = head.next;
            System.out.println(head.data);
        }
    }
}