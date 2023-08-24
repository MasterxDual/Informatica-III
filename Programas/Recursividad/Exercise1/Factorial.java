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
        if(num == 1 || num == 0) {
            return 1.0;
        } else  {
            System.out.print(num + "*" + recursive(num-1));
            return num * recursive(num-1);
        }
    }
}
