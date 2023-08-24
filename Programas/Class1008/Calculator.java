package Class1008;
import java.util.Scanner;


public class Calculator {
    private Double num1;
    private Double num2;
    
    public Calculator() {

    }

    public Calculator(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
        
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double getNum1() {
        return num1;
    }

    public Double getNum2() {
        return num2;
    }

    public Double sum(Double num1, Double num2) {
        return num1 + num2;
    }

    public Double substraction(Double num1, Double num2) {
        return num1 - num2;
    }

    public Double multiplication(Double num1, Double num2) {
        return num1 * num2;
    }

    public void division(Double num1, Double num2) {
        if(num2 == 0) {
            System.err.println("El segundo numero ingresado debe ser distinto de cero");
        } else {
            System.out.println("La division es igual a " + (num1/num2));
        }
    }

    public Double inputNumber() {
        Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese el numero");
            return (scan.nextDouble());
    }
}