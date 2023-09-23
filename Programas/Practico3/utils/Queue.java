package Practico3.utils;

import Practico3.exceptions.QueueIsEmptyException;
import Practico3.exceptions.QueueIsFullException;

public class Queue <U extends Comparable <U>> {
    /*4. Implementación de una Cola:
    a. Crea una clase que represente una cola utilizando un arreglo.
    b. Implementa métodos para enqueue (agregar un elemento al final),
    dequeue (eliminar el elemento del frente) y top (ver el elemento del
    frente sin eliminarlo).c. Prueba tu implementación utilizando diferentes operaciones y
    elementos. */

    /**
     * Indice que indica el primer elemento que saldrá de la cola
     */
    private Integer front;

    /**
     * Indice que indica el ultimo elemento que ingresó a la cola
     */
    private Integer back;
    private Integer size;
    private U[] array;

    
    /** Constructor de la cola
     * 
     * @param size array size
     */
    @SuppressWarnings ("unchecked")
    public Queue(Integer size) {
        makeEmpty();
        this.size = size;
        this.array = (U[]) new Comparable[size];
    }

    /** Agrega un elemento a la cola (el que queda en el back)
     * 
     * @param element added element
     * @throws QueueIsFullException
     */
    public void enqueue(U element) throws QueueIsFullException {
        if(isFull()) {
            throw new QueueIsFullException(size);
        } else if(isEmpty()) {
            this.front++;
        }        
        /*this.back++;
        this.array[this.back] = element;*/
        this.array[++this.back] = element;
    }

    /**
     * Elimina el ultimo elemento de la cola (el que está en el front)
     * @return eliminated element
     * @throws QueueIsEmptyException
     */
    public U dequeue() throws QueueIsEmptyException {
        if(isEmpty()) {
            throw new QueueIsEmptyException();
        }
        U returnValue = array[this.front];
        if(this.front.equals(this.back)) {
            this.front = this.back = -1;
        } else {
            this.front++;
        }
        return returnValue;

    }
    /** Devuelve el primer elemento de la cola (el que saldrá primero)
     * 
     * @return first element
     * @throws QueueIsEmptyException
     */
    public U getFront() throws QueueIsEmptyException {
        if(isEmpty()) {
            throw new QueueIsEmptyException();
        }
        return this.array[this.front];
    }

    /**
     * Devuelve verdadero si la cola está vacía
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return this.front == -1;
    }

    /**
     * Devuelve verdadero si la cola esta llena
     * @return true if full, false otherwise
     */
    public boolean isFull() {
        return (this.back + 1) == size;
    }

    /**
     * Elimina todos los elementos de la cola
     */
    public void makeEmpty() {
        this.front = -1;
        this.back = -1;
    }

    public int getSize() {
        return this.size;
    }

    public U[] getArray() {
        return array;
    }
    
    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("[");
        for (int i = 0; i < this.size; i++) {
            sBuilder.append(array[i]);
            sBuilder.append(" ");
        }
        sBuilder.deleteCharAt(sBuilder.length() - 1);
        sBuilder.append("]");                    
        return sBuilder.toString();
    }
}
