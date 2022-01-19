import LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        for (int i = 0; i < 100; i++){
            test.addFirst(i);
        }
        test.addLast("test");
        test.addFirst("First");
        //test.displayHead();
        //test.displayTail();
        test.printLinkedList();
    }
}
