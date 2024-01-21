package Practico3.tests;

import Practico3.exceptions.QueueIsEmptyException;
import Practico3.exceptions.QueueIsFullException;
import Practico3.exceptions.StackIsEmptyException;
import Practico3.utils.Node;
import Practico3.utils.Queue;
import Practico3.utils.QueueList;
import Practico3.utils.StackList;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class QueueTest<T extends Comparable<T>> {
    private Class<T> type;
    private final Random random = new Random();

    public QueueTest(Class<T> type) {
        this.type = type;
    }

    public Queue<T> createRandomQueue(int size) {
        Queue<T> queue = new Queue<>(size);

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
    @SuppressWarnings("unchecked")
    public Queue<T> sortQueueDescending(Queue<T> queue) {
        int originalQueueSize = queue.getSize();
        Queue <T> auxiliarQueue = new Queue<>(originalQueueSize);
        T[] orderedArray = (T[]) new Comparable[originalQueueSize]; 

        try {
            orderedArray = bubbleSort(queue.getArray()); //Se ordena utilizando el metodo burbuja al array que provino de la cola original, luego se almacena en orderedArray
            for (int z = 0; z < originalQueueSize; z++) {
                auxiliarQueue.enqueue(orderedArray[z]); //Agrega a la cola auxiliar los elementos del array ordenado previamente
            }
        } catch (QueueIsFullException e) {
            System.out.println(e.getMessage());
        }
        return auxiliarQueue;
    }

    /**
     * Metodo de ordenamiento de burbuja en orden ascendente
     * @param <T> generic type
     * @param array unordered array
     * @return ordered array
     */
    public T[] bubbleSort(T[] array) { 
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) { 
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /*5. c. Prueba tu implementación utilizando diferentes operaciones y
    elementos. */

    public void testQueueListDouble() {
        QueueList <Double> queue = new QueueList<>();

        
        try {
            queue.enqueue(10.42);
            queue.enqueue(20.84);
            queue.enqueue(30.168);
            System.out.println(queue.dequeue());
            System.out.println(queue.getFront());            
            System.out.println(queue.isEmpty());
            queue.makeEmpty();
            System.out.println(queue.isEmpty());
            queue.enqueue(40.336);
            queue.enqueue(50.672);
            queue.enqueue(60.73);
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue()); // QueueIsEmptyException
        } catch (QueueIsEmptyException e) {
            System.out.println(e.getMessage());
        }
    
    }

    public void testQueueListString() {
        QueueList <String> queue = new QueueList<>();

        try {
            queue.enqueue("Hola");
            queue.enqueue("Mundo");
            System.out.println(queue.dequeue());
            System.out.println(queue.getFront());            
            System.out.println(queue.isEmpty());
            queue.makeEmpty();
            System.out.println(queue.isEmpty());
            queue.enqueue("Hola");
            queue.enqueue("Mundo");
            queue.enqueue("Adios");
            queue.enqueue("!!!");
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue()); // QueueIsEmptyException
        } catch (QueueIsEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    /*6. Cola de Números
    a. Implementa una cola que almacene números enteros. Crea un
    programa que solicite al usuario ingresar números y los encole. Luego,
    desencola y suma todos los números. */
    /**
     * Creates a new linked queue by input numbers
     * @return queue created
     */
    public QueueList <Double> createQueueListByInput() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //For using a point instead a coma in the numbers with decimals
        QueueList <Double> queue = new QueueList<>();

        do {
            System.out.println("Ingrese un numero");
            queue.enqueue(scanner.nextDouble());
            System.out.println("¿Desea seguir ingresando numeros? (1. Si 0. No)");
        } while(scanner.nextInt() != 0);
        return queue;
    }

    /**
     * Sums all the elements of a queue
     * @param queue to be added
     * @return result of the sum of all the elements
     */
    public double sumOfQueueNumbers(QueueList<Double> queue) {
    double sum = 0;
    int size;
    
    try {
        size = queue.getSize();
        for (int z = 1; z <= size ; z++) {
                sum = sum + queue.dequeue();
            }
        } catch (QueueIsEmptyException e) {
            System.out.println(e.getMessage());
        }
        return sum;
    }

    /*7. Ordenamiento de Cola
    a. Escribe un programa que ordene una cola de números enteros de
    forma ascendente. Puedes usar una pila como estructura auxiliar. */
    /**
     * Uses the sorting algorithm of selection sort implemented in a queue list to order the original queue
     * @param queue to be ordered
     */
    public void sortQueueListAscending(QueueList<T> queue) {
        try {
            Node<T> current = queue.getFrontNode();
            int size = queue.getSize();
            Node<T> max;
            Node<T> temp;
    
            for (int i = 0; i < size - 1; i++) {
                max = current;
                temp = current.getNext();
                while (temp != null) {
                    if (temp.getData().compareTo(max.getData()) > 0) {
                        max = temp;
                    }
                    temp = temp.getNext();
                }
    
                T maxValue = max.getData();
                max.setData(current.getData());
                current.setData(maxValue);
        
                current = current.getNext();
            }
            
        } catch (QueueIsEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Este metodo fue hecho de manera rustica, sin ayuda de ningun algoritmo de ordenamiento desarrollado por otros.
     * A pico y pala nomas.
     * Ordena de manera ascendente una cola desordenada. Utiliza una pila auxiliar para ir insertando los valores de modo que luego
     * se imprima de menor a mayor.
     * @param queue desordenada
     */
    public void sortQueueListAscending2(QueueList<T> queue) {
        try {
            Node<T> max;
            Node<T> temp;
            int size = queue.getSize();
            StackList<T> stack = new StackList<>();

            for(int z = 0; z < size; z++) {
                max = temp = queue.getFrontNode();
                
                //Encontrar el maximo en la cola actual
                while(temp.getNext() != null) {
                    temp = temp.getNext();
                    if(temp.getData().compareTo(max.getData()) > 0) {
                        max = temp;
                    }
                }
                stack.push(max.getData());
                temp = queue.getFrontNode();
    

                //Si el frente de la cola es el maximo, la desencolo para eliminar el mismo
                if(temp.getData().compareTo(max.getData()) == 0) {
                    queue.dequeue();
                } else {
                    temp = queue.getFrontNode();

                    //Mover temp al nodo anterior al maximo
                    if(temp.getNext() != null) {
                        while ((temp.getNext().getData().compareTo(max.getData()) != 0)) {
                            if(temp.getNext() != null) {
                                temp = temp.getNext();
                            }
                        }
                    }
                    
                    
                    Node<T> nextNextTemp = temp.getNext().getNext();
                    Node<T> back = queue.getBackNode();

                    //En el caso que el maximo se encuentre entre medio, se elimina de esta manera
                    if(nextNextTemp != null) {
                        temp.setNext(nextNextTemp);
                    } else {
                        //En el caso que el maximo se encuentre al final de la cola, se elimina de esta manera
                        back = temp;
                        temp.setNext(null);
                    }
                }
            }    

            //Se imprime la pila auxiliar ordenada de menor a mayor
            while(!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
            
        } catch(QueueIsEmptyException | StackIsEmptyException e) {
            System.out.println(e.getMessage());
        }
        
    }

    /**
     * Prints all elements of the queue list
     * @param queue to be printed
     */
    public void printQueue(QueueList<T> queue) {
        try {
            Node<T> current = queue.getFrontNode();
            while (current != null) {
                System.out.print(current.getData() + " ");
                current = current.getNext();
            }
            System.out.println();
        } catch (QueueIsEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a random queue list
     * @param size queue's size
     * @return created queue
     */
    public QueueList<T> createRandomQueueList(int size) {
        QueueList<T> queue = new QueueList<>();

        for (int i = 0; i < size; i++) {
            if (type.equals(Integer.class)) {
                queue.enqueue(type.cast(random.nextInt(100))); // Generate a random integer between 0 and 99
            } else if (type.equals(Double.class)) {
                queue.enqueue(type.cast(random.nextDouble(100))); // Generate a random integer between 0 and 99
            } else if (type.equals(String.class)) {
                queue.enqueue(type.cast(createRandomString()));
            }
        }
        
        return queue;
    }

    /*8. Verificación de Palíndromos con cola
    a. Desarrolla un programa que verifique si una palabra o frase es un
    palíndromo (se lee igual de izquierda a derecha que de derecha a
    izquierda), ignorando los espacios y signos de puntuación. */
    public boolean verifyPalindrome(String string) {
        string = string.toLowerCase().replace(" ", "");
        int size = string.length();
        QueueList<Character> queueChar = new QueueList<>();

        try {
            for (int z = 0; z < size; z++) {
                queueChar.enqueue(string.charAt(z));
            }
            for (int s = 0; s < size; s++) {
                if(!queueChar.dequeue().equals(string.charAt(size - 1 - s))) {
                    return false;
                }
            }
        } catch(QueueIsEmptyException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Busca en forma recursiva un valor especifico en un objeto de lista enlazada. 
     * @param queue a buscar en forma recursiva
     * @param temp puntero utilizado para buscar en la cola
     * @param value a encontrar
     * @return un puntero al valor encontrado, null en caso de no haberlo encontrado.
     */
    public Node<T> searchList(QueueList<T> queue, Node<T> temp, T value) {
        if(temp == null) {
            return null;
        }
        if(temp.getData().compareTo(value) == 0) {
            return temp;
        }
        return searchList(queue, temp.getNext(), value);
    }

}
