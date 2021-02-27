package palandrom;

public class StackByArray {
    char arr[];
    int top;
    int size;
    public StackByArray(){

    }//end of constructor

    public void insertArraySize(int val){
        arr = new char[val];
        top =-1;
        size = val;
    }//end of insert queue.queue.array size method

    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isStackFull(){
        return (top == arr.length-1);
    }

    public void push(char val){
        if(!isStackFull()){
            arr[top+1] =val;
            top++;
        }//end of if statement
    }//end of push method

    public char pop(){
        char temp = arr[top];
        arr[top] =0;
        top = top-1;
        return temp;
    }//end of pop method
}//end of stack class
