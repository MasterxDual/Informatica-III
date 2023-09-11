package Practico2;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ordering <T extends Comparable <T>> {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    //Lista de posibles strings:
    private final List<String> possibleStrings = List.of("Apple", "Pie", "Applepie", "Ball", "Pineapple");
    private final Class<T> type;

    public Ordering(Class<T> type) {
        this.type = type;
    }

    /*1. Implemente los métodos de ordenación de inserción usando
    las implementaciones del teórico. Ejecútelos con los siguientes objetos:
    a. enteros. b. números reales de tipo double. c. cadena de caracteres.*/
    public void insertionSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T tmp = array[i];
            int j = i;

            for( ; j > 0 && tmp.compareTo(array[j - 1]) < 0; j--) {
                array[j] = array[j - 1];
            }
            array[j] = tmp;
        }
    }

    /*1. Implemente los métodos de ordenación de inserción usando
    las implementaciones del teórico. Ejecútelos con los siguientes objetos:
    a. enteros. b. números reales de tipo double. c. cadena de caracteres.*/
    public void shell (T[] array, int size) {
        int gap;
        int i;
        int j;
        T temp;
        for (gap=size/2; gap > 0; gap = gap / 2)
            for ( i = gap; i < size; i++)
                for ( j = i-gap; j >= 0 && array[j].compareTo(array[j+gap]) > 0; j = j - gap) {
                    temp = array[j];
                    array[j] = array[j+gap];
                    array[j+gap] = temp;
                } 
    }

    //Tipos de datos = clases
    //2. Implementar función que reciba un array y que lo muestre en pantalla.
    public void showArray(T[] array) {
        for (T number : array) {
            System.out.print(number + " ");
        } 
        System.out.println("\n------------------");
    }

    //3. Implementar funcion que reciba la longitud de array y retorne un array cargado de números aleatorios.
    /*Cuando es de tipo String, este metodo utiliza un objeto Random para generar índices aleatorios y selecciona
    strings aleatorios de la lista possibleStrings. Se puede personalizar la lista possibleStrings
    con los strings que se desee incluir en el arreglo aleatorio.*/
    @SuppressWarnings("unchecked")
    public T[] generateArray(int size) {
        //Crea los elementos random del array, cargando el mismo de elementos aleatorios
        T[] randomArray;

        if(type.equals(Integer.class)) {
            randomArray =  (T[]) new Integer[size];
        } else if(type.equals(Double.class)) {
            randomArray =  (T[]) new Double[size];
        } else {
            randomArray =  (T[]) new String[size];
        }

        for (int i = 0; i < size; i++) {
            if(type.equals(Integer.class)) {
                randomArray[i] = type.cast(random.nextInt(10));
            } else if(type.equals(Double.class)) {
                randomArray[i] = type.cast(random.nextDouble(10));
            } else if(type.equals(String.class)) {
                int aleatoryIndex = random.nextInt(possibleStrings.size());
                randomArray[i] = (T)possibleStrings.get(aleatoryIndex);
            }
        }

        return randomArray;
    }

    public int arraySize() {
        System.out.println("Ingrese la cantidad de numeros del array");
        return scan.nextInt();
        /*Lo dejo para ver como se usa
        if(type.equals(Integer.class)) {
            return type.cast(scan.nextInt()); 
        } else if(type.equals(String.class)) {
            return type.cast(scan.next());
        } else if(type.equals(Double.class)) {
            return type.cast(scan.nextDouble());
        } 
        throw new RuntimeException("No se pudo ingresar un numero");
        */
    }
}
