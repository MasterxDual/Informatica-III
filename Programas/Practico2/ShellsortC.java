package Ordenamiento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ShellsortC {
    public static void main(String[] args) {
        //Carga por teclado la cantidad de elementos que tendrá el array
        String[] randomArray = generateStringArray(arraySize());
        
        showArray(randomArray);
        
        //Cuenta el tiempo en milisegundos actual, antes de empezar a ordenar los datos con el ordenamiento
        long startTime = System.nanoTime();

        shell(randomArray, randomArray.length);
        
        //Cuenta el tiempo en milisegundos actual, despues de ordenar los datos con el ordenamiento
        long endTime = System.nanoTime();
        
        //Calcula el tiempo que tardó desde el inicio hasta el final, es decir el tiempo total en ordenar los datos con el ordenamiento
        long elapsedTimeMillis = (endTime - startTime) / 100000;
        

        /*4. Realizar captura de tiempos para cada uno de los algoritmos de ordenamiento para: a. 100 elementos. b. 1000 elementos. c. 10000 elementos.
        a. 100 elementos: 2 milisegundos
        b. 1000 elementos: 7 milisegundos
        c. 10000 elementos: 50 milisegundos*/
        showArray(randomArray);
        System.out.println("Tiempo transcurrido: " + elapsedTimeMillis + "milisegundos.");
        


    }

    //2. Implementar función que reciba un array y que lo muestre en pantalla.
    public static void showArray(String[] array) {
        for (String string : array) {
            System.out.print(string + " ");
        } 
        System.out.println("\n------------------");
    }

    public static Integer arraySize() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros del array");
        return scan.nextInt();
    } 

    //3. Implementar funcion que reciba la longitud de array y retorne un array cargado de números aleatorios.
    public static String[] generateStringArray(int size) {
        String[] strings = new String[size];
        Random random = new Random();

        //Lista de posibles strings:
        List<String> possibleStrings = new ArrayList<>();
        possibleStrings.add("Apple");
        possibleStrings.add("Pie");
        possibleStrings.add("Applepie");
        possibleStrings.add("Ball");
        possibleStrings.add("Pineapple");
        
        for (int i = 0; i < size; i++) {
            int aleatoryIndex = random.nextInt(possibleStrings.size());
            strings[i] = possibleStrings.get(aleatoryIndex);
        }
        return strings;
    }

    /*1. Implemente los métodos de ordenación de inserción usando
    las implementaciones del teórico. Ejecútelos con los siguientes objetos:
    c. cadena de caracteres. */
    public static void shell (String[] array, int size) {
        int gap;
        int i;
        int j;
        String temp;
        for (gap=size/2; gap > 0; gap = gap / 2)
            for ( i = gap; i < size; i++)
                for ( j = i-gap; j >= 0 && array[j].compareTo(array[j+gap]) > 0; j = j - gap) {
                    temp = array[j];
                    array[j] = array[j+gap];
                    array[j+gap] = temp;
                } 
            }
            
}
