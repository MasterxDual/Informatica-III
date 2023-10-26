package Practico3.utils;

public class AVLNode<U> extends TreeNode<U>{
    int height; //Height difference between the left subtree and the right subtree of a node
    AVLNode<U> leftAVLNode;
    AVLNode<U> rightAVLNode;

    public AVLNode(U value) {
        super(value);
        this.leftAVLNode = this.rightAVLNode = null;
        this.height = 1;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public AVLNode<U> getLeftNode() {
        return this.leftAVLNode;
    }

    public void setLeftNode(AVLNode<U> leftAVLNode) {
        this.leftAVLNode = leftAVLNode;
    }

    @Override
    public AVLNode<U> getRightNode() {
        return this.rightAVLNode;
    }

    public void setRigthNode(AVLNode<U> rigthAVLNode) {
        this.rightAVLNode = rigthAVLNode;
    }
}
