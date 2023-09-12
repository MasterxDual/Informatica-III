package Practico2;

public class OrderingTest {
    public <U extends Comparable <U>> void testOrdering(Class <U> type, int option) {
        Ordering<U> orderer = new Ordering<>(type);

        //Carga por teclado la cantidad de elementos que tendrá el array
        U[] randomArray = orderer.generateArray(orderer.arraySize());
        orderer.showArray(randomArray);

        //Cuenta el tiempo en milisegundos actual, antes de empezar a ordenar los datos con el ordenamiento
        long startTime = System.nanoTime();

        if(option == 1) {
            System.out.println("Insertion sort");
            orderer.insertionSort(randomArray);
        } else if(option == 2) {
            System.out.println("Shellsort");
            orderer.shell(randomArray, randomArray.length);
        } else if(option == 3) {
            System.out.println("Quicksort");
            orderer.quickSort(randomArray, 0, randomArray.length - 1);
        }

        //Cuenta el tiempo en milisegundos actual, despues de ordenar los datos con el ordenamiento
        long endTime = System.nanoTime();

        /*4. Realizar captura de tiempos para cada uno de los algoritmos de ordenamiento para: a. 100 elementos. b. 1000 elementos. c. 10000 elementos.*/
        //Calcula el tiempo que tardó desde el inicio hasta el final, es decir el tiempo total en ordenar los datos con el ordenamiento
        long elapsedTimeMillis = (endTime - startTime) / 100000;

        orderer.showArray(randomArray);
        System.out.println("Tiempo transcurrido: " + elapsedTimeMillis + "milisegundos.");
    }
}
