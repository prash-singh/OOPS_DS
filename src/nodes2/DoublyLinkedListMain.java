package nodes2;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        Node n1 = new Node(100);
        Node n2 = new Node(200);
        Node n3 = new Node(300);
        Node n4 = new Node(400);
        Node n5 = new Node(500);

        obj.insert(n1);
        obj.insert(n2);
        obj.insert(n3);
        obj.insert(n4);
        obj.insert(n5);
        obj.deleteAtLast();
        obj.display();

    }
}
