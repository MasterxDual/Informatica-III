package Practico3;

import Practico3.tests.QueueTest;
import Practico3.tests.StackTest;
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
    }
}
