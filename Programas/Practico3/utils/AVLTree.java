package Practico3.utils;

public class AVLTree <T extends Comparable<T>> extends BinarySearchTree<T> {
    public AVLTree() {
        super();
    }

    public AVLTree(AVLNode<T> root) {
        this.root = root;
    }

    /**
     * Returns the height of the avl tree.
     * @param root of the avl tree.
     * @return height of avl tree, 0 if there's no root.
     */
    public int getHeight(AVLNode<T> root) {
        return (root != null) ? root.getHeight() : 0;
    }

    /**
     * Returns balance factor of a node in an avl tree.
     * @param root of the avl tree.
     * @return factor balance of avl tree, 0 if there's no root.
     */
    public int getBalance(AVLNode<T> root) {
        return (root != null) ? (getHeight((AVLNode<T>) root.getLeftNode()) - getHeight((AVLNode<T>) root.getRightNode())) : 0;
    }

    /**
     * Updates the heigth of the avl tree.
     * @param root of the avl tree to update the heigth.
     */
    public void updateHeigth(AVLNode<T> root) {
        root.setHeight(1 + Math.max(getHeight((AVLNode<T>) root.getLeftNode()), getHeight((AVLNode<T>) root.getRightNode())));
    }
}
