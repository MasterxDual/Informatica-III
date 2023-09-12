package Practico2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main class");
        OrderingTest orderingTest = new OrderingTest();
        Scanner scan = new Scanner(System.in);
        int typeOfObject;

        System.out.println("Ingrese una opcion para utilizar algun tipo de dato: ");
        System.out.println("1. Integer \n2. Double \n3. String");

        typeOfObject = scan.nextInt();

        System.out.println("Ingrese otra opcion para utilizar algun tipo de ordenamiento: ");
        System.out.println("1. Insertion sort \n2. Shellsort \n3. Quicksort");

        if(typeOfObject == 1) {
            orderingTest.testOrdering(Integer.class, scan.nextInt());
        } else if(typeOfObject == 2) {
            orderingTest.testOrdering(Double.class, scan.nextInt());
        } else if(typeOfObject == 3) {
            orderingTest.testOrdering(String.class, scan.nextInt());
        }

        //Insertion sort for different types
        /*a. 100 elementos: 2 milisegundos
        b. 1000 elementos: 38 milisegundos
        c. 10000 elementos: 714 milisegundos*/
        /* a. 100 elementos: 5 milisegundos
        b. 1000 elementos: 119 milisegundos
        c. 10000 elementos: 631 milisegundos*/
        /* a. 100 elementos: 7 milisegundos
        b. 1000 elementos: 89 milisegundos
        c. 10000 elementos: 971 milisegundos*/

        //Shellsort for different types
        /*a. 100 elementos: 1 milisegundos
        b. 1000 elementos: 7 milisegundos
        c. 10000 elementos: 59 milisegundos*/
        /*a. 100 elementos: 5 milisegundos
        b. 1000 elementos: 12 milisegundos
        c. 10000 elementos: 138 milisegundos*/
        /*a. 100 elementos: 2 milisegundos
        b. 1000 elementos: 32 milisegundos
        c. 10000 elementos: 93 milisegundos*/

        //Quicksort for different types
        /*a. 100 elementos: 1 milisegundos
        b. 1000 elementos: 8 milisegundos
        c. 10000 elementos: 32 milisegundos*/
        /*a. 100 elementos: 6 milisegundos
        b. 1000 elementos: 6 milisegundos
        c. 10000 elementos: 109 milisegundos*/
        /*a. 100 elementos: 3 milisegundos
        b. 1000 elementos: 7 milisegundos
        c. 10000 elementos: 146 milisegundos*/
    }

}
