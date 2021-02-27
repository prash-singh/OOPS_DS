package stack.array;
import java.util.*;

public class StackByArrayMain {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       StackByArray obj = new StackByArray();
//        System.out.println("Enter size of an queue.queue.array");
//        int size = sc.nextInt();

        obj.insertSize(5);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        obj.display();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();

        obj.display();


    }
}
