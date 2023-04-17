package basics;

import java.text.DecimalFormat;

public class Maths {

	DecimalFormat df = new DecimalFormat("#.00");

	public void add(Double a, Double b) {
		System.out.println("Addition is : " + df.format((a + b)));
	}

	public void substract(Double a, Double b) {
		System.out.println("Substraction is : " + df.format((a - b)));
	}

	public void multiplication(Double a, Double b) {
		System.out.println("Multiplication is : " + df.format((a * b)));
	}

	public void division(Double a, Double b) {
		System.out.println("Division is : " + df.format((a / b)));
	}

	public void square(Double a) {
		System.out.println("Square is : " + Math.pow(a, 2));
	}

	public void cube(Double a) {
		System.out.println("Cube is : " + df.format((a * a * a)));
	}
}
