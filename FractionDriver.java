public class FractionDriver {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 5);
        Fraction f2 = new Fraction(1, 2);

        System.out.println(f1);
        System.out.println(f2);
//a
        System.out.println(Fraction.GCF(12, 18));
        System.out.println(Fraction.GCF(7, 5));

        System.out.println(Fraction.GCF(f1.getNum(), f1.getDen()));

        Fraction product = Fraction.mult(f1, f2);
        System.out.println(product);

        Fraction quotient = Fraction.vivi(f1, f2);
        System.out.println(quotient);

        System.out.println(product.toDouble());
    }
}
