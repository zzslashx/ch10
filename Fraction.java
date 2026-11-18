public class Fraction{
	//Instance Variables (attributes, fields)
	private int numerator, denominator;
	
	
	//Constructor
	public Fraction(){ //default
		setNum(1);
		setDen(1);
		
	}
	public Fraction(int n, int d){ //parametertized constructor
		setNum(n);
		setDen(d);
		if(d!=0) denominator = d;
		else{
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
public Fraction(Fraction f){
	numerator = f.numerator;
	denominator = f.denominator;
	}

	//Behaviour Methods(accessor, mutator, helper)
	
	//accessor methods
	public int getNum(){
		return numerator;
		}
	public int getDen(){
		return denominator;
		}
	public String toString(){
		return numerator + "/" + denominator;
		}
	public double toDouble(){
		return numerator / denominator;
		}
	//mutator mehtods
	public void setNum(int n){
		numerator = n;
		}
	public void setDen(int d){
		denominator=d;
		if(d!=0) denominator = d;
		else{
			denominator = 1;
			System.out.println("Error: Denominator can't be zero");
			}
		}
	}
 
