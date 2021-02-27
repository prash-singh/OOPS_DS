package recursion;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary obj = new DecimalToBinary();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert");
        int num = sc.nextInt();
        obj.convert(num);
    }
    public void convert(int val){
        if(val>0){
            convert(val/2);
        }
        System.out.print(val%2 + " ");
    }
}
