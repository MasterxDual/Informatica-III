package Exercise2;

public class Addition {
    public Addition() {

    }

    public Double recursive(Double num) {
        if(num == 1) {
            return 1.0;
        } else {
            return num + recursive(num - 1);
        }
    }
}
