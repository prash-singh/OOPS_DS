package priorityqueue;

public class Node {
    char ch;
    Node next;
    int priority;

    public void character(char ch) {
        this.ch = ch;
        priority = (int) ch;
    }

    public Node() {

    }
}
