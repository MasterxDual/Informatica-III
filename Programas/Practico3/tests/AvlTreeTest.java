package Practico3.tests;

import Practico3.utils.AVLNode;
import Practico3.utils.AVLTree;

public class AvlTreeTest <U extends Comparable<U>> {
    /**
     * Creates an avl-tree, inserting values 10, 100, 20, 80, 40 and 70.
     * @return the avl-tree created.
     */
    public AVLTree<Integer> createFirstAvlTree() {
        AVLNode<Integer> rootNode = new AVLNode<>(10);
        AVLTree<Integer> avlTree = new AVLTree<>(rootNode);

        avlTree.insertElement(100);
        avlTree.insertElement(20);
        avlTree.insertElement(80);
        avlTree.insertElement(40);
        avlTree.insertElement(70);

        return avlTree;
    }
    
    /**
     * Creates an avl-tree, inserting values 5, 10, 20, 30, 40, 50 and 60.
     * @return the avl-tree created.
     */
    public AVLTree<Integer> createSecondAvlTree() {
        AVLNode<Integer> rootNode = new AVLNode<>(5);
        AVLTree<Integer> avlTree = new AVLTree<>(rootNode);

        avlTree.insertElement(10);
        avlTree.insertElement(20);
        avlTree.insertElement(30);
        avlTree.insertElement(40);
        avlTree.insertElement(50);
        avlTree.insertElement(60);

        return avlTree;
    }

    /**
     * Creates an avl-tree, inserting values 4, 2, 30, 1, 10, 5, 20, 50, 40 and 60.
     * @return the avl-tree created.
     */
    public AVLTree<Integer> createThirdAvlTree() {
        AVLNode<Integer> rootNode = new AVLNode<>(4);
        AVLTree<Integer> avlTree = new AVLTree<>(rootNode);

        avlTree.insertElement(2);
        avlTree.insertElement(30);
        avlTree.insertElement(1);
        avlTree.insertElement(10);
        avlTree.insertElement(5);
        avlTree.insertElement(20);
        avlTree.insertElement(50);
        avlTree.insertElement(40);
        avlTree.insertElement(60);

        return avlTree;
    }
}
