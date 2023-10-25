package Practico3.utils;

public class AVLNode<U> extends TreeNode<U>{
    int height; //Height difference between the left subtree and the right subtree of a node

    public AVLNode(U value) {
        super(value);
        this.height = 1;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
