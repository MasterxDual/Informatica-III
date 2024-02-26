package Practico3.tests;

import Practico3.utils.RedBlackTree;

public class RedBlackTreeTest <T extends Comparable<T>> {
    /**
     * Creates a red-black tree, inserting numbers 10, 20, 30, 40, 50, 60, and 70 respectively.
     * @return the red-black tree created.
     */
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

    /**
     * Creates another red-black tree, inserting the same numbers of first red-black tree, with the
     * difference that it removes the element with value '30'.
     * @return the red-black tree created.
     */
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

    /**
     * Created a third red-black tree, inserting values 80, 40, 90, 100 and 20. Then
     * rotates it right in the left node of root node, then rotates it left in the
     * right node of root node and finally inserts value 85.
     * @return the red-black tree created.
     */
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
