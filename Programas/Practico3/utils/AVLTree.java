package Practico3.utils;

import Practico3.exceptions.ItemNotFoundException;

public class AVLTree <T extends Comparable<T>> {
    AVLNode<T> root;

    public AVLTree() {
        this.root = null;
    }

    public AVLTree(AVLNode<T> root) {
        this.root = root;
    }

    public AVLNode<T> getRoot() {
        return root;
    }

    public void setRoot(AVLNode<T> root) {
        this.root = root;
    }

    /** (IND)
     * Recorre el arbol de manera inOrder, primero recorre el subarbol izquierdo en orden (I) , luego
     * visita el nodo raiz (N), en tercer y ultimo lugar recorre el subarbol derecho en orden (D).
     * @param root of the binary tree
     */
    public void inOrder(AVLNode<T> root) {
        //Caso base: que el subarbol este vacio (root == null)
        if(root != null) {
            inOrder(root.getLeftNode());
            root.printValueNode();
            inOrder(root.getRightNode());
        }
    }

    /**
     * Calculates and returns the total number of nodes of a binary tree
     * @param root of the binary tree
     * @return total number of nodes
     */
    public int getNumNodes(AVLNode<T> root) {
        if(root == null) {
            return 0;
        } else {
            return 1 + getNumNodes(root.getLeftNode()) + getNumNodes(root.getRightNode());
        }
    }
    
    /**
     * Checks if tree is empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return this.root == null;
    }

    /**
     * Returns the height of the avl tree.
     * @param root of the avl tree.
     * @return height of avlpublictree, 0 if there's no root.
     */
    public int getHeight(AVLNode<T> root) {
        return (root != null) ? root.getHeight() : 0;
    }

    /**
     * Returns balance factor of a node in an avl tree.
     * @param root of the avl tree.
     * @return factor balance of avl tree, 0 if there's no root.
     */
    private int getBalance(AVLNode<T> root) {
        return (root != null) ? (getHeight(root.getLeftNode()) - getHeight(root.getRightNode())) : 0;
    }

    /**
     * Updates the heigth of the avl tree.
     * @param root of the avl tree to update the heigth.
     */
    public void updateHeigth(AVLNode<T> root) {
        root.setHeight(1 + Math.max(getHeight(root.getLeftNode()), getHeight(root.getRightNode())));
    }

    /** 
     * Rotates to the rigth one time the avl tree.
     * @param root of avl tree.
     * @return new root of avl tree.
     */
    private AVLNode<T> rightRotate(AVLNode<T> root) {
        AVLNode<T> x = root.leftNode;
        AVLNode<T> t2 = x.rightNode;

        x.setRigthNode(root);
        root.setLeftNode(t2);

        updateHeigth(root);
        updateHeigth(x);

        return x;
    }

    /**
     * Rotates to the left one time the avl tree.
     * @param root of avl tree.
     * @return new root of avl tree.
     */
    private AVLNode<T> leftRotate(AVLNode<T> root) {
        AVLNode<T> y = root.rightNode;
        AVLNode<T> t2 = y.leftNode;

        y.setLeftNode(root);
        root.setRigthNode(t2);

        updateHeigth(root);
        updateHeigth(y);

        return y;
    }

    /**
    * Finds the smallest item in a subtree
    * @param root of the tree
    * @return minimun node of the tree
    */
    public AVLNode<T> findMin(AVLNode<T> root) {
        if(root != null) {
            while(root.leftNode != null) {
                root = root.leftNode;
            }
        }
        return root;
    }

    /**
     * Inserts a new node to the avl tree.
     * @param root of avl tree.
     * @param element to be inserted.
     * @return root of the new avl tree
     */
    public AVLNode<T> insert(AVLNode<T> root, T element) {
        if (root == null) {
            return new AVLNode<>(element);
        }

        if (element.compareTo(root.value) < 0) {
            root.leftNode = insert(root.leftNode, element);
        } else if (element.compareTo(root.value) > 0) {
            root.rightNode = insert(root.rightNode, element);
        } else {
            return root;
        }

        // Updates heigth of actual node
        updateHeigth(root);

        // Get the balance factor of the node to check the balance
        int balance = getBalance(root);

        // Cases of imbalance and rotations
        // Left left case
        if (balance > 1 && element.compareTo(root.leftNode.value) < 0) {
            return rightRotate(root);
        }

        // Right right case
        if (balance < -1 && element.compareTo(root.rightNode.value) > 0) {
            return leftRotate(root);
        }

        // Left right case (double rotation)
        if (balance > 1 && element.compareTo(root.leftNode.value) > 0) {
            root.leftNode = leftRotate(root.leftNode);
            return rightRotate(root);
        }

        // Right left case (double rotation)
        if (balance < -1 && element.compareTo(root.rightNode.value) < 0) {
            root.rightNode = rightRotate(root.rightNode);
            return leftRotate(root);
        }

        return root;
    }

