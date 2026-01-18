package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> dlist =new DoublyLinkedList<String>();
        dlist.addFirst("ِAlanod");
        dlist.addFirst("Mugahed");
        dlist.addLast("Saleh");
        dlist.addLast("Aljamali");
        dlist.removeFirst();
        dlist.removeLast();
        dlist.display();





    }
}