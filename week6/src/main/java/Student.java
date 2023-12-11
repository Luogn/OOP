class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Javadoc.
     */
    public Student(String n, String a, String p, int y, double f) {
        super(n, a);
        this.program = p;
        this.year = y;
        this.fee = f;
    }

    String getProgram() {
        return program;
    }

    void setProgram(String p) {
        this.program = p;
    }

    int getYear() {
        return this.year;
    }

    void setYear(int y) {
        this.year = y;
    }

    double getFee() {
        return this.fee;
    }

    public void setFee(double f) {
        this.fee = f;
    }

    public String toString() {
        return "Student[" + super.toString() + ",program="
                + this.program + ",year=" + this.year + ",fee=" + this.fee + "]";

    }
}
