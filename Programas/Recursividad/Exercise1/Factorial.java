package Exercise1;

import java.util.InputMismatchException;

public class Factorial {
    private Double num;

    public Factorial() {

    }

    public Factorial(Double num) {
        this.num = num;
    }

    public Double recursive(Double num) throws InputMismatchException {
        if(num == 1) {
            System.out.print(num);
            return 1.0;
        } else  {
            Double subResult = recursive(num - 1);
            System.out.print(" * " + num);
            return num * subResult;
        }
    }
}
