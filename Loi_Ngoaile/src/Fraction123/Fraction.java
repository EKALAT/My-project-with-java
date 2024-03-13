package Fraction123;

public class Fraction<denominator> {
    private int numerator, denominator;
    public <denominator> Fraction(int n, int d ) throws ArithmeticException{
        if (d==0)
            throw new ArithmeticException();
        numerator = n; denominator = d;
    }
}
class TestException2{
    public static void main(String[]args){
        Fraction f = new Fraction (2,0);
    }
}
