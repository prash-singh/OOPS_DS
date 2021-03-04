package generics.Stack;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        StackByLinkedList<Integer> obj = new StackByLinkedList<Integer>();
        obj.push(10);
        StackByLinkedList<String> obj1 = new StackByLinkedList<String >();
        obj1.push("hello");

        obj.display();
        obj1.display();
    }
}
