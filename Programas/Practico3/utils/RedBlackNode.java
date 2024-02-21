package Practico3.utils;

public class RedBlackNode<T> {
    T value;
    RedBlackNode<T> leftNode;
    RedBlackNode<T> rightNode;
    int colour; //Colour red is 1, colour black is 0.

    public RedBlackNode(T value) {
        this.value = value;
        this.colour = 1; //Every new node is red.
        this.leftNode = this.rightNode = null;
    }
    
    public RedBlackNode(T value, RedBlackNode<T> leftNode, RedBlackNode<T> rightNode) {
        this.value = value;
        this.colour = 1; //Every new node is red.
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public RedBlackNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(RedBlackNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public RedBlackNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(RedBlackNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    public void printValueNode() {
        System.out.println(this.value + " ");
    }

}
