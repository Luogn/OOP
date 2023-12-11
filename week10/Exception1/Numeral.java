public class Numeral extends Expression {
    private double value;
    
    public Numeral(){

    }

    public Numeral(double value) {
        this.value = value;
    }
    
    public String toString() {
        return String.valueOf((int) value);
    }

    public double evaluate() {
        return this.value;
    }
}
