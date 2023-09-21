package Practico3.tests;

import Practico3.exceptions.QueueIsEmptyException;
import Practico3.exceptions.QueueIsFullException;
import Practico3.utils.Queue;

public class QueueTest {
    /*c. Prueba tu implementación utilizando diferentes operaciones y
    elementos. */
    public void testQueueInteger() {
        Queue <Integer> queueInteger = new Queue<>(5);
        try {
            queueInteger.enqueue(1);
            queueInteger.enqueue(2);
            System.out.println(queueInteger.dequeue());
            System.out.println(queueInteger.dequeue());
            queueInteger.enqueue(3);
            queueInteger.enqueue(4);
            queueInteger.makeEmpty();
            queueInteger.enqueue(5); 
            queueInteger.enqueue(6); 
            queueInteger.enqueue(7); 
            System.out.println("Front:" + queueInteger.getFront());
            System.out.println(queueInteger.dequeue());
            System.out.println(queueInteger.dequeue());
            System.out.println(queueInteger.dequeue());
            System.out.println(queueInteger.dequeue());
            System.out.println(queueInteger.dequeue());
            queueInteger.enqueue(10);
            System.out.println(queueInteger.dequeue());
            System.out.println(queueInteger.dequeue()); // QueueIsEmptyException
        } catch (QueueIsFullException | QueueIsEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    /*c. Prueba tu implementación utilizando diferentes operaciones y
    elementos. */
    public void testQueueString() {
        Queue <String> queueString = new Queue<>(5);
        try {
            queueString.enqueue("Hola");
            queueString.enqueue("Mundo");
            System.out.println(queueString.dequeue());
            System.out.println(queueString.dequeue());
            queueString.enqueue("!!!");
            System.out.println(queueString.dequeue());
        } catch (QueueIsEmptyException | QueueIsFullException e) {
            System.out.println(e.getMessage());
        }
    }
}
