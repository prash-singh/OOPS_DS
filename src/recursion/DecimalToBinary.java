package recursion;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary obj = new DecimalToBinary();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert");
        int num = sc.nextInt();
        //obj.convert(num);
        System.out.println(obj.g(num));
    }
//    public void convert(int val){
//        if(val>0){
//            convert(val/2);
//        }
//        System.out.print(val%2 + " ");
//    }
    public int g(int e){
        int num1 =0;
        if(e>4){
            num1=  (2+g(e-5)+g(e-2));
            //System.out.println(num1);
            return num1;
        }
        return 1;
    }
}
