package Practico3.utils;

public class TreeNode <T> {
    T value;
    TreeNode<T> leftNode;
    TreeNode<T> rightNode;

    public TreeNode(T value) {
        this.value = value;
        this.leftNode = this.rightNode = null;
    }
    
    public TreeNode(T value, TreeNode<T> leftNode, TreeNode<T> rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    /**
     * Returns the value of the tree node 
     * @return value from tree node
     */
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Returns the sub-tree left node (sub arbol izquierdo) 
     * @return left node sub-tree
     */
    public TreeNode<T> getLeftNode() {
        return leftNode;
    }

    /**
     * Sets the left branch of the tree (rama izquierda)
     * @param leftNode 
     */
    public void setLeftNode(TreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    /**
     * Returns the sub-tree right node (sub arbol derecho) 
     * @return rigth node sub-tree
     */
    public TreeNode<T> getRightNode() {
        return rightNode;
    }
    
    /**
     * Sets the right branch of the tree (rama derecha)
     * @param rightNode
     */
    public void setRightNode(TreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }
}
