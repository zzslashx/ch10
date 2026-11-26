public class FractionDriver {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(22, 52);
        Fraction f2 = new Fraction(12, 32);

        Fraction f6 = new Fraction(80, 11);
        Fraction f7 = new Fraction(6, 7);

        System.out.println(f2);

        System.out.println(f1);

        Fraction quotient = Fraction.vivi(f1, f2);
        System.out.println(quotient);

        Fraction product = Fraction.mult(f2, f2);
        System.out.println(product);

        Fraction f8 = new Fraction(67, 105);
        f8.reduce();
        System.out.println(f8);
    }
}
