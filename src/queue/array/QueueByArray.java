package queue.array;

public class QueueByArray {
    int arr[];
    int beginning;
    int top;
    int size;

    public void insert(int size){
        arr = new int[size];
        beginning = -1;
        top = -1;
        this.size = size;
    }

    public QueueByArray() {

    }

    public boolean isQueueEmpty(){
        return (top==-1);
    }

    public boolean isQueueFull(){
        return (top == arr.length-1);
    }

    public void enQueue(int val){
        if(isQueueFull()){
            System.out.println("Array is full");
            return;
        }
        else if(isQueueEmpty()) {
            top++;
            beginning++;
            arr[top] = val;
        }else{
            arr[top + 1] = val;
            top++;
        }
    }

    public void deQueue(){
        if(!isQueueEmpty()){
            System.out.println(arr[beginning]);
            beginning++;
        } else{
            System.out.println("Queue is empty");
            return;
        }
        if(beginning>top){
            beginning = top = -1;
        }
    }

    public void peekQueue(){
        if(!isQueueEmpty()){
            System.out.println(arr[beginning]);

        }
    }

    public void displayQueue(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
