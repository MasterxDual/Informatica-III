package Ordenamiento;

import java.util.Random;
import java.util.Scanner;

public class InsertionA {
    public static void main(String[] args) {
        //Carga por teclado la cantidad de elementos que tendrá el array
        Integer[] randomArray = generateIntegerArray(arraySize());
        
        showArray(randomArray);
        
        //Cuenta el tiempo en milisegundos actual, antes de empezar a ordenar los datos con el ordenamiento
        long startTime = System.nanoTime();
        
        insertionSort(randomArray);

        //Cuenta el tiempo en milisegundos actual, despues de ordenar los datos con el ordenamiento
        long endTime = System.nanoTime();
        
        /*4. Realizar captura de tiempos para cada uno de los algoritmos de ordenamiento para: a. 100 elementos. b. 1000 elementos. c. 10000 elementos.
        a. 100 elementos: 1 milisegundo
        b. 1000 elementos: 35 milisegundos
        c. 10000 elementos: 466 milisegundos*/
        //Calcula el tiempo que tardó desde el inicio hasta el final, es decir el tiempo total en ordenar los datos con el ordenamiento
        long elapsedTimeMillis = (endTime - startTime) / 100000;
        
        showArray(randomArray);
        System.out.println("Tiempo transcurrido: " + elapsedTimeMillis + "milisegundos.");

    }

    //2. Implementar función que reciba un array y que lo muestre en pantalla.
    public static void showArray(Integer[] array) {
        for (Integer integer : array) {
            System.out.print(integer + " ");
        } 
        System.out.println("\n------------------");
    }

    //3. Implementar funcion que reciba la longitud de array y retorne un array cargado de números aleatorios.
    public static Integer[] generateIntegerArray(int size) {
        //Crea los elementos random del array, cargando el mismo de elementos aleatorios
        Integer[] randomArray = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt(10);
        }

        return randomArray;
    }

    public static Integer arraySize() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros del array");
        return scan.nextInt();
    } 

    /*1. Implemente los métodos de ordenación de inserción usando
    las implementaciones del teórico. Ejecútelos con los siguientes objetos:
    a. enteros. */
    public static void insertionSort(Integer[] array) {
        for (int i = 1; i < array.length; i++) {
            Integer tmp = array[i];
            int j = i;

            for( ; j > 0 && tmp.compareTo(array[j - 1]) < 0; j--) {
                array[j] = array[j - 1];
            }
            array[j] = tmp;
        }
    }
}
