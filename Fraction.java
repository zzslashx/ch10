public class Fraction {
    // Instance Variables (attributes, fields)
    private int numerator, denominator;

    // Constructor
    public Fraction() { // default
        setNum(1);
        setDen(1);
    }
    public Fraction(int n, int d) { // parametertized constructor
        setNum(n);
        setDen(d);
        if (d != 0)
            denominator = d;
        else {
            denominator = 1;
            System.out.println("Error: Denominator can't be zero");
        }
    }

    public Fraction(String n) {
        int slash = n.indexOf("/");

        numerator = Integer.parseInt(n.substring(0, slash));
        denominator = Integer.parseInt(n.substring(slash + 1));
        System.out.println(numerator + "/" + denominator);
        if (denominator == 0) {
            denominator = 1;
            System.out.println("Error: Denominator can't be zero");
        }
    }
    public Fraction(Fraction f) {
        numerator = f.numerator;
        denominator = f.denominator;
    }
   
    public static Fraction mult(Fraction a, Fraction b) {
        Fraction result = new Fraction(a.numerator * b.numerator, a.denominator * b.denominator);
        result.reduce();
        return result;
    }

    public static Fraction vivi(Fraction a, Fraction b) {
        Fraction result = new Fraction(a.numerator * b.denominator, a.denominator * b.numerator);
        result.reduce();
        return result;
    }

    public static Fraction add(Fraction a, Fraction b) {
        Fraction result = new Fraction(a.numerator * b.denominator + b.numerator * a.denominator, a.denominator * b.denominator);
        result.reduce();
        return result;
    }

    public static Fraction subtract(Fraction a, Fraction b) {
        Fraction result = new Fraction(a.numerator * b.denominator - b.numerator * a.denominator, a.denominator * b.denominator);
        result.reduce();
        return result;
    }

    // Behaviour Methods(accessor, mutator, helper)

    // accessor methods
    public int getNum() {
        return numerator;
    }
    public int getDen() {
        return denominator;
    }
    public String toString() {
        return numerator + "/" + denominator;
    }
    public double toDouble() {
        return numerator / denominator;
    }
    // mutator mehtods
    public void setNum(int n) {
        numerator = n;
    }
    public void setDen(int d) {
        denominator = d;
        if (d != 0)
            denominator = d;
        else {
            denominator = 1;
            System.out.println("Error: Denominator can't be zero");
        }
    }
    public void reduce() {
        int g = GCF(numerator, denominator);
        numerator = numerator / g;
        denominator = denominator / g;
    }

    public static int GCF(int a, int b) {
        int difference = Integer.MAX_VALUE;
        while (difference > 0) {
            if (a > b) {
                a = a - b;
            } else if (b > a) {
                b = b - a;
            } else if (a == b)
                difference = 0;
            difference = Math.abs(a - b);
        }
        return a;
    }
}
