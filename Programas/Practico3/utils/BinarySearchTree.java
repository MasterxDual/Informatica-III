package Practico3.utils;

import Practico3.exceptions.DuplicateItemException;
import Practico3.exceptions.ItemNotFoundException;

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

    /**
     * Finds the smallest item in a subtree
     * @param root of the tree
     * @return minimun node of the tree
     */
    public TreeNode<U> findMin(TreeNode<U> root) {
        if(root != null) {
            while(root.leftNode != null) {
                root = root.leftNode;
            }
        }
        return root;
    }

    /**
     * Removes minimum item from a subtree
     * @param root the node that roots the tree
     * @return the new root
     * @throws ItemNotFoundException if root is empty
     */
    public TreeNode<U> removeMin(TreeNode<U> root) throws ItemNotFoundException {
        if(root == null) {
            throw new ItemNotFoundException();
        } else if(root.leftNode != null) {
            root.leftNode = removeMin(root.leftNode);
            return root;
        } else {
            return root.rightNode;
        }
    }

    /**
     * Remove a node from a subtree.
     * @param root the node that roots the tree.
     * @param value the item to remove.
     * @return the new root.
     * @throws ItemNotFoundException if value is not found.
     */
    public TreeNode<U> dtree(TreeNode<U> root, U value) throws ItemNotFoundException {
        if(root == null) {
            throw new ItemNotFoundException(value.toString());
        } else if(value.compareTo(root.getValue()) < 0) {
            root.leftNode = dtree(root.leftNode, value);
        } else if (value.compareTo(root.getValue()) > 0) {
            root.rightNode = dtree(root.rightNode, value);
        } else if(root.leftNode != null && root.rightNode != null) {
            root.setValue(findMin(root.rightNode).getValue());
            root.rightNode = removeMin(root.rightNode);
        } else {
            root = (root.leftNode != null) ? root.leftNode : root.rightNode;
        }

        return root;
    }
}
