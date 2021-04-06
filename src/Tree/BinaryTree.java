package Tree;

import java.util.Scanner;

public class BinaryTree {
    Node root;
    public BinaryTree(){
        root = null;
    }

    Scanner scn = new Scanner(System.in);

    public boolean isEmpty(){
        return (root == null);
    }

    public void insert(int data){
        Node newNode = new Node(data);

        }

    public void preOrder(Node newNode){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
}
