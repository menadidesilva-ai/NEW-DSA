
public class DoublyLinkedList {

    class Node {
        int data;
        Node next;
        Node previous;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    // Add a new node
    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    // Display from first to last
    void displayForward() {
        Node current = head;

        System.out.println("Forward:");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    // Display from last to first
    void displayBackward() {
        Node current = tail;

        System.out.println("Backward:");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.displayForward();
        list.displayBackward();
    }
}
