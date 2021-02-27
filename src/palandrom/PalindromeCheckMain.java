package palandrom;

import java.util.Scanner;

public class PalindromeCheckMain {
    public static void main(String[] args) {
        StackByArray obj = new StackByArray();
        QueueByArray obj1 = new QueueByArray();
        PalindromeCheck obj2 = new PalindromeCheck();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        int size = str.length();
        int count=0;

        obj.insertArraySize(size);
        obj1.insertArraySize(size);

        str = str.toLowerCase();
        for (int i = 0; i <size; i++) {
            char temp = str.charAt(i);
            if(temp>='a' && temp <= 'z'){
                obj.push(str.charAt(i));
                obj1.enqueue(str.charAt(i));
                count++;
            }//end of if statement
        }//end of outer for loop
        char val1;
        char val2;
        for (int i = 0; i <count ; i++) {
            val1 = obj.pop();
            val2 = obj1.deQueue();
            obj2.check(val1 , val2);
        }//end of for loop

        obj2.display(count);
    }
}
