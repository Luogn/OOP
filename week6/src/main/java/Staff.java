public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Javadoc.
     */
    public Staff(String n, String a, String s, double p) {
        super(n, a);
        this.school = s;
        this.pay = p;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String s) {
        this.school = s;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double p) {
        this.pay = p;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + this.school + ",pay=" + this.pay + "]";
    }
}
