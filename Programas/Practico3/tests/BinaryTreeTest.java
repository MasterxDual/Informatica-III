package Practico3.tests;

import java.util.Random;

import Practico3.utils.BinaryTree;
import Practico3.utils.TreeNode;

public class BinaryTreeTest <T extends Comparable<T>> {
    public BinaryTree<Integer> createRandomBinaryTree() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        TreeNode<Integer> nodeA;
        TreeNode<Integer> nodeB;
        TreeNode<Integer> nodeC;
        TreeNode<Integer> nodeD;
        TreeNode<Integer> nodeE;
        TreeNode<Integer> nodeF;
        TreeNode<Integer> nodeG;
        TreeNode<Integer> nodeH;
        TreeNode<Integer> nodeI;
        TreeNode<Integer> nodeJ;
        Random rand = new Random();

        //25 <-- 10 <-- 3 --> 5 --> 70
        nodeH = tree.newTree(null, rand.nextInt(26), null);
        nodeI = tree.newTree(null, rand.nextInt(26), null);
        nodeA = tree.newTree(nodeH, rand.nextInt(26), null);
        nodeB = tree.newTree(null, rand.nextInt(26), nodeI);
        nodeC = tree.newTree(nodeA, rand.nextInt(26), nodeB);
        
        //8 <-- 1 --> 11 --> 50
        nodeJ = tree.newTree(null, rand.nextInt(26), null);
        nodeD = tree.newTree(null, rand.nextInt(26), null);
        nodeE = tree.newTree(null, rand.nextInt(26), nodeJ);
        nodeF = tree.newTree(nodeD, rand.nextInt(26), nodeE);

        //(25 <-- 10 <-- 3 --> 5 --> 70) 3 <-- 100 --> 1 donde tenemos que el nodo 1 esta asi: (8 <-- 1 --> 11 --> 50)
        nodeG = tree.newTree(nodeC, rand.nextInt(26), nodeF);
        
        return new BinaryTree<>(nodeG);
    }
}
