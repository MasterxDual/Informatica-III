package Practico3.utils;

import Practico3.exceptions.StackIsEmptyException;

public class StackList <T> {
    private Node<T> root = null;

    /**
     * Add a new element to the stack
     * 
     *
     * @param element added
     */
    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = root;
        root = newNode;
    }

    /**
     * Delete and returns last element
     * 
     * @return last element (removed element)
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
     * Returns last element
     * 
     * @return last element
     */

    public T top() throws StackIsEmptyException {
        if(isEmpty()) {
            throw new StackIsEmptyException();
        }
        return root.data;
    }

    /**
     * Verify if stack is empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return this.root == null;
    }

    /**
     * Delete all elements of the stack
     */
    public void makeEmpty() {
        this.root = null;
    }

    /**
     * Returns size of stack if isnt empty, otherwise returns 0 
     * @return size of stack
     */
    public int size() {
        int count = 0;
        Node<T> actual = this.root;
        while(actual != null) {
            count++;
            actual = actual.next;
        }
        return count;
    }

    /**
     * Gets a pointer of the root node
     * @return root node
     */
    public Node<T> getRoot() {
        return root;
    }

    /**
     * Establishes root node
     * @param root node to be established
     */
    public void setRoot(Node<T> root) {
        this.root = root;
    }
}
