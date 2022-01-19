package LinkedList;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    public <E> void addLast(E data) {
        Node<E> newNode = new Node<E>();
        newNode.setData(data);

        if(tail == null) {
            head = newNode;
        }else {
            newNode.setPrevNode(tail);
            tail.setNextNode(newNode);
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
        if(head == null) {
            System.out.println("There are no elements in the list.");
        }
        while(current != null){
            if(current.getData().equals(data)){
                if(size == 1){
                    head = null;
                    tail = null;
                }else if(current == head) {
                    head.getNextNode().setPrevNode(null);
                    head = head.getNextNode();
                    size --;
                }else if(current == tail){
                    tail.getPrevNode().setNextNode(null);
                    tail = tail.getPrevNode();
                    size --;
                }else{
                    current.getPrevNode().setNextNode(current.getNextNode());
                    current.getNextNode().setPrevNode(current.getPrevNode());
                    size--;
                }
                break;
            }
            current = current.getNextNode();
        }
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

