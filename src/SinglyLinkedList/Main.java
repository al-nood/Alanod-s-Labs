package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        list.addFrist(10);
        list.addFrist(20);
        list.addLast(30);
        list.addLast(40);
        list.removFrist();
        list.removeLast();

        list.display();
    }
}
