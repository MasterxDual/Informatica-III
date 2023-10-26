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
        return (root != null) ? (getHeight(root.getLeftNode()) - getHeight(root.getRightNode())) : 0;
    }

    /**
     * Updates the heigth of the avl tree.
     * @param root of the avl tree to update the heigth.
     */
    public void updateHeigth(AVLNode<T> root) {
        root.setHeight(1 + Math.max(getHeight(root.getLeftNode()), getHeight(root.getRightNode())));
    }

    AVLNode<T> rightRotate(AVLNode<T> root) {
        AVLNode<T> x = root.leftAVLNode;
        AVLNode<T> t2 = x.rightAVLNode;

        x.setRightNode(root);
        root.setLeftNode(t2);

        root.height = Math.max(getHeight(root.leftAVLNode), getHeight(root.rightAVLNode)) + 1;
        x.height = Math.max(getHeight(x.leftAVLNode), getHeight(x.rightAVLNode)) + 1;

        return x;
    }

    AVLNode<T> leftRotate(AVLNode<T> root) {
        AVLNode<T> y = root.rightAVLNode;
        AVLNode<T> t2 = y.leftAVLNode;

        y.setLeftNode(root);
        root.setRightNode(t2);

        root.height = Math.max(getHeight(root.leftAVLNode), getHeight(root.rightAVLNode)) + 1;
        y.height = Math.max(getHeight(y.leftAVLNode), getHeight(y.rightAVLNode)) + 1;

        return y;
    }
}
