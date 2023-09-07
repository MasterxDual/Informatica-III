package Ordenamiento;

import java.util.Random;
import java.util.Scanner;

public class ShellsortB {
    public static void main(String[] args) {
        //Carga por teclado la cantidad de elementos que tendrá el array
        Double[] randomArray = generateDoubleArray(arraySize());
        
        showArray(randomArray);
        
        //Cuenta el tiempo en milisegundos actual, antes de empezar a ordenar los datos con el ordenamiento
        long startTime = System.nanoTime();

        shell(randomArray, randomArray.length);
        
        //Cuenta el tiempo en milisegundos actual, despues de ordenar los datos con el ordenamiento
        long endTime = System.nanoTime();
        
        //Calcula el tiempo que tardó desde el inicio hasta el final, es decir el tiempo total en ordenar los datos con el ordenamiento
        long elapsedTimeMillis = (endTime - startTime) / 100000;
        

        /*4. Realizar captura de tiempos para cada uno de los algoritmos de ordenamiento para: a. 100 elementos. b. 1000 elementos. c. 10000 elementos.
        a. 100 elementos: 0 milisegundos
        b. 1000 elementos: 10 milisegundos
        c. 10000 elementos: 82 milisegundos*/
        showArray(randomArray);
        System.out.println("Tiempo transcurrido: " + elapsedTimeMillis + "milisegundos.");
        


    }

    //2. Implementar función que reciba un array y que lo muestre en pantalla.
    public static void showArray(Double[] array) {
        for (Double number : array) {
            System.out.print(number + " ");
        } 
        System.out.println("\n------------------");
    }

    public static Integer arraySize() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros del array");
        return scan.nextInt();
    } 

    //3. Implementar funcion que reciba la longitud de array y retorne un array cargado de números aleatorios.
    public static Double[] generateDoubleArray(int size) {
        Double[] randomArray = new Double[size];
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextDouble(10);
        }
        return randomArray;
    }

    /*1. Implemente los métodos de ordenación de inserción usando
    las implementaciones del teórico. Ejecútelos con los siguientes objetos:
    b. números reales de tipo double. */
    public static void shell (Double[] array, int size) {
        int gap;
        int i;
        int j;
        Double temp;
        for (gap=size/2; gap > 0; gap = gap / 2)
            for ( i = gap; i < size; i++)
                for ( j = i-gap; j >= 0 && array[j] > array[j+gap]; j = j - gap) {
                    temp = array[j];
                    array[j] = array[j+gap];
                    array[j+gap] = temp;
                } 
            }
            
}
