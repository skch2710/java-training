package basics;

public class CalculatorApp {
    public static void main(String[] args) {
    	
    	Maths maths = new Maths();
    	Entry entry = new Entry();
    	
//        Scanner scanner = new Scanner(System.in);
        Double firstNumber, secondNumber=0d;
        String operator;

        // Input first number
        System.out.print("Enter the first number: ");
//        firstNumber = scanner.nextDouble();
        firstNumber = entry.acceptDouble();

        // Input operator
        System.out.print("Enter an operator (+, -, *, /,square,cube : ");
        operator = entry.acceptString();

        if( ! operator.equalsIgnoreCase("square") || operator.equalsIgnoreCase("cube")) {
            // Input second number
            System.out.print("Enter the second number: ");
            secondNumber = entry.acceptDouble();
        }

        // Perform operation and display the result
        switch (operator) {
            case "+":
            	maths.add(firstNumber, secondNumber);
                break;
            case "-":
            	maths.substract(firstNumber, secondNumber);
                break;
            case "*":
            	maths.multiplication(firstNumber, secondNumber);
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Error: Cannot divide by zero");
                } else {
                    maths.division(firstNumber, secondNumber);
                }
                break;
            case "square":
            	maths.square(firstNumber);
                break;
            case "cube":
            	maths.cube(firstNumber);
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
    }
}

