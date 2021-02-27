package bracketproblem;

public class StackOfBracket {
    int top;
    int size;
    char arr[];
    public StackOfBracket(int size){
        top =-1;
        this.size = size;
        arr = new char[size];
    }

    public StackOfBracket() {

    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top==size-1);
    }

    public void push(char val){
        if(!isFull()) {
            arr[top + 1] = val;
            top++;
        }
    }

    public void pop(){
        arr[top] =0;
        top--;
    }

    public char peek(){
        char temp = arr[top];
        return temp;
    }
}
