package Practico3.utils;

public class BinaryTree <U> {
    TreeNode<U> root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(TreeNode<U> root) {
        this.root = root;
    }

    public TreeNode<U> getRoot() {
        return this.root;
    }

    /**
     * Checks if tree is empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return this.root == null;
    }
 
    /**
     * Creates a new tree, using three parameters
     * @param leftBranch leftNode
     * @param value of the root-node
     * @param rightBranch rightNode
     * @return tree node created
     */
    public TreeNode<U> newTree(TreeNode<U> leftBranch, U value, TreeNode<U> rightBranch) {
        return new TreeNode<>(value, leftBranch, rightBranch);
    }
}
