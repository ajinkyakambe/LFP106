package day14problem.linkedlistproblems;

public class UC4linkedlistproblems {
	public Node head;
    public Node tail;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Adding new Node with data
    public void add(int datas){
        Node newNode = new Node(datas);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Display the Node with value
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Insert the value between Given position
    public void insert(int c,int position){
        Node newNode = new Node(c);
        Node temp = head;
        for (int i=1; i < position-1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next=newNode;

        System.out.println("30 Added sucessfully between 56 and 70\n");
    }

    public static void main(String[] args) {
        UC4linkedlistproblems list = new UC4linkedlistproblems();

        list.add(56);
        list.add(70);
        list.insert(30,2);
        list.display();

    }

}
