package Practico3.utils;

import Practico3.exceptions.QueueIsEmptyException;

public class QueueList<U extends Comparable<U>> {
    private Node<U> front;
    private Node<U> back;

    /*5. Implementación de una Cola con lista:
    a. Crea una clase que represente una Cola y Nodo.
    b. Implementa métodos para enqueue (agregar un elemento al final),
    dequeue (eliminar el elemento del frente) y top (ver el elemento del
    frente sin eliminarlo).
    c. Prueba tu implementación utilizando diferentes operaciones y
    elementos. */

    /**
     * Constructor's class.
     */
    public QueueList() {
        this.front = this.back = null;
    }

    /**
     * Establishes first node (front node) of the queue list.
     * @param front node to be established.
     */
    public void setFront(Node<U> front) {
        this.front = front;
    }

    /**
     * Adds a new element to the queue, enters through the back.
     * @param element added
     */
    public void enqueue(U element) {
        Node<U> newNode = new Node<>(element);
        if(isEmpty()) {
            this.front = this.back = newNode;
            /*  this.front = newNode;
                this.back = newNode;*/
        } else {
            this.back.next = newNode;
            this.back = newNode;
            //this.back = this.back.next = newNode;
        }

    }

    /**
     * Eliminates the first element (front element) of the queue.
     * @return element removed
     * @throws QueueIsEmptyException
     */
    public U dequeue() throws QueueIsEmptyException {
        if(isEmpty()) {
            throw new QueueIsEmptyException();
        }
        U tempData = getFront();
        this.front = this.front.next;
        if(this.front == null) {
            this.back = null;
        }
        return tempData;
    }

    /**
     * Returns the first element of the queue.
     * @return first element (front element)
     * @throws QueueIsEmptyException
     */
    public U getFront() throws QueueIsEmptyException {
        if(isEmpty()) {
            throw new QueueIsEmptyException();
        }
        return this.front.data;
    }

    /**
     * Returns the first node of the queue
     * @return first node (front node)
     * @throws QueueIsEmptyException
     */
    public Node<U> getFrontNode() throws QueueIsEmptyException {
        if(isEmpty()) {
            throw new QueueIsEmptyException();
        }
        return this.front;
    }

    /**
     * Returns the last node of the queue
     * @return last node (back node)
     * @throws QueueIsEmptyException
     */
    public Node<U> getBackNode() throws QueueIsEmptyException {
        if(isEmpty()) {
            throw new QueueIsEmptyException();
        }
        return this.back;
    }

    /**
     * Verify if the queue is empty.
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return this.front == null;
    }

    /**
     * Eliminates all elements from the queue.
     */
    public void makeEmpty() {
        this.back = this.front = null;
    }

    public int getSize() throws QueueIsEmptyException {
        int size;
        if(isEmpty()) {
            throw new QueueIsEmptyException();
        }
        Node<U> temp = this.front;
        size = 1;

        while(temp.next != null) {
            temp = temp.next;
            size++;    
        }
        return size;
    }

    /**
     * Move the first element to position n. "Pushing" the other nodes forward, and thus
     * taking the place of the first element. 
     * @param n position to be occupied by the first element
     */
    public void moveFirst(int n) {
        Node<U> temp = this.front;

        if(n == 1) {
            return;
        }

        for (int i = 1; i < n; i++) {
            if(temp.next != null) {
                temp = temp.next;
            } else {
                throw new NullPointerException();
            }
        }
        Node<U> temp2 = temp.next;
        Node<U> temp3 = this.front.next;
        temp.next = this.front;
        this.front.next = temp2;
        this.front = temp3;
    }


}
