package DoublyLinkedLlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> dlist=new DoublyLinkedList<>();
        dlist.addFirst("Alanod");
        dlist.addFirst("Mojahed");
        dlist.addLast("saleh");
        dlist.addLast("Aljamali");
        dlist.removeFirst();
        dlist.removeLast();
        dlist.display();
    }
}
