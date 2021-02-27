package nodes;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node (50);

        //obj.insert(new Node(10)); //Anonymous object

        obj.insert(n1);
        obj.insert(n2);
        obj.insert(n3);
        obj.insert(n4);
        obj.deleteAtPosition(2);
        obj.display();
    }
}//end of main class
