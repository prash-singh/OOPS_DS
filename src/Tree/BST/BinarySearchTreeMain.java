package Tree.BST;
/* rules
* 1 - the left sub tree of a node has a key less than or equal to
*   its parent node's key

* 2 - the right sub tree of a node has a key greater than to its parent
*   node's key

* 3- the rule will be recursively applied to all the left and right sub
*   tree of the root

*/
public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTree obj = new BinarySearchTree();
        NodeBST n1 = new NodeBST(10);
        NodeBST n2 = new NodeBST(5);
        NodeBST n3 = new NodeBST(3);
        obj.insert(null, n1);
        obj.insert(n1, n2);
        obj.insert(n1, n3);

        System.out.println(obj.search(n1, 10));
        obj.inorder(n1);
    }
}