    /**
     * Deletes a node with a specific element from the AVL tree and maintains the balance of the tree.
     *
     * @param root The root node of the AVL tree.
     * @param element The element to be deleted from the tree.
     * @return The updated root node of the AVL tree after the deletion.
     * @throws Exception If the root node is null.
     */
    public AVLNode<T> delete(AVLNode<T> root, T element) throws ItemNotFoundException {
        if (root == null) {
            throw new ItemNotFoundException(element.toString());
        }
        if (element.compareTo(root.value) < 0) {
            root.leftNode = delete(root.leftNode, element);
        } else if (element.compareTo(root.value) > 0) {
            root.rightNode = delete(root.rightNode, element);
        } else {
            //Found node, it's time to eliminate it
            //Node with one son or without son's
            if ((root.leftNode == null) || (root.rightNode == null)) {
                AVLNode<T> temp = (root.leftNode != null) ? root.leftNode : root.rightNode;

                // Caso sin hijos
                if (temp == null) {
                    temp = root;
                    root = null;
                } else { // Caso un hijo
                    root = temp;
                }
            } else {
                // Nodo con dos hijos: obtener el sucesor inorden (mínimo valor en el subárbol derecho)
                AVLNode<T> temp = findMin(root.rightNode);

                  // Copiar el valor del sucesor inorden al nodo actual
                root.value = temp.value;

                // Eliminar el sucesor inorden
                root.rightNode = delete(root.rightNode, temp.value);
            }
        }
         // Actualizar la altura del nodo actual
        updateHeigth(root);

        // Obtener el factor de equilibrio del nodo actual
        int balance = getBalance(root);

        // Realizar las rotaciones según el factor de equilibrio
        // Caso izquierda-izquierda
        if (balance > 1 && getBalance(root.leftNode) >= 0)
            return rightRotate(root);

        // Caso izquierda-derecha
        if (balance > 1 && getBalance(root.leftNode) < 0) {
            root.leftNode = leftRotate(root.leftNode);
            return rightRotate(root);
        }

        // Caso derecha-derecha
        if (balance < -1 && getBalance(root.rightNode) <= 0)
            return leftRotate(root);

        // Caso derecha-izquierda
        if (balance < -1 && getBalance(root.rightNode) > 0) {
            root.rightNode = rightRotate(root.rightNode);
            return leftRotate(root);
        }

        // Devolver el nodo sin cambios
        return root;
    }

    /**
     * Double left rotation, first rotates to the left, then rotates to the right the avl tree previously rotated.
     * @param z node to be used as a root of the subtree to be rotated.
     * @return new root of the rotated avl tree.
     */
    private AVLNode<T> leftRightRotate(AVLNode<T> z) {
        AVLNode<T> t2 = z.leftNode;
        AVLNode<T> y = t2.rightNode;


        t2.setRigthNode(y.getLeftNode());
        y.setLeftNode(t2);

        z.setLeftNode(y.getRightNode());
        y.setRigthNode(z);

        updateHeigth(z);
        updateHeigth(t2);
        updateHeigth(y);

        return y;
    }

    /**
     * Double rigth rotation, first rotates to the right, then rotates to the left the avl tree previously rotated.
     * @param z node to be used as a root of the subtree to be rotated.
     * @return new root of the rotated avl tree.
     */
    private AVLNode<T> rightLeftRotate(AVLNode<T> z) {
        AVLNode<T> t2 = z.rightNode;
        AVLNode<T> y = t2.leftNode;


        t2.setLeftNode(y.getRightNode());
        y.setRigthNode(t2);

        z.setRigthNode(y.getLeftNode());
        y.setLeftNode(z);

        updateHeigth(z);
        updateHeigth(t2);
        updateHeigth(y);

        return y;
    }
}
