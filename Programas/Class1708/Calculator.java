package Class1708;
import java.util.InputMismatchException;
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

    public Double division(Double num1, Double num2) throws DivisionByZeroException {
        if(num2 == 0) {
            throw new DivisionByZeroException("No se puede dividir por cero", 404);
        } else {
            return (num1/num2);
        }
    }

    public String inputNumber() {
        Scanner scan = new Scanner(System.in);
        String inputNumber;

        System.out.println("Ingrese el numero");  
        inputNumber = scan.nextLine();
        
        return inputNumber;
    }
}