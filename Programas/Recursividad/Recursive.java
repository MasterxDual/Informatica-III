import java.util.InputMismatchException;

public class Recursive {
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
}
