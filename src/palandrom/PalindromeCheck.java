package palandrom;

public class PalindromeCheck {
    String str;
    int count = 0;

    public PalindromeCheck() {

    }//end of constructor

    public void check(char val1, char val2){
        if(val1 == val2){
            count++;
        }//end of if statement
    }//end of check method

    public void display(int value){
        if(count == value){
            System.out.println("Given String is Palindrome");
        }//end of if
        else{
            System.out.println("Not a palindrome");
        }//end of else
    }//end of display method
}
