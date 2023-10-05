package Practico3.utils;

import Practico3.exceptions.DuplicateItemException;

public class BinarySearchTree<U extends Comparable<U>> extends BinaryTree <U> {
    public BinarySearchTree() {
        super();
    }

    public BinarySearchTree(TreeNode<U> root) {
        this.root = root;
    }

    /**
     * Finds a node of the three, using the search ordering of binary search trees. 
     * @param value to find
     * @param root of the tree (or sub-trees when searching for the element)
     * @return the found node of the tree, null if not found
     */
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

    /**
     * Inserts a new element to the binary search tree. 
     * Uses the same search that is used to find a node. 
     * If not found, creates a new node (so it is inserting the node, uses the function for which it was created).
     * @param value to insert
     * @param root of the three 
     * @return root of the three, or sub-trees when doing the search back recursively
     * @throws DuplicateItemException
     */
    public TreeNode<U> insert(U value, TreeNode<U> root) throws DuplicateItemException {
        if(root == null) {
            root = new TreeNode<>(value);
        } else if(value.compareTo(root.getValue()) < 0) {
            root.leftNode = insert(value, root.leftNode);
        } else if(value.compareTo(root.getValue()) > 0) {
            root.rightNode = insert(value, root.rightNode);
        } else {
            throw new DuplicateItemException((double)value);
        }
        return root;

    }
}
