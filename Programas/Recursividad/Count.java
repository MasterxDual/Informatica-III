import java.util.InputMismatchException;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer number;        
        do {
            number = scan.nextInt();
            try {
                System.out.println("n = " + number);
                recursive(number);
            } catch(InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while(number <= 0);
    }

    public static void recursive(Integer number) throws InputMismatchException {
        if(number == 1) {
            System.out.print(number);
        } else if(number <= 0) {
            throw new InputMismatchException("El numero ingresado es invalido, debe ingresar un numero entero distinto de 0");
        } else {
            System.out.print(number + " ");
            recursive(number - 1);
        }
    }
}
