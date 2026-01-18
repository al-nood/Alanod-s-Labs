package CirculyLinledList;

public class Main {
    public static void main(String[] args) {
        CirculyLinked<String> list=new CirculyLinked<String>();
        list.addFirst("Alanod");
        list.addLast("Mogahed");
        list.addLast("Aljamali");
        list.removefirst();
        list.removeLast();
        list.display();

    }
}
