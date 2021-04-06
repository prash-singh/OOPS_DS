package Tree.BST;
/*
* Insert, Search, Delete, find max, find min
* traversal using inorder, preorder, postorder */

import Tree.Node;

public class BinarySearchTree {
    NodeBST root;

    public BinarySearchTree(){
        root = null;
    }

    public NodeBST insert(NodeBST root , NodeBST newNode) {
        if (root == null) {
            root = newNode;
            return root;
        }
        if(root.data > newNode.data){
            if(root.left == null){
                root.left = newNode;
            }else{
                insert(root.left , newNode);
            }
        }
        else{
            if(root.right == null){
                root.right = newNode;
            }else{
                insert(root.right, newNode);
            }
        }
        return root;
    }//end of the insert method

    public boolean search(NodeBST root, int value) {
        boolean found = false;
        if (root == null) {
            return false;
        }
        else if (root.data == value) {
            return true;
        }
        else if (root.data > value) {
            found = search(root.left, value);
        }
        else if(root.data < value){
            found = search(root.right, value);
        }

    return found;

    }

    public void inorder(NodeBST root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        inorder(root.right);
        inorder(root.left);
    }
}
