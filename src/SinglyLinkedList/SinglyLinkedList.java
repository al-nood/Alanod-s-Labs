package SinglyLinkedList;

public class SinglyLinkedList <E>{
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;

    public int size(){
        return size;
    }
    public boolean is_Empty(){
        return size()==0;
    }
    public void addFrist(E data){
        Node<E> newnode=new Node(data ,head);
        head=newnode;
        if(is_Empty())
            tail=head;
        size++;
    }
    public E getFrist(){
        if(is_Empty())return null;
        return head.getData();
    }
    public E removFrist(){
        if (is_Empty())return null;
        E delete=head.getData();
        head=head.getNext();
        size--;
        if(is_Empty())
            tail=head;
        return delete;
    }

    public void addLast(E data){
        Node newnode=new Node(data,null);
        if(is_Empty())
            head=newnode;
        else{
            tail.setNext(newnode);
        }
        tail=newnode;
        size++;
    }
    public E getLast(){
        if(is_Empty())return null;
        return tail.getData();
    }
    public E removeLast(){
        if(is_Empty())return null;
        E delete=tail.getData();
        if(head==tail){
            head=null;
            tail=null;
        }
        else {
            Node<E> temp = head;//pointer it's copy from head to start from it
            while (temp.getNext() != tail) {
                temp = temp.getNext();
            }
            temp.setNext(null);
            tail=temp;}
            size--;
            return delete;

    }
    public void display(){
        Node<E> temp=head;
        while(temp!=null) {
            System.out.print(temp.getData() + "---->");
            temp = temp.getNext();
        }
        System.out.println("null \n");
    }

    class Node<E> {
        private E data;
        private Node<E> next;

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }


    }
}
