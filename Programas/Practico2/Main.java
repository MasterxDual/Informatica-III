package Practico2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main class");
        OrderingTest orderingTest = new OrderingTest();

        //Insertion sort for different types
        //orderingTest.testInsertion(Integer.class);
        /*a. 100 elementos: 2 milisegundos
        b. 1000 elementos: 38 milisegundos
        c. 10000 elementos: 714 milisegundos*/
        //orderingTest.testInsertion(Double.class);
        /* a. 100 elementos: 5 milisegundos
        b. 1000 elementos: 119 milisegundos
        c. 10000 elementos: 631 milisegundos*/
        //orderingTest.testInsertion(String.class);
        /* a. 100 elementos: 7 milisegundos
        b. 1000 elementos: 89 milisegundos
        c. 10000 elementos: 971 milisegundos*/

        //Shellsort for different types
        orderingTest.testShellsort(Integer.class);
        /*a. 100 elementos: 1 milisegundos
        b. 1000 elementos: 7 milisegundos
        c. 10000 elementos: 59 milisegundos*/
        orderingTest.testShellsort(Double.class);
        /*a. 100 elementos: 5 milisegundos
        b. 1000 elementos: 12 milisegundos
        c. 10000 elementos: 138 milisegundos*/
        orderingTest.testShellsort(String.class);
        /*a. 100 elementos: 2 milisegundos
        b. 1000 elementos: 32 milisegundos
        c. 10000 elementos: 93 milisegundos*/
    }

}
