package LinkedList;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public class Node {

        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }
    }
}