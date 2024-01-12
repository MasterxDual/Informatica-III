import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Recursive operation = new Recursive();
        Double number;
        Double base;
        Double[] array;
        Integer exponent;
        Integer number1;
        Integer number2;
        Integer t;

        System.out.println("Ingrese la operacion recursiva que desea realizar\n1. Factorial\n2. Suma\n3. Conteo\n4. Realizar potencia");
        System.out.println("5. Producto\n6. Imprimir arreglo\n7. Imprimir cantidad de unos que tiene el numero ingresado en representacion binaria");
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
                System.out.println("Ingrese dos numeros a los cuales desea multiplicar");
                do {
                    number1 = scan.nextInt();
                    number2 = scan.nextInt();
                    try {   
                        if(number2 >= 0) {
                            System.out.print(number1 + " X " + number2 + " = ");
                        }
                        System.out.println(" = " + operation.product(number1, number2));
                    } catch(InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                } while(number2 < 0);
                break;
            case 6:
                try {
                    System.out.println("Ingrese de cuantos elementos quiere que sea su arreglo");
                    t = scan.nextInt();
                    array = new Double[t];

                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Ingrese el elemento " + (i + 1) + ": ");
                        array[i] = scan.nextDouble();
                    }

                    System.out.println("Orden normal, otra opcion:");
                    operation.printNormal2(array, t - 1);

                    System.out.println("Orden normal:");
                    operation.printNormal(array, t);

                    System.out.println("\nOrden inverso:");
                    operation.printInverse(array, 0);
                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                } catch (NegativeArraySizeException e) {
                    System.err.println("No puede ingresar un valor negativo");
                }
                break;
            case 7:
                System.out.println("Ingrese el numero que desea convertir a binario");
                t = scan.nextInt();
                System.out.println("La cantidad de unos que tiene el numero " + t + " es igual a " + operation.binary(t));
                System.out.println("Numero binario invertido opcion 2:");
                operation.printInverseBinary2(t);
                System.out.println("\nNumero binario invertido:");
                operation.printInverseBinary(t);
        }
        scan.close();
    }
}
