package Exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Escribe una función recursiva que calcule el factorial de un número entero positivo n.
Por ejemplo, 4! es 1x2x3x4=24.*/
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Factorial number = new Factorial();
        Double num1;
        System.out.println("Ingrese el factorial de un numero (debe ser positivo)");

        do {
            num1 = scan.nextDouble();
            try {
                System.out.println(" = " + number.recursive(num1));
            } catch(InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while(num1 <= 0);
        
        scan.close();
    }
}