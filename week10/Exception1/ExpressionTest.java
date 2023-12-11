public class ExpressionTest {
    /**
     * Test.
     */
    public static void main(String[] args) {
        Expression e1 = new Square(new Addition(
            new Addition(new Square(new Numeral(10)), new Numeral(-3)), 
            new Multiplication(new Numeral(4), new Numeral(3)))); 

        System.out.print(e1.toString() + "\n");  
            
        Expression e2 = new Square(new Addition(
            new Addition(new Square(new Numeral(10)), new Numeral(-3)), 
            new Division(new Numeral(4), new Numeral(0))));

        System.out.print(e2.toString());
    }
}
