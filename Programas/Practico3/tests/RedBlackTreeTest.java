package Practico3.tests;

import Practico3.utils.RedBlackTree;

public class RedBlackTreeTest <T extends Comparable<T>> {
    public RedBlackTree<Integer> createFirstRedBlackTree() {
        RedBlackTree<Integer> redBlackTree = new RedBlackTree<>(Integer.class);

        redBlackTree.insert(10);
        redBlackTree.insert(20);
        redBlackTree.insert(30);
        redBlackTree.insert(40);
        redBlackTree.insert(50);
        redBlackTree.insert(60);
        redBlackTree.insert(70);

        return redBlackTree;
    }

    public RedBlackTree<Integer> createSecondRedBlackTree() {
        RedBlackTree<Integer> redBlackTree = new RedBlackTree<>(Integer.class);

        redBlackTree.insert(10);
        redBlackTree.insert(20);
        redBlackTree.insert(30);
        redBlackTree.insert(40);
        redBlackTree.insert(50);
        redBlackTree.insert(60);
        redBlackTree.insert(70);
        redBlackTree.delete(30);

        return redBlackTree;
    }

    public RedBlackTree<Integer> createThirdRedBlackTree() {
        RedBlackTree<Integer> redBlackTree = new RedBlackTree<>(Integer.class);

        redBlackTree.insert(80);
        redBlackTree.insert(40);
        redBlackTree.insert(90);
        redBlackTree.insert(100);
        redBlackTree.insert(20);
        redBlackTree.rightRotate(redBlackTree.getRoot().getLeftNode());
        redBlackTree.leftRotate(redBlackTree.getRoot().getRightNode());
        redBlackTree.insert(85);

        return redBlackTree;
    }

}
