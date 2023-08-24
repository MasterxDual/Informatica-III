package Class1708;
import java.lang.Exception; 

public class DivisionByZeroException extends Exception {
    private Integer error;
    
    public DivisionByZeroException(String message) {
        super(message);
    }

    public DivisionByZeroException(String message, Integer error) {
        super(message);
        this.error = error;
    }

    public Integer getError() {
        return this.error;
    }
    
}
