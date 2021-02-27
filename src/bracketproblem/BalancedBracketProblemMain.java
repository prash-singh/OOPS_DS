package bracketproblem;

import java.util.Scanner;

public class BalancedBracketProblemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression");
        String str = sc.next();
        BalancedBracketProblem obj = new BalancedBracketProblem();
        obj.str = str;
        obj.check();

    }
}
