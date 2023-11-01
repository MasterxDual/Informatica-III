package Practico3.tests;

import Practico3.utils.AVLNode;
import Practico3.utils.AVLTree;

public class AvlTreeTest <U extends Comparable<U>> {
    public AVLTree<Integer> createFirstAvlTree() {
        AVLNode<Integer> rootNode = new AVLNode<>(10);
        AVLTree<Integer> avlTree = new AVLTree<>(rootNode);

        avlTree.insert(avlTree.getRoot(), 100);
        avlTree.insert(avlTree.getRoot(), 20);        
        avlTree.insert(avlTree.getRoot(), 80);
        avlTree.insert(avlTree.getRoot(), 40);
        avlTree.insert(avlTree.getRoot(), 70);
        
        return avlTree;
    }
}
