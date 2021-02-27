package nodes4;

import java.util.Scanner;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        Node n1 = new Node(10);
        Node n2 = new Node(2);
        Node n3 = new Node(10);
        Node n4 = new Node(2);
        Node n5 = new Node(2);

        obj.insert(n1);
        obj.insert(n2);
        obj.insert(n3);
        obj.insert(n4);
        obj.insert(n5);

        obj.display();

        obj.search(2);
    }

}
