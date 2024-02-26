package Practico3.utils;

public class BinaryHeap<U extends Comparable<U>> {
    private Class<U> type;
    private static final int DEFAULT_CAPACITY = 7;
    private U[] array;
    private int currentSize;

    @SuppressWarnings("unchecked")
    public BinaryHeap(Class<U> type) {
        this.type = type;
        if(type.equals(Integer.class)) {
            array = (U[]) new Integer[DEFAULT_CAPACITY + 1];    
        } else if(type.equals(Double.class)) {
            array = (U[]) new Double[DEFAULT_CAPACITY + 1];    
        } else if(type.equals(String.class)) {
            array = (U[]) new String[DEFAULT_CAPACITY + 1];    
        }
        currentSize = 0;
    }
    
    public int getcurrentSize() {
        return currentSize;
    }
    
    public void setcurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    /**
     * Returns the smallest item in the binary heap.
     * @return the smallest item.
     */
    public U getMinElement() {
        if(isEmpty()) {
            throw new NullPointerException("Heap is empty.");
        }
        return array[1];
    }

    /**
     * Inserts an element to the array of the binary heap preserving conditions of a binary heap.
     * @param value to be inserted to the array.
     */
    public void add(U value) {
        if(currentSize + 1 == array.length) {
            resizeArray();
        }
        //Percolate up:
        int hole = ++currentSize;
        array[0] = value;

        for( ; value.compareTo(array[hole / 2]) < 0; hole /= 2) {
            array[hole] = array[hole / 2];    
        }
        array[hole] = value;
    }

    /**
     * Removes the smallest item in the binary heap.
     * @return the smallest item.
     */
    public U deleteMin() {
        if(isEmpty()) {
            throw new NullPointerException("Binary heap is empty.");
        }

        U minItem = getMinElement();

        array[1] = array[currentSize--];
        percolateDown(1);

        return minItem;
    }

    /**
     * Internal method to percolate down in the heap.
     * @param hole the index at which the percolate begins.
     */
    private void percolateDown(int hole) {
        int child;
        U tmp = array[hole];

        for( ; hole * 2 <= currentSize; hole = child) {
            child = hole * 2;
            if(child != currentSize && array[child + 1].compareTo(array[child]) < 0) {
                child++;
            }
            if(array[child].compareTo(tmp) < 0) {
                array[hole] = array[child];
            } else {
                break;
            }
        }
        array[hole] = tmp;
    }

    /**
     * Auxiliar method to recurrentSize intern array of binary heap (if necessary). It doubles the intern array.
     */
    private void resizeArray() {
        @SuppressWarnings("unchecked")
        U[] newArray = (U[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    /**
     * Returns if array is empty or not.
     * @return true if array is empty, otherwise returns false.
     */
    public boolean isEmpty() {
        return currentSize == 0;
    }

    /**
     * Prints at screen the entire binary heap.
     */
    public void printHeap() {
        if(isEmpty()) {
            throw new NullPointerException("Binary heap is empty.");
        }
        for (int y = 1; y <= currentSize; y++) {
            System.out.print(array[y] + " ");
        }
        System.out.println();
    }
}
