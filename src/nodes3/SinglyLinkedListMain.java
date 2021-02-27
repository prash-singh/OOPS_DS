package nodes3;
import java.util.*;
public class SinglyLinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("\nEnter 1 to insert data..");
            System.out.println("Enter 2 to printlastsecond data..\n");
            System.out.println("if you enter another number you will  exit\n");
            System.out.println("enter your choice");
            int input = sc.nextInt();
            switch (input) {
                case (1):
                    System.out.println("Enter data to Insert");
                    int ch = sc.nextInt();
                    Node n1 = new Node(ch);
                    obj.insert(n1);
                    break;

                case (2):
                    obj.printAtSecondLast();
                    System.exit(0);
                    break;
                default:
                    System.out.println("code exit");
                    System.exit(0);


            }
        }
    }
}

