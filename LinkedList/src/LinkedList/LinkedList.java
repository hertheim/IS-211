package LinkedList;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    public <E> void addLast(E data) {
        Node<E> newNode = new Node<E>();
        newNode.setData(data);

        if(head == null) {
            head = newNode;
        }else {
            tail.setNextNode(newNode);
            tail.setPrevNode(newNode);
        }
        tail = newNode;
        size++;
    }

    public <E> void addFirst(E data) {
        Node<E> newNode = new Node<E>();
        newNode.setData(data);

        if(head == null) {
            tail = newNode;
        }else {
            newNode.setNextNode(head);
            head.setPrevNode(newNode);
        }
        head = newNode;
        size++;
    }

    public <E> void remove(E data) {
        Node current = head;
        while(current != null){
            if(current.getData().equals(data)){

            }
            current = current.getNextNode();
        }
        size--;
    }

    public int size() {
        return size;
    }

    public void printLinkedList() {
        Node current = head;
        while(current != null){
            System.out.println(current.getData());
            current = current.getNextNode();
        }
    }
}

