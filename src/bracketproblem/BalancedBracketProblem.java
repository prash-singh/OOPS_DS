//(a+b) * (c+d) => true;
//{[()]} => true;
//{[}] => false;
    /*
        note => ignore all other variable and operator just push and pop brackets
        If you get another bracket then peek in stack and compare both of them if
        they matched then pop the bracket from stack and do same for rest all.
        If stack if not empty print not a balanced bracket else print balanced
        bracket.
     */
package bracketproblem;
public class BalancedBracketProblem {
    String str;
    public BalancedBracketProblem(String str){
        this.str = str;
    }

    public BalancedBracketProblem() {

    }

    public void check(){
        StackOfBracket obj = new StackOfBracket();
        obj.StackOfBracket(str.length());
        char array[] = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == '(' || array[i] == '[' || array[i] == '{'){
                obj.push(array[i]);
            }
            else if(array[i] == ')' || array[i] == ']' || array[i] == '}'){
                char chr = obj.peek();
                if(obj.isEmpty()){
                    System.out.println("invalid");
                    return;
                }else if(array[i] == ')' && chr == '('
                        || array[i] == ']' && chr == '['
                        || array[i] == '}' && chr == '{'){
                    obj.pop();
                }
            }
        }
        if(obj.isEmpty()){
            System.out.println("Bracket Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }
}