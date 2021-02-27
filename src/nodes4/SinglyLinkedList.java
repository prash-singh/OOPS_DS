package nodes4;

public class SinglyLinkedList {
    Node head;
   // Node previous;
    public SinglyLinkedList(){
        head = null;
    }

    public void insert(Node newnode){
        if(head == null){
            head = newnode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }//end of insert method

    public void search(int number){
        int count=0;
        int pos =0;
        Node temp = head;
        while(temp!= null){
            count++;
            if(temp.data == number){
                pos = count;
            }
            temp = temp.next;
        }//end of while loop
        System.out.println(pos);
    }//end of search method

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
