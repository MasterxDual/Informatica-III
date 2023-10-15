package Practico3.tests;

import java.util.Random;

import Practico3.utils.BinaryTree;
import Practico3.utils.TreeNode;

public class BinaryTreeTest <T extends Comparable<T>> {
    /**
     * Creates a random binary tree with integer numbers from 0 to 26.
     * @return an instance of the object of the random binary tree created
     */
    public BinaryTree<Integer> createRandomBinaryTree() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Random rand = new Random();

        //25 <-- 10 <-- 3 --> 5 --> 70
        TreeNode<Integer> nodeH = tree.newTree(null, rand.nextInt(26), null);
        TreeNode<Integer> nodeI = tree.newTree(null, rand.nextInt(26), null);
        TreeNode<Integer> nodeA = tree.newTree(nodeH, rand.nextInt(26), null);
        TreeNode<Integer> nodeB = tree.newTree(null, rand.nextInt(26), nodeI);
        TreeNode<Integer> nodeC = tree.newTree(nodeA, rand.nextInt(26), nodeB);
        
        //8 <-- 1 --> 11 --> 50
        TreeNode<Integer> nodeJ = tree.newTree(null, rand.nextInt(26), null);
        TreeNode<Integer> nodeD = tree.newTree(null, rand.nextInt(26), null);
        TreeNode<Integer> nodeE = tree.newTree(null, rand.nextInt(26), nodeJ);
        TreeNode<Integer> nodeF = tree.newTree(nodeD, rand.nextInt(26), nodeE);

        //(25 <-- 10 <-- 3 --> 5 --> 70) 3 <-- 100 --> 1 donde tenemos que el nodo 1 esta asi: (8 <-- 1 --> 11 --> 50)
        TreeNode<Integer> nodeG = tree.newTree(nodeC, rand.nextInt(26), nodeF);
        
        return new BinaryTree<>(nodeG);
    }
    
    /**
     * Creates a predefined binary tree with integer numbers. This tree was copied from the exercise 2 of the guide 6.
     * @return an instance of the object of the binary tree created
     */
    public BinaryTree<Integer> createBinaryTree() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        
        TreeNode<Integer> nodeH = tree.newTree(null, 1, null);
        TreeNode<Integer> nodeI = tree.newTree(null, 11, null);
        TreeNode<Integer> nodeA = tree.newTree(nodeH, 2, nodeI);

        TreeNode<Integer> nodeB = tree.newTree(null, 13, null);
        TreeNode<Integer> nodeC = tree.newTree(nodeB, 14, null);
        TreeNode<Integer> nodeZ = tree.newTree(nodeA, 10, nodeC);
        
        TreeNode<Integer> nodeJ = tree.newTree(null, 8, null);
        TreeNode<Integer> nodeD = tree.newTree(nodeJ, 20, null);

        TreeNode<Integer> nodeE = tree.newTree(nodeZ, 3, nodeD);
        
        return new BinaryTree<>(nodeE);
    }
}
