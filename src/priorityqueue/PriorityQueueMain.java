package priorityqueue;

import java.util.*;

public class PriorityQueueMain
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PriorityQueue obj = new PriorityQueue();
        System.out.println("Enter the String");
        String str = scn.next();
        for (int i = 0; i <str.length(); i++) {
            char data = str.charAt(i);
            Node n1 = new Node(data);
            obj.enqueue(n1);
        }
        obj.display();
    }
}
