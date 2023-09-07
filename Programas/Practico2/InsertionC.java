package Ordenamiento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class InsertionC {
    public static void main(String[] args) {
        //Carga por teclado la cantidad de elementos que tendrá el array
        String[] randomArray = generateStringArray(arraySize());
        
        showArray(randomArray);
        
        //Cuenta el tiempo en milisegundos actual, antes de empezar a ordenar los datos con el ordenamiento
        long startTime = System.nanoTime();
        
        insertionSort(randomArray);

        //Cuenta el tiempo en milisegundos actual, despues de ordenar los datos con el ordenamiento
        long endTime = System.nanoTime();
        
        //Calcula el tiempo que tardó desde el inicio hasta el final, es decir el tiempo total en ordenar los datos con el ordenamiento
        long elapsedTimeMillis = (endTime - startTime) / 100000;
        
        showArray(randomArray);
        
        /*4. Realizar captura de tiempos para cada uno de los algoritmos de ordenamiento para: a. 100 elementos. b. 1000 elementos. c. 10000 elementos.
        a. 100 elementos: 3 milisegundos
        b. 1000 elementos: 50 milisegundos
        c. 10000 elementos: 641 milisegundos*/
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


    /*3. Implementar funcion que reciba la longitud de array y retorne un array cargado de números aleatorios.
    Esta funcion utiliza un objeto Random para generar índices aleatorios y selecciona
    strings aleatorios de la lista possibleStrings. Se puede personalizar la lista possibleStrings
    con los strings que se desee incluir en el arreglo aleatorio.*/
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
    public static void insertionSort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String tmp = array[i];
            int j = i;

            for( ; j > 0 && tmp.compareTo(array[j - 1]) < 0; j--) {
                array[j] = array[j - 1];
            }
            array[j] = tmp;
        }
    }
}
