public class Fraction{
	//Instance Variables (attributes, fields)
	private int numerator, denominator;
	
	
	//Constructor
	public Fraction(){ //default
		numerator = 1;
		denominator = 1;
		
		
	}
	public Fraction(int n, int d){ //parametertized constructor
		numerator = n;
		denominator=d;
		if(d!=0) denominator = d;
		else{
			denominator = 1;
			System.out.println("Error: Denominator can't be zero");
			}
	}
	
	//Behaviour Methods
	
	}
 
