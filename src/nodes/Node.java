package nodes;

 class Node {
    private int data;
    private Node next;  //instance variable

    public Node(int data){ //constructor
        this.data = data;
        next = null;
    }

     public int getData() {
         return data;
     }

     public Node getNext() {
         return next;
     }

     public void setNext(Node next) {
         this.next = next;
     }
 }
