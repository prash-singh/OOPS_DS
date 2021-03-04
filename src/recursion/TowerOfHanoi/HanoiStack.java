package recursion.TowerOfHanoi;

public class HanoiStack {
    char sourceArr[];
    char auxArr[];
    char destinationArr[];
    int sourceTop , auxTop, destinationTop;

    public HanoiStack(int size){
        sourceArr = new char[size];
        auxArr = new char[size];
        destinationArr = new char[size];
        sourceTop = auxTop = destinationTop = -1;
    }

    public void push(char data){
        sourceArr[sourceTop+1] = data;
        sourceTop++;
    }
    public void checkHanoi(int n, char s, char a, char d ){
        if(sourceArr.length == 1){
            destinationArr[0] = sourceArr[0];
        }else{
            
        }
    }
}
