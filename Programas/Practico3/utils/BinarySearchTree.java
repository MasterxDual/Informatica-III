package Practico3.utils;

public class BinarySearchTree<U extends Comparable<U>> extends BinaryTree <U> {
    public BinarySearchTree() {
        super();
    }

    public TreeNode<U> findNode(U value, TreeNode<U> root) {
        while(root != null) {
            if(value.compareTo(root.getValue()) < 0) {
                root = root.leftNode;       
            } else if(value.compareTo(root.getValue()) > 0) {
                root = root.rightNode;
            } else {
                return root; //Match
            }
        }

        return null; //Not found
    } 
}
