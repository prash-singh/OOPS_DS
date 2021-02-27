package nodes;

 class SinglyLinkedList {
    Node head; //instance variable
    public  SinglyLinkedList(){
        head = null;
    }

    public void insert(Node newnode){
        if(head == null){
            head = newnode;
        }//end of if
        else{
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }//end of while
            temp.setNext(newnode);
        }//end of else
    }//end of insert


     public void insertAtBegining(Node newnode){
        newnode.setNext(head);
        head = newnode;
     }//end of insertAtBegining


     public void deleteAtBegining(Node newnode){

     }//end of deleteAtBegining


     public void insertAtPosition(int pos , Node newnode){
        Node temp = head;
        for(int i=0; i<pos-1; i++){
            temp.setNext(temp);
        }
        newnode.setNext(temp.getNext());
        temp.setNext(newnode);
     }//end of the insertAtPosition


     public void deleteAtPosition(int pos ){
        if(head == null){
            System.out.println("No element found");
        }else{
            Node current = head;
            Node prev = null;

            for (int i = 0; i <pos-1 ; i++) {
                prev = current;
                current.setNext(current);
            }
            prev.setNext(current.getNext());

        }
     }//end of deleteAtPosition

    public void display() {
        if (head == null) {
            System.out.println("No Element Present");
        } else{
            Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
    }//end of display method


} //end of the SinglyLinkedList
