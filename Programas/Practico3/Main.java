package Practico3;

import Practico3.tests.QueueTest;
import Practico3.tests.StackTest;
import Practico3.utils.Queue;

public class Main {
    public static void main(String[] args) {
        StackTest test1 = new StackTest();
        QueueTest<Integer> test2 = new QueueTest<>(Integer.class);
        QueueTest<String> test3 = new QueueTest<>(String.class);
        QueueTest<Double> test4 = new QueueTest<>(Double.class);
        Queue<Integer> originalQueue = test2.createRandomQueue(5);

        /*test1.testStackInteger();
        
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

        System.out.println("Cola original desordenada: " + originalQueue);
        System.out.println("Cola ordenada de menor a mayor");
        System.out.println(test2.sortQueueDescending(originalQueue));


    }
}
