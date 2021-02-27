package nodes3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SinglyLinkedList {
    Node head;
    Node previous;
    public SinglyLinkedList(){
        head = null;

    }

    public void insert(Node newnode){
        if(head == null){
            head = newnode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }//end of insert method

    public void printAtSecondLast(){
        Node temp = head;
        if (temp==null)
        {
            System.out.println("empty list...");
        }
        else if(temp.next==null)
        {
            previous = temp;
            System.out.println("Only one data is present " + previous.data);
        }
        else {
            while (temp.next != null) {
                previous = temp;
                temp = temp.next;
            }
            System.out.println("Last second number is = " + previous.data);
        }

    }
}
