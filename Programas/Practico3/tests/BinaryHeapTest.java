package Practico3.tests;

import Practico3.utils.BinaryHeap;

public class BinaryHeapTest<U extends Comparable<U>> {
    /**
     * Creates a new binary heap. Inserting numbers 3, 5, 10, 8, 13, 21 and 18 respectively.
     * @return the binary heap created.
     */
    public BinaryHeap<Integer> createFirstBinaryHeap()  {
        BinaryHeap<Integer> binaryHeap = new BinaryHeap<>(Integer.class);

        binaryHeap.add(3);
        binaryHeap.add(5);
        binaryHeap.add(10);
        binaryHeap.add(8);
        binaryHeap.add(13);
        binaryHeap.add(21);
        binaryHeap.add(18);
        
        return binaryHeap;
    }

    /**
     * Creates another binary heap, doing the same insertions like first binary heap, with the difference that it removes 
     * and returns the minimum element.
     * @return the binary heap created.
     */
    public BinaryHeap<Integer> createSecondBinaryHeap()  {
        BinaryHeap<Integer> binaryHeap = new BinaryHeap<>(Integer.class);

        binaryHeap.add(3);
        binaryHeap.add(5);
        binaryHeap.add(10);
        binaryHeap.add(8);
        binaryHeap.add(13);
        binaryHeap.add(21);
        binaryHeap.add(18);
        System.out.println("Elemento de mayor prioridad eliminado: " + binaryHeap.deleteMin());

        return binaryHeap;
    }
}
