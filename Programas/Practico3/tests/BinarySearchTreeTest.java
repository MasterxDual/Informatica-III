package Practico3.tests;

import java.util.Random;

import Practico3.exceptions.DuplicateItemException;
import Practico3.utils.BinarySearchTree;
import Practico3.utils.TreeNode;

public class BinarySearchTreeTest <T extends Comparable <T>>{
    public BinarySearchTree<Double> createRandomBinarySearchTree() {
        Random rand = new Random();
        TreeNode<Double> rootNode = new TreeNode<>(rand.nextDouble(26));
        BinarySearchTree<Double> tree = new BinarySearchTree<>(rootNode);

        try {
            tree.insert(rand.nextDouble(26), rootNode);
            tree.insert(rand.nextDouble(26), rootNode);
            tree.insert(rand.nextDouble(26), rootNode);
            tree.insert(rand.nextDouble(26), rootNode);
            tree.insert(rand.nextDouble(26), rootNode);
            tree.insert(rand.nextDouble(26), rootNode);
        } catch (DuplicateItemException e) {
            System.out.println(e.getMessage());            
        }
        return tree;
    } 
}
