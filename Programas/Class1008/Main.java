package Class1008;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);        
        int operation;
        do {
            System.out.println("Ingrese la operacion deseada (Suma: 1, Resta: 2, Multiplicacion: 3, Division: 4, Salir: 5");
            operation = scan.nextInt();
            switch(operation) {
                case 1:
                    System.out.println(calc.sum(calc.inputNumber(), calc.inputNumber()));
                    break;
                case 2:
                    System.out.println(calc.substraction(calc.inputNumber(), calc.inputNumber()));
                    break;
                case 3:
                    System.out.println(calc.multiplication(calc.inputNumber(), calc.inputNumber()));
                    break;
                case 4: 
                    calc.division(calc.inputNumber(), calc.inputNumber());
                    break;
            }
        } while(operation != 5);
        scan.close();
    }
}
