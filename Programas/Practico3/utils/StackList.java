package Practico3.utils;

import Practico3.exceptions.StackIsEmptyException;

public class StackList <T> {
    private Node<T> root = null;

    /**
     * Agregar elemento a la pila
     * 
     *
     * @param element 
     */
    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = root;
        root = newNode;
    }

    /**
     * Borramos y retornamos el ùiltimo valor.
     * 
     * @return
     */

    public T pop() throws StackIsEmptyException {
        if(isEmpty()) {
            throw new StackIsEmptyException();
        }
        T element = root.data;
        root = root.next;     
        return element;   
    }

    /**
     * Retornamos el últimos valor.
     * 
     * @return
     */

    public T top() throws StackIsEmptyException {
        if(isEmpty()) {
            throw new StackIsEmptyException();
        }
        return root.data;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void makeEmpty() {
        this.root = null;
    }

    public int size() {
        int count = 0;
        Node<T> actual = this.root;
        while(actual != null) {
            count++;
            actual = actual.next;
        }
        return count;
    }
}
