package stack.linkedlist;

public class StackByLinkedList {
    Node top;

    public void push(Node newnode){
        newnode.next = top;
        top=newnode;
    }

    public void pop(){
        if(top == null){
            System.out.println("Element poped" + top.data);
            top = top.next;
        }else{
            System.out.println("List is empty");
        }
    }

    public void display(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

