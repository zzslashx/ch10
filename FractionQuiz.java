import java.util.Scanner;

public class FractionQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int correct = 0;
        int total = 0;
        String input = "";
        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
        System.out.println();
        while (true) {
            Fraction a = new Fraction();
            Fraction b = new Fraction();
            int op = (int) (Math.random() * 4);
            Fraction answer;
            String symbol;
            if (op == 0) {
                answer = Fraction.add(a, b);
                symbol = "+";
            } else if (op == 1) {
                answer = Fraction.subtract(a, b);
                symbol = "-";
            } else if (op == 2) {
                answer = Fraction.mult(a, b);
                symbol = "*";
            } else {
                answer = Fraction.mimi(a, b);
                symbol = "/";
            }

            System.out.print(a + " " + symbol + " " + b + " = ");
            input = in.nextLine();

            if (input.equals("quit")) {
                System.out.println();
                if (total > 0) {
                    Fraction score = new Fraction(correct, total);
                    int percent = (int) Math.round(100.0 * correct / total);
                    System.out.println("You answered " + score + " correctly, for a score of " + percent + " percent");
                }
                return;
            } else {
                Fraction guess = new Fraction(input);
                total++;
                if (guess.equals(answer)) {
                    System.out.println("Correct!");
                    correct++;
                } else {
                    System.out.println("Wrong, the answer was " + answer);
                }
                System.out.println();
            }
        }
    }
}

class Fraction {
    private int numerator, denominator;

    public Fraction() {
        setNum((int) (Math.random() * 9) + 1);
        setDen((int) (Math.random() * 9) + 1);
    }

    public Fraction(int n, int d) {
        setNum(n);
        setDen(d);
    }

    public Fraction(String n) {
        n = n.trim();
        int slash = n.indexOf("/");
        if (slash == -1) {
            numerator = Integer.parseInt(n);
            denominator = 1;
            return;
        }
        numerator = Integer.parseInt(n.substring(0, slash).trim());
        denominator = Integer.parseInt(n.substring(slash + 1).trim());
        if (denominator == 0) {
            denominator = 1;
            System.out.println("Denominator can't be zero");
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

    public static Fraction mimi(Fraction a, Fraction b) {
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

   
    public boolean equals(Fraction f) {
        return numerator == f.numerator && denominator == f.denominator;
    }

 
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
        return (double) numerator / denominator;
    }

   
    public void setNum(int n) {
        numerator = n;
    }

    public void setDen(int d) {
        if (d != 0)
            denominator = d;
        else {
            denominator = 1;
            System.out.println(" Denominator can't be zero");
        }
    }

    public void reduce() {
        int g = GCF(numerator, denominator);
        numerator = numerator / g;
        denominator = denominator / g;
    }

    public static int GCF(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0) return b;
        if (b == 0) return a;
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }
}
