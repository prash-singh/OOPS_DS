package priorityqueue;

import java.util.Scanner;

public class PriorityQueueMain
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PriorityQueue obj = new PriorityQueue();
        System.out.println("Enter the String");
        String str = scn.next();
        for (int i = 0; i <str.length(); i++) {
            Node n1 = new Node();
            char data = str.charAt(i);
            n1.character(data);
            obj.enqueue(n1);
        }
        obj.display();
    }
}
