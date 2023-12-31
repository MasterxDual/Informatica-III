package Practico3;

import Practico3.exceptions.ItemNotFoundException;
import Practico3.tests.AvlTreeTest;
import Practico3.tests.BinarySearchTreeTest;
import Practico3.tests.BinaryTreeTest;
import Practico3.tests.QueueTest;
import Practico3.tests.StackTest;
import Practico3.utils.AVLNode;
import Practico3.utils.AVLTree;
import Practico3.utils.BinarySearchTree;
import Practico3.utils.BinaryTree;
import Practico3.utils.Queue;
import Practico3.utils.QueueList;

public class Main {
    public static void main(String[] args) {
        StackTest test1 = new StackTest();
        QueueTest<Integer> test2 = new QueueTest<>(Integer.class);
        QueueTest<String> test3 = new QueueTest<>(String.class);
        QueueTest<Double> test4 = new QueueTest<>(Double.class);
        Queue<Integer> originalQueue1 = test2.createRandomQueue(5);
        Queue<Double> originalQueue2 = test4.createRandomQueue(5);
        QueueList<Integer> originalQueue3 = test2.createRandomQueueList(5);
        QueueList<Double> originalQueue4 = test4.createRandomQueueList(5);
        QueueList<String> originalQueue5 = test3.createRandomQueueList(5);
        BinaryTreeTest<Integer> treeTest1 = new BinaryTreeTest<>();
        BinaryTree<Integer> tree1 = new BinaryTree<>();
        BinarySearchTree<Integer> tree2 = new BinarySearchTree<>();
        BinarySearchTreeTest<Integer> treeTest2 = new BinarySearchTreeTest();
        BinarySearchTree<Double> tree3 = new BinarySearchTree<>();
        BinarySearchTreeTest<Double> treeTest3 = new BinarySearchTreeTest();
        AvlTreeTest<Integer> avlTreeTest1 = new AvlTreeTest<>();
        AVLTree<Integer> avlTree1 = new AVLTree<>();

        /*
        test1.testStackInteger();
        test1.testStackString(); 
        System.out.println(test1.isPalindrome("Anita Lava La Tina") ? "Expression is palindrome" : "Expression isn´t palindrome");
        System.out.println(test1.isMathematicExpression("(((((2 + 3) * 5) - 8))") ? "Expression is equilibrated" : "Expression isn´t equilibrated");
        test1.testStackListInteger();
        test1.makeStackOfWords();
        System.out.println(test1.isBalancedExpression("((((3 + 2) * 5))") ? "Expression balanced" : "Expression isn´t balanced");

        test2.testQueueInteger();
        test2.testQueueString(); 
        System.out.println(test2.createRandomQueue(5));
        System.out.println(test3.createRandomQueue(5));
        System.out.println(test4.createRandomQueue(5));*/

        /* System.out.println("Cola original desordenada: " + originalQueue1);
        System.out.println("Cola ordenada de menor a mayor");
        System.out.println(test2.sortQueueDescending(originalQueue1));
        System.out.println("Cola original desordenada: " + originalQueue2);
        System.out.println("Cola ordenada de menor a mayor");
        System.out.println(test4.sortQueueDescending(originalQueue2));  */

        /* test1.convertToBinary(2573);  */

        /* test3.testQueueListString();
        test4.testQueueListDouble(); */

        /* System.out.println("Usted esta por comenzar a crear una cola enlazada con numeros enteros:");
        System.out.println("La suma de todos los elementos de la cola es igual a "+ test4.sumOfQueueNumbers(test4.createQueueListByInput())); */

        /* System.out.println("Cola original desordenada: ");
        test2.printQueue(originalQueue3);
        System.out.println("Cola ordenada de mayor a menor");
        test2.sortQueueListAscending(originalQueue3);
        test2.printQueue(originalQueue3);
        System.out.println("Cola original desordenada: ");
        test3.printQueue(originalQueue5);
        System.out.println("Cola ordenada de mayor a menor");
        test3.sortQueueListAscending(originalQueue5);
        test3.printQueue(originalQueue5);  */

        //System.out.println(test2.verifyPalindrome("A mi loca Colima"));

        /* tree1.inOrder(treeTest1.createRandomBinaryTree().getRoot());
        System.out.println("Numero de nodos del arbol creado es igual a " + tree1.getNumNodes(treeTest1.createRandomBinaryTree().getRoot())); */
        
        /* tree3.inOrder(treeTest3.createRandomBinarySearchTree().getRoot());
        System.out.println("Numero de nodos del arbol creado es igual a " + tree3.getNumNodes(treeTest3.createRandomBinarySearchTree().getRoot())); */

        /* System.out.println("Profundidad o altura del arbol es igual a " + tree1.depth(treeTest1.createRandomBinaryTree().getRoot()));

        System.out.println("Nodos hoja de otro arbol creado:");
        tree1.printLeaves(treeTest1.createRandomBinaryTree().getRoot()); */

        /* BinarySearchTree<Integer> treeA = treeTest2.createBinarySearchTree();
        tree2.inOrder(treeA.getRoot());
        System.out.println("Numero de nodos del arbol creado es igual a " + treeA.getNumNodes(treeA.getRoot()));
        System.out.println("Numero minimo del arbol: " + tree2.findMin(treeA.getRoot()).getValue());
        try {
            System.out.println("Minimum node eliminated:");
            tree2.removeMin(treeA.getRoot());
            tree2.inOrder(treeA.getRoot());
            System.out.println("Node 30 eliminated:");
            tree2.dtree(treeA.getRoot(), 30);
            tree2.inOrder(treeA.getRoot());
            System.out.println("Node 20 eliminated:");
            tree2.dtree(treeA.getRoot(), 20);
            tree2.inOrder(treeA.getRoot());
            tree2.dtree(treeA.getRoot(), 20);
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        } */

        /* BinaryTree<Integer> treeB = treeTest1.createBinaryTree();
        System.out.println("Profundidad del arbol es igual a " + tree1.depth(treeB.getRoot()));
        tree1.printTree(treeB.getRoot()); */

        /* AVLTree<Integer> treeC = avlTreeTest1.createFirstAvlTree();
        avlTree1.inOrder(treeC.getRoot());
        System.out.println("La cantidad de nodos del arbol avl es igual a " + avlTree1.getNumNodes(treeC.getRoot())); */

        /* AVLTree<Integer> treeD = avlTreeTest1.createSecondAvlTree();
        avlTree1.inOrder(treeD.getRoot());
        System.out.println("La cantidad de nodos del arbol avl es igual a " + avlTree1.getNumNodes(treeD.getRoot())); */

        /* AVLTree<Integer> treeE = avlTreeTest1.createThirdAvlTree();
        avlTree1.inOrder(treeE.getRoot());
        System.out.println("La cantidad de nodos del arbol avl es igual a " + avlTree1.getNumNodes(treeE.getRoot()));
        treeE.deleteElement(1);
        System.out.println("Nodo con valor 1 eliminado");
        avlTree1.inOrder(treeE.getRoot());
        System.out.println("La cantidad de nodos del arbol avl donde se eliminó al 1 es igual a " + avlTree1.getNumNodes(treeE.getRoot())); */

        AVLTree<Integer> treeF = avlTreeTest1.createThirdAvlTree();
        avlTree1.inOrder(treeF.getRoot());
        System.out.println("La cantidad de nodos del arbol avl es igual a " + avlTree1.getNumNodes(treeF.getRoot()));
        treeF.deleteElement(30);
        System.out.println("Nodo con valor 30 eliminado");
        avlTree1.inOrder(treeF.getRoot());
        System.out.println("La cantidad de nodos del arbol avl donde se eliminó al 30 es igual a " + avlTree1.getNumNodes(treeF.getRoot()));

    }
}
