import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Escribe una función recursiva que calcule la potencia de un número base elevado a
un exponente. Por ejemplo, 2^3=2*2*2=8*/

public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double num1;
        Integer num2;

        System.out.println("Ingrese primero la base y luego el exponente");
        do {
            num1 = scan.nextDouble();
            num2 = scan.nextInt();
            try {
                if (num2 == 1) {
                    System.out.println(" * 1 = " + recursive(num1, num2));
                }
                System.out.println(" = " + recursive(num1, num2));
            } catch (InputMismatchException | ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (StackOverflowError e) {
                /* final String os = System.getProperty("os.name");
                if (os.contains("Windows")) {
                    try {
                        Runtime.getRuntime().exec("cls");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                } Ignorar este comentario, no es parte del programa*/
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.err.println("Fuera de rango");
            }
        } while (num2 < 0);

    }

    public static Double recursive(Double base, Integer exponent) throws InputMismatchException, ArithmeticException {
        if (exponent == 0) {
            if (base != 0) {
                System.out.print(base + " ^ 0");
                return 1.0;
            }
            throw new ArithmeticException("Resultado indeterminado");
        } else if (exponent < 0) {
            throw new InputMismatchException("Base o exponente invalidos, ingrese otros valores");
        } else if (exponent == 1) {
            System.out.print(base);
            return base;
        } else {
            System.out.print(base + " * ");
            return base * recursive(base, exponent - 1);
        }
    }
}
