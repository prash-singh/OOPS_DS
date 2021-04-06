package recursion.TowerOfHanoi;

import java.util.*;

public class HanoiMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HanoiMain obj = new HanoiMain();
        System.out.println("Enter the String");
        String str = scn.next();
        char a = str.charAt(1);
        char b = str.charAt(2);
        char c = str.charAt(3);
        scn.next();
        int num = str.length();
        obj.TOH(num,a,b,c);

    }
    public void TOH(int n, char t1 , char t2 , char t3){
        if(n==0){
            return;
        }else{
            TOH(n-1 , t1 , t3 , t2);
            System.out.println(n + " moved for t1 to " + "t2" );
            TOH(n-1, t3,t2,t1);
        }
    }
}
