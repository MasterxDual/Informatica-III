package Ordenamiento;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Quicksort2 {
    public static void main(String[] args) {
        char[] array = new char[arraySize()];

        Random random = new Random();
        array[array.length] = {'a', 'b', 'c', 'd', 'e'};
        //Main.showArray(array);
        
        long startTime = System.nanoTime();

        quickSort(array, 0, array.length-1);
        long endTime = System.nanoTime();
        
        long elapsedTimeMillis = (endTime - startTime) / 100000;
        
        Insertion.showArray(array);
        System.out.println("Tiempo transcurrido: " + elapsedTimeMillis + "milisegundos.");
        


    }

    public static void showArray(Integer[] array) {
        for (Integer integer : array) {
            System.out.print(integer + " ");
        } 
    }

    public static Integer arraySize() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros del array");
        return scan.nextInt();
    }
    
    public static void quickSort(Integer[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(Integer[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    public static void swap(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
