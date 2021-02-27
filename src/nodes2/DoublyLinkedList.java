package nodes2;

public class DoublyLinkedList {
    Node head;
    public DoublyLinkedList(){
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
            newnode.previous = temp;
        }
    }//end of insert

    public void deleteAtLast(){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.previous.next = null;

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
