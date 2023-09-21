package Practico3.tests;

import Practico3.exceptions.QueueIsEmptyException;
import Practico3.exceptions.QueueIsFullException;
import Practico3.utils.Queue;

import java.util.Random;

public class QueueTest<T extends Comparable<T>> {
    private Queue<T> queue;
    private Class<T> type;
    private final Random random = new Random();

    public QueueTest(Class<T> type) {
        this.type = type;
    }

    public Queue<T> createRandomQueue(int size) {
        queue = new Queue<>(size);

        try {
            for (int i = 0; i < size; i++) {
                if (type.equals(Integer.class)) {
                    queue.enqueue(type.cast(random.nextInt(100))); // Generate a random integer between 0 and 99
                } else if (type.equals(Double.class)) {
                    queue.enqueue(type.cast(random.nextDouble(100))); // Generate a random integer between 0 and 99
                } else if (type.equals(String.class)) {
                    queue.enqueue(type.cast(createRandomString()));
                }
            }
        } catch (QueueIsFullException e) {
            System.out.println(e.getMessage());
        }
        return queue;
    }

    public String createRandomString() {
        char[] chars = new char[random.nextInt(10) + 1]; // Generate a random string of length between 1 and 10

        for (int j = 0; j < chars.length; j++) {
            chars[j] = (char) (random.nextInt(26) + 'a'); // Generate a random lowercase letter
        }
        return new String(chars);
    }

    /*
     * c. Prueba tu implementación utilizando diferentes operaciones y
     * elementos.
     */
    public void testQueueInteger() {
        Queue<Integer> queueInteger = new Queue<>(5);
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

    /*
     * c. Prueba tu implementación utilizando diferentes operaciones y
     * elementos.
     */
    public void testQueueString() {
        Queue<String> queueString = new Queue<>(5);
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

    /*
     * 5. Ordenar una Cola:
     * a. Implementa un programa que ordene los elementos de una cola en
     * orden ascendente (o descendente).
     * b. Crear una función ordenarColaAscendente toma una cola de enteros
     * como entrada y utiliza una cola auxiliar (colaAuxiliar) para ordenar los
     * elementos de la cola original en orden ascendente. Los elementos se
     * desencolan de la cola original y se insertan en la cola auxiliar de
     * manera que siempre se mantenga el orden correcto.
     * c. Luego, se copian los elementos ordenados de la cola auxiliar a la cola
     * original, y la cola original queda ordenada en orden ascendente.
     * d. La salida del programa mostrará la cola original y la cola ordenada en
     * orden ascendente.
     */

    /*
     * public Queue<T> sortQueueDescending() {
     * 
     * }
     */
}
