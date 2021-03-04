package stack.array;

public class StackByArray {
    int arr[];
    int top;

    public void insertSize(int size){
        arr = new int[size];
        top = -1;
    }

    public StackByArray() {

    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isStackFull(){
        return (top== arr.length-1);
    }

    public void push(int data){
        if(!isStackFull()){
            arr[top+1] = data;
            top++;
        }else{
            System.out.println("Stack is full");
        }
    }

    public void pop(){
        if(!isEmpty()){
            System.out.println(arr[top]);
            arr[top]=0;
            top=top-1;
        }else{
            System.out.println("array is empty");
        }
    }
    public void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
