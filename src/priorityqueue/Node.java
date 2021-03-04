package priorityqueue;

public class Node {
    char ch;
    Node next;
    int priority;

    public Node(char ch) {
        this.ch = ch;
        priority = (int) ch;
    }
}
