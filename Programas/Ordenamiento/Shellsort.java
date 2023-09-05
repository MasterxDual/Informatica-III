package Ordenamiento;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Shellsort {
    public static void main(String[] args) {
        Integer[] randomArray = new Integer[arraySize()];
        
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(10);
        }
        //Main.showArray(randomArray);
        
        long startTime = System.nanoTime();

        for (int gap = randomArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < randomArray.length; i++) {
                int temp = randomArray[i];
                int j;
                
                for (j = i; j >= gap && randomArray[j - gap] > temp; j -= gap) {
                    randomArray[j] = randomArray[j - gap];
                }

                randomArray[j] = temp;
            }
        }
        long endTime = System.nanoTime();
        
        long elapsedTimeMillis = (endTime - startTime) / 100000;
        
        Insertion.showArray(randomArray);
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
}
