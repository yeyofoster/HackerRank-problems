package InterviewPreparationKits.OneWeekPreparationKit.Day5;

public class MergeTwoSortedLinkedLists {

    public static void main(String[] args) {
        SinglyLinkedListNode head1 = new SinglyLinkedListNode();
        head1.data = 4;
        head1.next = new SinglyLinkedListNode();

        head1.next.data = 5;
        head1.next.next = new SinglyLinkedListNode();

        head1.next.next.data = 6;

        SinglyLinkedListNode head2 = new SinglyLinkedListNode();
        head2.data = 1;
        head2.next = new SinglyLinkedListNode();

        head2.next.data = 2;
        head2.next.next = new SinglyLinkedListNode();

        head2.next.next.data = 10;

        printLinkedList("H1", head1);
        printLinkedList("H2", head2);

        SinglyLinkedListNode merged = mergeLists(head1, head2);
        printLinkedList("Merged", merged);
    }

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     * int data;
     * SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }

        SinglyLinkedListNode mergedHead;
        SinglyLinkedListNode currentNode;

        // Setting the head for merged linked list.
        if (head1.data < head2.data) {
            mergedHead = head1;
            head1 = head1.next;
        } else {
            mergedHead = head2;
            head2 = head2.next;
        }

        // Merging both list.
        currentNode = mergedHead;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                currentNode.next = head1;
                head1 = head1.next;
            } else {
                currentNode.next = head2;
                head2 = head2.next;
            }

            currentNode = currentNode.next;
        }

        if (head1 == null) {
            currentNode.next = head2;
        } else {
            currentNode.next = head1;
        }

        return mergedHead;
    }

    public static void printLinkedList(String name, SinglyLinkedListNode list) {
        SinglyLinkedListNode currentNode = list;
        System.out.println(name);
        while (currentNode != null) {
            System.out.print(String.format("%d => ", currentNode.data));
            currentNode = currentNode.next;
        }
        System.out.println("\n");
    }

    public static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }
}