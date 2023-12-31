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
    /* public void preOrder(TreeNode<U> root) {
        //Caso base: que el subarbol este vacio (root == null)
        if(root != null) {
            root.printValueNode();
            preOrder(root.getLeftNode());
            preOrder(root.getRightNode());
        }
    }  */
    
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

    /**Calculates the depth (profundidad o cantidad de niveles) of the tree.
     * This is the rustic method (coded by me). The following similar methods were extracted from the internet.
     * @param root of the tree
     * @return amount of levels of the tree (depth)
     */
    public int depth(TreeNode<U> root) {
        int leftMax = 0; 
        int rightMax = 0;
        
        if(root == null) {
            return 0;
        } 
        if(root.leftNode != null) {
            leftMax = depth(root.leftNode);
        }
        if(root.rightNode != null) {
            rightMax = depth(root.rightNode);
        } 

        return Math.max(leftMax, rightMax) + 1;
    }

   /*  //Bottom-up Solution
    public int depth(TreeNode<U> root) {
        if(root == null) {
            return 0;
        } 
        int leftDepth = depth(root.leftNode);
        int rightDepth = depth(root.rightNode);

        return Math.max(leftDepth, rightDepth) + 1;
    } 
  */
    /*  Other solution for depth (Top-down Solution):
    int answer;
    public void depth(TreeNode<U> root, int depth) {
        if(root == null) {
            return;
        }
        if(root.leftNode == null && root.rightNode == null) {
            answer = Math.max(answer, depth);
        }
        depth(root.leftNode, depth + 1);
        depth(root.rightNode, depth + 1);
    } */
    
    /** Prints all leaves nodes (nodos hoja) of the tree.
     * @param root of the tree who have the leaves nodes to be printed
     */
    public void printLeaves(TreeNode<U> root) {
        if(root == null) {
            return;
        }
        if(root.leftNode == null && root.rightNode == null) {
            System.out.print(root.value + ", ");
            return;
        }
        if(root.leftNode != null) {
            printLeaves(root.leftNode);
        } 
        if(root.rightNode != null) {
            printLeaves(root.rightNode);
        }

    }

    /**
     * Prints a binary tree with the sequence requested from the guide 6 exercise 2.
     * @param root of the binary tree.
     */
    public void printTree(TreeNode<U> root) {
        printTree(root, "", true, 0);
    }

    /**
     * Prints a binary tree with the sequence requested from the guide 6 exercise 2.
     * @param root of the binary tree.
     * @param prefix to print before the sequence and the root value.
     * @param isTail to check if is a tail or not.
     * @param flag to check if it is the first call of the function or not.
     */
    public void printTree(TreeNode<U> root, String prefix, boolean isTail, int flag) {
        if (root != null) {
            if(flag != 0) {
                System.out.println(prefix + (isTail ? "└── " : "├── ") + root.getValue());
            } else {
                System.out.println("    " + root.getValue());
            }
            flag++;

            if (root.leftNode != null || root.rightNode != null) {
                if (root.leftNode != null) {
                    if (root.rightNode != null) {
                        printTree(root.leftNode, prefix + (isTail ? "    " : "│   "), false, flag);
                        printTree(root.rightNode, prefix + (isTail ? "    " : "│   "), true, flag);
                    } else {
                        printTree(root.leftNode, prefix + (isTail ? "    " : "│   "), true, flag);
                    }
                } else {
                    printTree(root.rightNode, prefix + (isTail ? "    " : "│   "), true, flag);
                }
            }
        }
    }
}

