import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Recursive operation = new Recursive();
        Double number;
        Double base;
        Integer exponent;

        System.out.println("Ingrese la operacion recursiva que desea realizar\n1. Factorial\n2. Suma\n3. Conteo\n4. Realizar potencia");
        System.out.println("5. ");
        switch (scan.nextInt()) {
            case 1:
                System.out.println("Ingrese el factorial de un numero (debe ser positivo)");
                do {
                    number = scan.nextDouble();
                    try {
                        System.out.println(" = " + operation.factorial(number));
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                } while (number <= 0);
                break;
            case 2:
                System.out.println("Ingrese el numero al que le desea aplicar la suma recursiva");
                do {
                    number = scan.nextDouble();
                    try {
                        System.out.println(" = " + operation.addition(number));
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                } while (number <= 0);
                break;
            case 3:
                Integer numb;
                System.out.println("Ingrese el numero al que desea hacer un conteo progresivo");
                do {
                    numb = scan.nextInt();
                    try {
                        System.out.println("n = " + numb);
                        operation.count(numb);
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                } while (numb <= 0);
                break;
            case 4:
            System.out.println("Ingrese primero la base y luego el exponente");
            do {
                base = scan.nextDouble();
                exponent = scan.nextInt();
                try {
                    if (exponent == 1) {
                        System.out.println(" * 1 = " + operation.power(base, exponent));
                    }
                    System.out.println(" = " + operation.power(base, exponent));
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
            } while (exponent < 0);
                break;
            case 5:

                break;

        }
        scan.close();
    }
}
