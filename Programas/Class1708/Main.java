package Class1708;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);   
        List<Record> historico = new ArrayList<>();
        Double number1;
        Double number2;
        Double resultado;
        String operacion;
        Record historial;
        int operation = -1;

        do {
            
            try {
                System.out.println("Ingrese la operacion deseada (Suma: 1, Resta: 2, Multiplicacion: 3, Division: 4, Ver Historial: 5, Salir: 0");
                operation = scan.nextInt();
            } catch(InputMismatchException e) {
                System.err.println(e.getMessage());
                scan.next();
            }

            switch(operation) {
                case 1:
                    try {
                        number1 = Double.parseDouble(calc.inputNumber());
                        number2 = Double.parseDouble(calc.inputNumber());
                        resultado = calc.sum(number1, number2);
                        operacion = "+";
                        historial = new Record(number1, number2, resultado, operacion);
    
                        System.out.println(resultado);
                        historico.add(historial);
                    } catch(NumberFormatException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        number1 = Double.parseDouble(calc.inputNumber());
                        number2 = Double.parseDouble(calc.inputNumber());
                        resultado = calc.substraction(number1, number2);
                        operacion = "-";
                        historial = new Record(number1, number2, resultado, operacion);
    
                        System.out.println(resultado);
                        historico.add(historial);
                    } catch(NumberFormatException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        number1 = Double.parseDouble(calc.inputNumber());
                        number2 = Double.parseDouble(calc.inputNumber());
                        resultado = calc.multiplication(number1, number2);
                        operacion = "*";
                        historial = new Record(number1, number2, resultado, operacion);
    
                        System.out.println(resultado);
                        historico.add(historial);
                    } catch(NumberFormatException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4: 
                try {
                    number1 = Double.parseDouble(calc.inputNumber());
                    number2 = Double.parseDouble(calc.inputNumber());
                    resultado = calc.division(number1, number2);
                    operacion = "/";
                    historial = new Record(number1, number2, resultado, operacion);
                    
                    System.out.println(resultado);
                    historico.add(historial);
                } catch (DivisionByZeroException d) {
                    System.err.println(d.getMessage());
                    System.err.println(d.getError());
                } catch(NumberFormatException e) {
                    System.err.println(e.getMessage());
                }
                break;
                case 5:
                if(historico.isEmpty()) {
                    System.out.println("No hay nada en el historial");
                    break;
                }
                System.out.println("Number1 " +"\t\t" + "Number2 " + "\t\t" +  "Result");
                for (Record record : historico) {
                    System.out.println(record);
                }
                break;
            }
        } while(operation != 0);
        scan.close();
    }
}
