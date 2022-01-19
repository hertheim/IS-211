import LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        for (int i = 0; i < 100; i++){
            test.addLast(i);
        }
        test.addLast("Last");
        test.addFirst("First");
        test.printLinkedList();
    }
}
