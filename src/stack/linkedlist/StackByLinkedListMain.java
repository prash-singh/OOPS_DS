package stack.linkedlist;

public class StackByLinkedListMain {
    public static void main(String[] args) {
        StackByLinkedList obj = new StackByLinkedList();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        obj.push(n1);
        obj.push(n2);
        obj.push(n3);
        obj.push(n4);
        obj.push(n5);

        obj.pop();
        obj.display();



    }
}
