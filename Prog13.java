class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Adding node in the beginnning 
    public void addAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Print the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Prog13 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding nodes at the beginning
        list.addAtBeginning(10);
        list.addAtBeginning(20);
        list.addAtBeginning(30);

        // Display the list
        System.out.println("Linked List");
        list.display();
    }
}
