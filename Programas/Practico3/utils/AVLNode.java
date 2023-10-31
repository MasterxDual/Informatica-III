package Practico3.utils;

public class AVLNode<U> {
    int height; //Height difference between the left subtree and the right subtree of a node
    AVLNode<U> leftNode;
    AVLNode<U> rightNode;
    U value;

    public AVLNode(U value) {
        this.value = value;
        this.leftNode = this.rightNode = null;
        this.height = 1;
    }

    public AVLNode(U value, AVLNode<U> leftNode, AVLNode<U> rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.height = 1;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public AVLNode<U> getLeftNode() {
        return this.leftNode;
    }

    public void setLeftNode(AVLNode<U> leftNode) {
        this.leftNode = leftNode;
    }

    public AVLNode<U> getRightNode() {
        return this.rightNode;
    }

    public void setRigthNode(AVLNode<U> rightNode) {
        this.rightNode = rightNode;
    }

    public U getValue() {
        return this.value;
    }

    public void setValue(U value) {
        this.value = value;
    }

    public void printValueNode() {
        System.out.println(this.value + " ");
    }
}
