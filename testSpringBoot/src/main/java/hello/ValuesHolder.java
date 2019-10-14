package hello;

public class ValuesHolder {

    private int firstValue;
    private int secondValue;
    private int multiplication;


    public int getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(int multiplication) {
        this.multiplication = multiplication;
    }

    public ValuesHolder(int firstValue, int  secondValue) {
        this.secondValue = secondValue;
        this.firstValue = firstValue;
        this.multiplication = secondValue*firstValue;

    }

    public int getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

}
