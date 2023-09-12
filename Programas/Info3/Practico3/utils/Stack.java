package Practico3.utils;

import Practico3.exceptions.StackIsEmptyException;
import Practico3.exceptions.StackIsFullException;

public class Stack <T> {
    /**
    * Indice de array en donde tenemos el último elemento.
    */
    private Integer index;
    /**
     * Tamaño del arreglo.
    */
    private Integer size;
    private T[] array;

    @SuppressWarnings ("unchecked")
    public Stack(Integer size) {
        this.index = 0;
        this.size = size;
        this.array = (T[]) new Object[size];
    }

    /**
     * Agrega un valor a pila.
     */
    public void push(T element) throws StackIsFullException {
        if(isFull()) {
            throw new StackIsFullException(this.size);
        }
        this.array[this.index] = element;
        this.index++;
    }

     /**
     * Retorna el último valor ingresado en la pila y lo sacamos de la pila.
     * 
     * @return
     */
    public T pop() throws StackIsEmptyException {
        if(isEmpty()) {
            throw new StackIsEmptyException();
        }
        T value = this.array[this.index - 1];
        this.index--;
        return value;
    }

     /**
     * Retornamos el último valor.
     * 
     * @return
     */
    public T top() {
        return this.array[this.index - 1];
    }

    /**
     * Retornamos un bool para saber si la pila está vacia o no.
     * 
     * @return
     */
    public boolean isEmpty() {
        //return this.index == 0 ? true : false;
        return this.index.equals(0);
    }

    /**
     * Limpiamos la pila.
     */
    public void makeEmpty() {
        this.index = 0;
    }

    /**
     * @return Retornamos booleano para saber si la pila está llena.
     */
    public boolean isFull() {
        return this.index.equals(this.size);
    }
}
