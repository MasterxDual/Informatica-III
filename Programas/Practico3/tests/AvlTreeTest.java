package Practico3.tests;

import Practico3.utils.AVLNode;
import Practico3.utils.AVLTree;

public class AvlTreeTest <U extends Comparable<U>> {
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
