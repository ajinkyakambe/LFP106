package day14problem.linkedlistproblems;

public class UC1linkedlistproblems {
	Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Driving code
    public static void main(String[] args) {
        UC1linkedlistproblems linkedList = new UC1linkedlistproblems();

        linkedList.head = new Node(56);
        Node second = new Node(30);
        Node Third = new Node(70);

        linkedList.head.next = second;
        second.next = Third;

        // Print the Data with Values only if it's not nulled.
        while (linkedList.head != null) {
            System.out.println(linkedList.head.data);
            linkedList.head = linkedList.head.next;
        }
    }

}
