package Class1708;

public class Record {
    private Double num1;
    private Double num2;
    private Double result;
    private String operation;

    public Record(Double num1, Double num2, Double result, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.operation = operation;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double getNum2() {
        return num2;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Double getResult() {
        return result;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    @Override 
    public String toString() {
        String myString1 = this.getNum1().toString();
        String myString2 = this.getNum2().toString();

        return addTabs(myString1) + this.getOperation() + "\t" +
        addTabs(myString2) + "  =  \t" + this.getResult();
    }

    private String addTabs(String myString) {
        if(myString.length() < 8) {
            return myString.concat("\t\t");
        } else if(myString.length() < 16) {
            return myString.concat("\t");
        } else {
            return myString;
        }
    }
}