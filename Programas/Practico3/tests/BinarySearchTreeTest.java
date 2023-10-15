package Practico3.tests;

import java.util.Random;

import Practico3.exceptions.DuplicateItemException;
import Practico3.utils.BinarySearchTree;
import Practico3.utils.TreeNode;

public class BinarySearchTreeTest <T extends Comparable <T>>{
    private Random random = new Random();

    /**
     * Created a random binary search tree with double numbers from 0 to 26.
     * @return an instance of the object of the created random binary search tree
     */
    public BinarySearchTree<Double> createRandomBinarySearchTree() {
        TreeNode<Double> rootNode = new TreeNode<>(this.random.nextDouble(26));
        BinarySearchTree<Double> tree = new BinarySearchTree<>(rootNode);

        try {
            tree.insert(this.random.nextDouble(26), rootNode);
            tree.insert(this.random.nextDouble(26), rootNode);
            tree.insert(this.random.nextDouble(26), rootNode);
            tree.insert(this.random.nextDouble(26), rootNode);
            tree.insert(this.random.nextDouble(26), rootNode);
            tree.insert(this.random.nextDouble(26), rootNode);
        } catch (DuplicateItemException e) {
            System.out.println(e.getMessage());            
        }
        return tree;
    } 

    /**
     * Creates a predefined binary search tree of integer numbers. It was created by me.
     * @return an instance of the object of the created binary search tree.
    */
    public BinarySearchTree<Integer> createBinarySearchTree() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        TreeNode<Integer> nodeA = tree.newTree(null, 10, null);
        TreeNode<Integer> nodeB = tree.newTree(null, 17, null);
        TreeNode<Integer> nodeC = tree.newTree(nodeA, 15, nodeB);
        TreeNode<Integer> nodeD = tree.newTree(null, 25, null);
        TreeNode<Integer> nodeE = tree.newTree(null, 33, null);
        TreeNode<Integer> nodeF = tree.newTree(nodeD, 30, nodeE);
        TreeNode<Integer> nodeG = tree.newTree(nodeC, 20, nodeF);

        return new BinarySearchTree<>(nodeG);
    }
}
