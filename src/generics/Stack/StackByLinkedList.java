package generics.Stack;

public class StackByLinkedList<E> implements StackADT {
    Node<E> head;
    public StackByLinkedList() {
        head = null;
    }

    public void push(Object data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public boolean isEmpty(){
        return (head ==null);
    }
    public E pop(){
        E result;
        if(isEmpty()){
            result = null;
            return result;
        }else{
            result = head.data;
            head = head.next;
            return result;
        }
    }

    public E peek(){
        E result;
        if(isEmpty()){
            result = null;
            return result;
        }else{
            result = head.data;
            return result;
        }
    }

    public void display(){
        Node<E> temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
