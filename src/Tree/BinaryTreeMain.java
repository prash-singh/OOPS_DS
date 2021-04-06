package Tree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree obj = new BinaryTree();
        BinaryTree obj1 = new BinaryTree();
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        Node n = new Node(n1);
        obj.insert(n1);
        obj.insert(n2);
        obj.insert(n3);
        obj.preOrder(n);
    }

}
