package Practico2;

public class OrderingTest {
    public <U extends Comparable <U>> void testInsertion(Class <U> type) {
        Ordering<U> insertion = new Ordering<>(type);

        //Carga por teclado la cantidad de elementos que tendrá el array
        U[] randomArray = insertion.generateArray(insertion.arraySize());
        insertion.showArray(randomArray);

        //Cuenta el tiempo en milisegundos actual, antes de empezar a ordenar los datos con el ordenamiento
        long startTime = System.nanoTime();
        insertion.insertionSort(randomArray);

        //Cuenta el tiempo en milisegundos actual, despues de ordenar los datos con el ordenamiento
        long endTime = System.nanoTime();

        /*4. Realizar captura de tiempos para cada uno de los algoritmos de ordenamiento para: a. 100 elementos. b. 1000 elementos. c. 10000 elementos.*/
        //Calcula el tiempo que tardó desde el inicio hasta el final, es decir el tiempo total en ordenar los datos con el ordenamiento
        long elapsedTimeMillis = (endTime - startTime) / 100000;

        insertion.showArray(randomArray);
        System.out.println("Tiempo transcurrido: " + elapsedTimeMillis + "milisegundos.");
    }
}
