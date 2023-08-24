package Exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double num;

        System.out.println("Ingrese el numero al que le desea aplicar la suma recursiva");
        do {
            num = scan.nextDouble();
            try {
                if(num <= 0) {
                    throw new InputMismatchException("Ha ingresado un numero invalido, vuelva a ingresarlo");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while(num <= 0);
        System.out.println(" = " + recursive(num));
        
        scan.close();
    }

    public static Double recursive(Double num) throws InputMismatchException{
        if(num == 1) {
            System.out.print(num);
            return 1.0;
        } else {
            Double subResult = recursive(num - 1);
            System.out.print(" + " + num);
            return num + subResult;
        }
    }
}
