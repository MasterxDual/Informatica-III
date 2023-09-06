package Ordenamiento;

import java.util.Random;
import java.util.Scanner;

public class InsertionB {
    public static void main(String[] args) {
        //Carga por teclado la cantidad de elementos que tendrá el array
        Double[] randomArray = new Double[arraySize()];
        
        //Crea los elementos random del array, cargando el mismo de elementos aleatorios
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextDouble(10);
        }
        //showArray(randomArray);
        
        //Cuenta el tiempo en milisegundos actual, antes de empezar a ordenar los datos con el ordenamiento
        long startTime = System.nanoTime();
        
        insertionSort(randomArray);

        long endTime = System.nanoTime();
        
        //Cuenta el tiempo en milisegundos actual, despues de ordenar los datos con el ordenamiento
        long elapsedTimeMillis = (endTime - startTime) / 100000;
        
        /*4. Realizar captura de tiempos para cada uno de los algoritmos de ordenamiento para: a. 100 elementos. b. 1000 elementos. c. 10000 elementos.
        a. 100 elementos: 2 milisegundos
        b. 1000 elementos: 37 milisegundos
        c. 10000 elementos: 492 milisegundos*/
        //Calcula el tiempo que tardó desde el inicio hasta el final, es decir el tiempo total en ordenar los datos con el ordenamiento
        showArray(randomArray);
        System.out.println("Tiempo transcurrido: " + elapsedTimeMillis + "milisegundos.");
        


    }

    //2. Implementar función que reciba un array y que lo muestre en pantalla.
    public static void showArray(Double[] array) {
        for (Double number : array) {
            System.out.print(number + " ");
        } 
        System.out.println();
    }

    public static Integer arraySize() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros del array");
        return scan.nextInt();
    } 

    /*1. Implemente los métodos de ordenación de inserción usando
    las implementaciones del teórico. Ejecútelos con los siguientes objetos:
    b. números reales de tipo double. */
    public static void insertionSort(Double[] array) {
        for (int i = 1; i < array.length; i++) {
            Double tmp = array[i];
            int j = i;

            for( ; j > 0 && tmp.compareTo(array[j - 1]) < 0; j--) {
                array[j] = array[j - 1];
            }
            array[j] = tmp;
        }
    }
}
