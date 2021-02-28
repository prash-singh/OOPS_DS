package priorityqueue;

public class PriorityQueue {
    Node head;
    public PriorityQueue(){
        head = null;
    }

    public boolean isEmpty(){
        return (head == null);
    }

    public void enqueue(Node newnode){
        if(head == null || newnode.priority < head.priority){
            newnode.next = head;
            head = newnode;
        }else{
            Node temp = head;
            while (temp.next!=null && temp.next.priority <= newnode.priority){
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.ch);
            temp = temp.next;
        }
    }


}
