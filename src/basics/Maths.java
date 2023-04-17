package basics;

import java.text.DecimalFormat;

public class Maths {
	
	DecimalFormat df = new DecimalFormat("#.00");
	
	public void add(Double a,Double b) {
		System.out.println( "Addition is : "+ df.format((a+b)) );
	}
	
	public void substract(Double a,Double b) {
		System.out.println( "Substraction is : "+ df.format((a-b)) );
	}

	public void multiplication(Double a,Double b) {
		System.out.println( "Multiplication is : "+ df.format((a*b)) );
	}
	
	public void division(Double a,Double b) {
		System.out.println( "Division is : "+ df.format((a/b)) );
	}
}
