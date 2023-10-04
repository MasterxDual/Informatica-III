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

    /*2. Escriba un método de recorrido de árbol binario denominado inorder para
    mostrar el árbol generado en forma ordenada. */
    /** (IND)
     * Recorre el arbol de manera inOrder, primero recorre el subarbol izquierdo en orden (I) , luego
     * visita el nodo raiz (N), en tercer y ultimo lugar recorre el subarbol derecho en orden (D).
     * @param root of the binary tree
     */
    public void inOrder(TreeNode<U> root) {
        //Caso base: que el subarbol este vacio (root == null)
        if(root != null) {
            inOrder(root.getLeftNode());
            root.printValueNode();
            inOrder(root.getRightNode());
        }
    }

    //Los dejo para contemplar los otros dos tipos de recorridos 
    /** (NID)
     * Recorre el arbol de manera preOrder, el nodo raiz va antes que los subarboles. 
     * Primero visita el nodo raiz (N), luego recorre el subarbol izquierdo en preorden (I), luego
     * en tercer y ultimo lugar recorre el subarbol derecho en preorden (D).
     * @param root of the binary tree
     */
    /*
    public void preOrder(TreeNode<U> root) {
        //Caso base: que el subarbol este vacio (root == null)
        if(root != null) {
            root.printValueNode();
            preOrder(root.getLeftNode());
            preOrder(root.getRightNode());
        }
    }*/ 
    
    /** (IDN)
     * Recorre el arbol de manera postOrder, el nodo raiz se procesa despues de que los dos subarboles se hayan procesado.
     * Primero recorre el subarbol izquierdo en postorden (I), luego recorre el subarbol derecho en postorden (D), y finalmente
     * visita el nodo raiz (N).
     * @param root of the binary tree
     */
    /*
    public void postOrder(TreeNode<U> root) {
        //Caso base: que el subarbol este vacio (root == null)
        if(root != null) {
            postOrder(root.getLeftNode());
            postOrder(root.getRightNode());
            root.printValueNode();
        }
    }*/

    /**
     * Calculates and returns the total number of nodes of a binary tree
     * @param root of the binary tree
     * @return total number of nodes
     */
    public int getNumNodes(TreeNode<U> root) {
        if(root == null) {
            return 0;
        } else {
            return 1 + getNumNodes(root.getLeftNode()) + getNumNodes(root.getRightNode());
        }
    }
    
}
