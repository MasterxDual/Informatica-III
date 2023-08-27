import java.util.InputMismatchException;

public class Recursive {
    /* Escribe una función recursiva que calcule el factorial de un número entero positivo n.
    Por ejemplo, 4! es 1x2x3x4=24. */
    public Double factorial(Double number) throws InputMismatchException {
        if (number == 1) {
            System.out.print(number);
            return 1.0;
        } else if (number <= 0) {
            throw new InputMismatchException("El numero ingresado es negativo o es 0, vuelva a ingresar otro numero");
        } else {
            Double subResult = factorial(number - 1);
            System.out.print(" * " + number);
            return number * subResult;
        }
    }

    /* Escribe una función recursiva que calcule la suma de los primeros n enteros
    positivos. Por ejemplo, n=4 es 1+2+3+4=10. */
    public Double addition(Double number) throws InputMismatchException {
        if (number == 1) {
            System.out.print(number);
            return 1.0;
        } else if (number <= 0) {
            throw new InputMismatchException("Ha ingresado un numero invalido, vuelva a ingresarlo");
        } else {
            Double subResult = addition(number - 1);
            System.out.print(" + " + number);
            return number + subResult;
        }
    }

    /* Escribe una función recursiva que imprima un conteo regresivo desde un número n
    hasta 1. Por ejemplo, n=4 es 4,3,2,1. */
    public void count(Integer number) throws InputMismatchException {
        if(number == 1) {
            System.out.print(number);
        } else if(number <= 0) {
            throw new InputMismatchException("El numero ingresado es invalido, debe ingresar un numero entero distinto de 0");
        } else {
            System.out.print(number + " ");
            count(number - 1);
        }
    }

    /* Escribe una función recursiva que calcule la potencia de un número base elevado a
    un exponente. Por ejemplo, 2^3=2*2*2=8 */
    public Double power(Double base, Integer exponent) throws InputMismatchException, ArithmeticException {
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
            return base * power(base, exponent - 1);
        }
    }

    /* Escriba un método recursivo que calcule el producto de dos números enteros
    usando sumas sucesivas. Por ejemplo, 2x4=2+2+2+2=8 */
    public Integer product(Integer number1, Integer number2) throws InputMismatchException {
        if(number2 == 1) {
            System.out.print(number1);
            return number1;
        } else if(number1 == 0 || number2 == 0) {
            System.out.print(number1 + " * " + number2);
            return 0;
        } else if(number2 < 0) {
            throw new InputMismatchException("Usted ha ingresado un numero invalido, vuelva a ingresarlos");
        } else {
            System.out.print(number1 + " + ");
            return number1 + product(number1, number2 - 1);
        }
    }

    /* Escriba un método recursivo que imprima los elementos de un arreglo en orden
    inverso. */
    public void printInverse(Double[] array, Integer u) {
        if(u != array.length) {
            System.out.print(array[u] + " ");
            printInverse(array, u + 1);
        }
    }

    public void printNormal(Double[] array, Integer v) {
        if(v != 0) {
            System.out.print(array[v - 1] + " ");
            printNormal(array, v - 1);
        }
    }
}
