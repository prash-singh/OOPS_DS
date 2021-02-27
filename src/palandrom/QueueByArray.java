package palandrom;

public class QueueByArray {
    char arr[];
    int beginning;
    int top;
    int size;
    public QueueByArray(){

    }//end of constructor

    public void insertArraySize(int size){
        arr = new char[size];
        beginning = 0;
        top = -1;
        this.size = size;
    }//end of insert size method

    public boolean isQueueEmpty(){
        return (top == -1);
    }

    public boolean isQueueFull(){
        return (top == arr.length-1);
    }

    public void enqueue(char val){
        if(!isQueueFull()){
            arr[top+1] = val;
            top++;
        }
    }//end of enQueue

    public char deQueue(){
        char temp = arr[beginning];
        beginning++;
       // System.out.println(temp);
        return temp;
    }//end of deQueue
}//end of Queue class
